package com.jnyakush.maktaba.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.jnyakush.maktaba.R
import com.jnyakush.maktaba.viewutils.action
import com.jnyakush.maktaba.viewutils.snackbar
import com.jnyakush.maktaba.viewutils.toast
import kotlinx.android.synthetic.main.fragment_snackbar.*
import kotlinx.android.synthetic.main.fragment_snackbar.view.*


class Snackbar : Fragment(R.layout.fragment_snackbar) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //normal snackbar
        normal_snackbar.setOnClickListener {
            view.layout_snackbar.snackbar("Hello world")
        }

        //snackbar with action
        action_snackbar.setOnClickListener {
            view.layout_snackbar.snackbar("Action Ok Clicked").action("ok"){
                context?.toast("Ok Clicked")
            }
        }

    }
}
