package com.snstrain.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    val List_menu = arrayListOf<String>("List1","List2","List3","List2","List3","List2","List3","List2","List3","List2","List3","List2","List3","List2","List3")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,List_menu)
        val listview = findViewById<ListView>(R.id.ListView) as ListView

        listview.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                var str:String=List_menu[position]
                Toast.makeText(applicationContext,"${str}!!!!!!!!!!!",Toast.LENGTH_SHORT).show()
            }

        }
        listview.adapter=adapter

    }
}
