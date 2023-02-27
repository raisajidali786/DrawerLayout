package com.codewsa.drawerlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val navView = findViewById<NavigationView>(R.id.nav_view)

        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home ->{
                    drawerLayout.closeDrawer(GravityCompat.START)
                    Toast.makeText(this,"Home",Toast.LENGTH_SHORT).show()
                }
                R.id.gallery ->{
                    drawerLayout.closeDrawer(GravityCompat.START)
                    Toast.makeText(this,"Gallery",Toast.LENGTH_SHORT).show()
                }
                R.id.setting ->{
                    drawerLayout.closeDrawer(GravityCompat.START)
                    Toast.makeText(this,"Setting",Toast.LENGTH_SHORT).show()
                }
            }
            true
        }

    }
}