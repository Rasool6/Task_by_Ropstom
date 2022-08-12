package com.photo.task_by_ropstam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.photo.task_by_ropstam.activities.CartActivity
import com.photo.task_by_ropstam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingMain:ActivityMainBinding
    lateinit var navHostFragment: NavHostFragment
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain=ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)
        navHostFragment =  supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        //        init nav controlar
        navController = navHostFragment.navController
        navController.navigate(R.id.homeFragment)


        //        bottom nav click listenrs
        botomNave()



    }

    private fun botomNave() {

        bindingMain.bottomNav.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.homeMenuId -> {
//                    navigate to home fragment
                    navController.navigate(R.id.homeFragment)
                    return@setOnNavigationItemReselectedListener
                }
                R.id.productsMenuId -> {
                    //                    navigate to home fragment
                    navController.navigate(R.id.homeFragment)
                    return@setOnNavigationItemReselectedListener
                }
                R.id.cartMenuId -> {
                    //                  intent to cart activity
                    startActivity(Intent(this,CartActivity::class.java))
                    //  return@setOnNavigationItemReselectedListener
                }
                R.id.profileMenuId -> {
                    //                    navigate to home fragment
                    navController.navigate(R.id.homeFragment)
                    return@setOnNavigationItemReselectedListener
                }
            }
        }

    }
}