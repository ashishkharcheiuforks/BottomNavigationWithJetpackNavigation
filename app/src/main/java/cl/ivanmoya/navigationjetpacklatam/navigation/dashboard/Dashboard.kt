package cl.ivanmoya.navigationjetpacklatam.navigation.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import cl.ivanmoya.navigationjetpacklatam.R
import kotlinx.android.synthetic.main.fragment_dashboard.*
import kotlin.LazyThreadSafetyMode.NONE

class Dashboard : Fragment() {

    private val title by lazy(NONE) { arguments?.getString("title") ?: "" }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        if (resources.getBoolean(R.bool.isTablet)) {
            dashboardOpenDetail.visibility = View.GONE
        } else {
            dashboardOpenDetail.visibility = View.VISIBLE
            dashboardOpenDetail.setOnClickListener {
                it.findNavController().navigate(R.id.navigation_dashboard_details)
            }
        }

        openNavigationNotification.setOnClickListener {
            it.findNavController().navigate(R.id.navigation_notification)
        }
    }
}
