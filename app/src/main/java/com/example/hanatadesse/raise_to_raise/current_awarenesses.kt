package com.example.hanatadesse.raise_to_raise

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_current_awarenesses.*

class current_awarenesses : AppCompatActivity() {
    private var myMap = hashMapOf<String, String>()
    private val rr = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_current_awarenesses)

        val title = intent.getStringExtra("title")
        val description = intent.getStringExtra("description")
        myMap[title] = description
        main_title.setText(title)
        description_1.setText(description)

        back_home.setOnClickListener(){
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
            setResult(RESULT_OK, intent)
            finish()
        }

        current.setOnClickListener() {
            val myIntent = Intent(this, List_of_Awarenesses::class.java)
            myIntent.putExtra("new", title)
            startActivityForResult(myIntent, rr)
//            setResult(RESULT_OK, intent)
//            finish()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

//        super.onActivityResult(requestCode, resultCode, data)
//        if (requestCode == rr) {
            // came back from SecondActivity
            val ss = data!!.getStringExtra("aware")
            Log.d("check","DATAAA: $data")
            Log.d("check","AWARE: $ss")
            val tt = myMap[ss]

            main_title.setText(ss)
            description_1.setText(tt)
        }
    }
//}
