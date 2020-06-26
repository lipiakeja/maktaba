package com.jnyakush.maktaba.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jnyakush.maktaba.R
import com.jnyakush.maktaba.viewutils.toast
import com.jnyakush.maktaba.viewutils.toastStr
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast_activity.setOnClickListener {
            startActivity(Intent(this, Toast::class.java))
        }

        snackbar_activity.setOnClickListener {
            startActivity(Intent(this, Snackbar::class.java))
        }
        
        visiblity.setOnClickListener {
            startActivity(Intent(this, Visibility::class.java))
        }

    }
}
