package cl.ivanmoya.navigationjetpacklatam.navigation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import cl.ivanmoya.navigationjetpacklatam.R
import kotlinx.android.synthetic.main.fragment_home.*
import kotlin.LazyThreadSafetyMode.NONE

class Home : Fragment() {

    private val title by lazy(NONE) { arguments?.getString("title") ?: "" }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        homeFragmentLabel.text = title

        openGraphNotification.setOnClickListener {
            it.findNavController().navigate(R.id.action_actionHome_to_navigation_notification)
        }
    }
}
