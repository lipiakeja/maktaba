package com.jnyakush.maktaba.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jnyakush.maktaba.R
import com.jnyakush.maktaba.viewutils.hide
import com.jnyakush.maktaba.viewutils.show
import kotlinx.android.synthetic.main.activity_visibility.*

class Visibility : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visibility)

        //hiding stuff from view with Gone
        hide.setOnClickListener {
            text.hide()
        }

        //showing stuff that is gone or invisible
        show.setOnClickListener {
           text.show()
        }
    }
}
