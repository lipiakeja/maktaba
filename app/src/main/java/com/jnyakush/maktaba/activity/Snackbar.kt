package com.jnyakush.maktaba.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jnyakush.maktaba.R
import com.jnyakush.maktaba.viewutils.action
import com.jnyakush.maktaba.viewutils.snackbar
import com.jnyakush.maktaba.viewutils.toast
import kotlinx.android.synthetic.main.activity_snackbar.*

class Snackbar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)

        // How to handle normal snackbar
        normal_snackbar.setOnClickListener {
            layout_snackbar.snackbar("Hello World")
        }

        //How to handle snackbar with
        action_snackbar.setOnClickListener {
            //.action(R.string.ok){}
            layout_snackbar.snackbar("Add Permissions").action("Ok"){
                toast("Action ok Clicked")
            }
        }
    }
}
