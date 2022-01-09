package com.example.myretrofit2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.myretrofit2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    var binding : ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
//    var view = binding.root

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("onCreate","ENTER")

        findViewById<Button>(R.id.btn).setOnClickListener {
            var intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart","ENTER")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume","ENTER")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause","ENTER")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop","ENTER")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart","ENTER")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy","ENTER")
    }
}