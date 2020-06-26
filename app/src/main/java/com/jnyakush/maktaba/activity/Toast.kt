package com.jnyakush.maktaba.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jnyakush.maktaba.R
import com.jnyakush.maktaba.viewutils.toast
import com.jnyakush.maktaba.viewutils.toastStr
import kotlinx.android.synthetic.main.activity_toast.*


class Toast : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        //Normal Toast  button click listener
        toast.setOnClickListener {
            toast("Hello world")
        }

        // Toast with string resource button listener
        toast_str.setOnClickListener {
            toastStr(R.string.app_name)
        }

    }
}
