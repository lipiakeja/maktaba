package com.jnyakush.maktaba.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.jnyakush.maktaba.R
import com.jnyakush.maktaba.viewutils.hide
import com.jnyakush.maktaba.viewutils.show
import kotlinx.android.synthetic.main.fragment_visibility.*


class Visibility : Fragment(R.layout.fragment_visibility) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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
