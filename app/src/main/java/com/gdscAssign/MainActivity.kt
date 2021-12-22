package com.gdscAssign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.transition.Visibility
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.Toast
import com.google.firebase.FirebaseApp
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.guestbtn)
        val pBAr = findViewById<ProgressBar>(R.id.pbar)
        val mainLayout = findViewById<RelativeLayout>(R.id.MainLayout)
        btn.setOnClickListener(View.OnClickListener {
            mainLayout.visibility = RelativeLayout.GONE
            pBAr.visibility = ProgressBar.VISIBLE

            Handler().postDelayed({
                val intent = Intent(this , home_activity::class.java)
                startActivity(intent)
                finish()
            }, 2000)


        })
    }
}