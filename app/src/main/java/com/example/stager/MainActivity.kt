package com.example.stager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Adapter
    private lateinit var list: ArrayList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)

        list = ArrayList()
        list.add(R.drawable.adi)
        list.add(R.drawable.avatar)
        list.add(R.drawable.black)
        list.add(R.drawable.brahma)
        list.add(R.drawable.gray)
        list.add(R.drawable.groot)
        list.add(R.drawable.infinite)
        list.add(R.drawable.liger)
        list.add(R.drawable.pathan)

        adapter = Adapter(list)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
    }
}