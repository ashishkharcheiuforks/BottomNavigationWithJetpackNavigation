package cl.ivanmoya.navigationjetpacklatam.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import cl.ivanmoya.navigationjetpacklatam.R
import cl.ivanmoya.navigationjetpacklatam.navigation.managerbottomnav.BottomNavController
import cl.ivanmoya.navigationjetpacklatam.navigation.managerbottomnav.setUpNavigation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),
    BottomNavController.NavGraphProvider {

    private val navController by lazy(LazyThreadSafetyMode.NONE) {
        Navigation.findNavController(this, R.id.mainNavigationFragment)
    }

    private val bottomNavController by lazy(LazyThreadSafetyMode.NONE) {
        BottomNavController(
            this,
            R.id.mainNavigationFragment,
            R.id.navigation_home
        )
    }

    override fun getNavGraphId(itemId: Int) = when (itemId) {
        R.id.navigation_home -> R.navigation.navigation_home
        R.id.navigation_dashboard -> R.navigation.navigation_root_dashboard
        R.id.navigation_notification -> R.navigation.navigation_notification
        else -> R.navigation.navigation_home
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavController.setNavGraphProvider(this)
        bottomNavigationView.setUpNavigation(bottomNavController)
        if (savedInstanceState == null) {
            bottomNavController.onNavigationItemSelected()
        } else {
            val arrayData = savedInstanceState?.getIntegerArrayList("dataNavigation")
            bottomNavController.navigationBackStack = arrayData as BottomNavController.BackStack
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putIntegerArrayList("dataNavigation", bottomNavController.navigationBackStack)
    }

    override fun onSupportNavigateUp(): Boolean = navController
        .navigateUp()

    override fun onBackPressed() = bottomNavController.onBackPressed()
}