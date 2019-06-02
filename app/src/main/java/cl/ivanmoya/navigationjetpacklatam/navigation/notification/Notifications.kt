package cl.ivanmoya.navigationjetpacklatam.navigation.notification

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import cl.ivanmoya.navigationjetpacklatam.R
import kotlinx.android.synthetic.main.fragment_notifications.*
import kotlin.LazyThreadSafetyMode.NONE

class Notifications : Fragment() {

    private val title by lazy(NONE) { arguments?.getString("title") ?: "" }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_notifications, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        notificationsFragmentLabel.text = title
        openNotificationDetailsButton.setOnClickListener {
            val action = NotificationsDirections.actionNotificationsToNotificationDetails2()
            val navController = Navigation.findNavController(view)
            navController.navigate(action)
        }
    }
}