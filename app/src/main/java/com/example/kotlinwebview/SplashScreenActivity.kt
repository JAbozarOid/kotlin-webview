package com.example.kotlinwebview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // 3000 means 3 seconds
        Timer().schedule(3000) {
            val intent = Intent(applicationContext,WebViewActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
