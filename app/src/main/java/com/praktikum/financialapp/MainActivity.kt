package com.praktikum.financialapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.Fragment
import com.praktikum.financialapp.home.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnHome : Button
    private lateinit var btnProfile : Button
    private lateinit var btnSettings : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHome = findViewById(R.id.btn_home)
        btnProfile = findViewById(R.id.btn_profile)
        btnSettings = findViewById(R.id.btn_settings)

//        btnHome.setOnClickListener {
//            val intent = Intent(this, HomeActivity::class.java)
//            intent.putExtra("username","johan")
//            startActivity(intent)
//        }
        btnHome.setOnClickListener {
            loadFragment(HomeFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }
}