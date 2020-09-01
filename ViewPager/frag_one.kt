package com.snstrain.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.one.*

class frag_one : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.one,container,false)
        var textView = view.findViewById<TextView>(R.id.textView1)
        textView.setText("11111111111111111111111111111")
        return view

    }



}