package com.example.hanatadesse.raise_to_raise

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_raise_awareness.*

class raise_awareness : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_raise_awareness)

        publish.setOnClickListener(){
            val hhh = title_1.text.toString()
            Log.d("tt", "the title is: $hhh")
            val myIntent = Intent(this, current_awarenesses::class.java)
            myIntent.putExtra("title", hhh)
            myIntent.putExtra("description", description_1.text.toString())
            startActivity(myIntent)
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}
