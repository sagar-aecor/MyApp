package com.aecor.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*
import me.leolin.shortcutbadger.ShortcutBadger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtPackageName.text = "${getString(R.string.app_name)}\n$packageName"

        ConnectivityWatcher(this).observe(this, Observer {
            Toast.makeText(this, "INTERNET AVAILABLE? $it", Toast.LENGTH_SHORT).show()
        })
    }
}