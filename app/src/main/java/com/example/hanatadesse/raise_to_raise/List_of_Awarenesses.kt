package com.example.hanatadesse.raise_to_raise

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_of__awarenesses.*
import java.util.ArrayList

class List_of_Awarenesses : AppCompatActivity() {
    private val tasks = ArrayList<String>()
    private lateinit var myAdapter : ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_of__awarenesses)

        val newItem = intent.getStringExtra("new")
        val newDes = intent.getStringExtra("ff")
        tasks.add(newItem)
        // clears the edittext box so the user can enter another
        // item without having to clear it first
//        myAdapter.notifyDataSetChanged()
//
        myAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tasks)
//
        list.adapter = myAdapter

        list.setOnItemClickListener { _, view, position, id ->
            val myIntent = Intent(this, current_awarenesses::class.java)
            myIntent.putExtra("aware", tasks[position])
            Log.d("check", "CLICKED ITEM: ${tasks[position]}")
//            startActivity(myIntent)
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}
