package cl.ivanmoya.navigationjetpacklatam.navigation.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import cl.ivanmoya.navigationjetpacklatam.R
import kotlinx.android.synthetic.main.fragment_dashboard_details.*

class DashboardDetails : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        openDeashboard2.setOnClickListener {
            it.findNavController().navigate(R.id.action_dashboard_details_to_dashboardDetails)
        }

        openNotificationDetail.setOnClickListener {
            it.findNavController().navigate(R.id.action_dashboard_details_to_notificationDetails)
        }

    }
}
