package com.example.hanatadesse.raise_to_raise

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        raise.setOnClickListener(){
            val myIntent = Intent(this, raise_awareness::class.java)
            startActivity(myIntent)
            setResult(RESULT_OK, intent)
            finish()
        }

        current.setOnClickListener(){
            val myIntent = Intent(this, current_awarenesses::class.java)
            startActivity(myIntent)
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}
