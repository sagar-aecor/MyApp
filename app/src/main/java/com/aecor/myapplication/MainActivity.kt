package com.aecor.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.aecor.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtPackageName.text = "${getString(R.string.app_name)}\n$packageName"
        binding.txtBaseUrl.text = BuildConfig.SERVER_URL

    }
}