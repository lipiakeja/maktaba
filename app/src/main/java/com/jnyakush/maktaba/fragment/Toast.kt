package com.jnyakush.maktaba.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.jnyakush.maktaba.R
import com.jnyakush.maktaba.viewutils.toast
import com.jnyakush.maktaba.viewutils.toastStr
import kotlinx.android.synthetic.main.fragment_toast.*


class Toast : Fragment(R.layout.fragment_toast) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        //Normal Toast  button click listener
        toast.setOnClickListener {
            context?.toast("Hello World")
        }

        // Toast with string resource button listener
        toast_str.setOnClickListener {
            context?.toastStr(R.string.app_name)
        }
    }

}
