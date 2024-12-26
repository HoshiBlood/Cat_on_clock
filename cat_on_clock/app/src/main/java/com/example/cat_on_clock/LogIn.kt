package com.example.cat_on_clock

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.analytics

private lateinit var firebaseAnalytics: FirebaseAnalytics

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login)
        firebaseAnalytics = Firebase.analytics

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    object Firebase {
        lateinit var analytics: FirebaseAnalytics
    }

    fun  textView7(view: View) {
        val intent = Intent(this, Registration::class.java)
        startActivity(intent)
    }
    fun  textView2(view: View) {
        val intent = Intent(this, Calendar::class.java)
        startActivity(intent)
    }

}