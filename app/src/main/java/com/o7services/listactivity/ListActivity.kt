package com.o7services.listactivity

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.o7services.listactivity.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {
    lateinit var  binding:ActivityListBinding
    var arrayList = arrayListOf<String>("1","2","3")
    lateinit var adapter: ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ArrayAdapter(this, R.layout.simple_list_item_1,arrayList)
        binding.list.adapter = adapter
        arrayList.add((arrayList.size + 1).toString())
        adapter.notifyDataSetChanged()

    }
}