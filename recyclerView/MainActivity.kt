package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
            Profiles(R.drawable.man, "변성재",26,"사업가"),
            Profiles(R.drawable.man, "변성재",26,"사업가"),
            Profiles(R.drawable.man, "변성재",26,"사업가"),
            Profiles(R.drawable.man, "변성재",26,"사업가"),
            Profiles(R.drawable.person, "변성재",26,"사업가"),
            Profiles(R.drawable.person, "변성재",26,"사업가"),
            Profiles(R.drawable.man, "변성재",26,"사업가"),
            Profiles(R.drawable.man, "변성재",26,"사업가"),
            Profiles(R.drawable.person, "변성재",26,"사업가"),
            Profiles(R.drawable.man, "변성재",26,"사업가"),
            Profiles(R.drawable.person, "변성재",26,"사업가"),
            Profiles(R.drawable.man, "변성재",26,"사업가"),
            Profiles(R.drawable.person, "변성재",26,"사업가"),
            Profiles(R.drawable.man, "변성재",26,"사업가"),
            Profiles(R.drawable.man, "변성재",26,"사업가"),
            Profiles(R.drawable.person, "변성재",26,"사업가")
        )

        rv_profile.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv_profile.setHasFixedSize(true)

        rv_profile.adapter = ProfilesAdapter(profileList)


    }
}
