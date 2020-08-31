package com.snstrain.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_1.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.framLayout,onefragment())
                .commit()
        }
        btn_2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.framLayout,twofragment())
                .commit()
        }
        btn_3.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.framLayout,threefragment())
                .commit()
        }


    }
}
