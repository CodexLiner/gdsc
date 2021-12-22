package com.gdscAssign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class home_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this , MainActivity::class.java)
        startActivity(intent)
    }
}