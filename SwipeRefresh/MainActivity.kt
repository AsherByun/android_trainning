package com.snstrain.drag_refresh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var pullToRefresh : SwipeRefreshLayout
    var adapter = MyAdapter()
    var people = mutableListOf<Person>(
            Person("변성재","010110101011010"),
            Person("변성재","010110101011010"),
            Person("변성재","010110101011010"),
            Person("변성재","010110101011010"),
            Person("변성재","010110101011010"),
            Person("변성재","010110101011010"),
            Person("변성재","010110101011010")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pullToRefresh = findViewById(R.id.pullToRefresh) as SwipeRefreshLayout
        mobile_lis.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        mobile_lis.setHasFixedSize(true)
        mobile_lis.adapter = adapter

        pullToRefresh.setOnRefreshListener {
            people.add(Person("윤광열","11111123123123"))
            adapter.notifyDataSetChanged()
            pullToRefresh.setRefreshing(false)
        }
    }
    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val name = itemView.findViewById<TextView>(R.id.text_name)
        val number = itemView.findViewById<TextView>(R.id.text_number)
    }


    inner class MyAdapter : RecyclerView.Adapter<MyViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            return MyViewHolder(LayoutInflater.from(this@MainActivity).inflate(R.layout.card_post,parent,false))
        }

        override fun getItemCount(): Int {
            return people.size
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            var person = people.get(position)
            holder.name.text=person.name
            holder.number.text=person.number
            holder.itemView.setOnClickListener {
                Toast.makeText(this@MainActivity,"이름:${person.name} 전화번호:${person.number}",Toast.LENGTH_SHORT).show()
            }
        }

    }
}
