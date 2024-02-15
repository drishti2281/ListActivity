package com.o7services.listactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import com.o7services.listactivity.databinding.ActivityListBinding
import com.o7services.listactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var btnList:Button?=null
    var arrayList = arrayListOf<String>("1.riya","2.priya","3.drishu")
    lateinit var adapter: ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        btnList = findViewById(R.id.btnList)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList)
        binding.list.adapter = adapter
        arrayList.add((arrayList.size+1).toString())

    }
}