package com.example.test

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.btnAbout)
        btn.setOnClickListener() {
            //val telNo = Uri.parse("tel:0172828681")
            //val intent = Intent(Intent.ACTION_DIAL.telNo)
            val intent = Intent(this, AboutActivity::class.java)

            //val intent = Intent(Intent.ACTION_SEND)
            //intent.setType("text/plain")
            //intent.putExtra(Intent.EXTRA_TEXT, "Hi!")

            //val geo = Uri.parse("geo:3.1390,181.6869")
            //val intent = Intent(Intent.ACTION_VIEW, geo)


            try {
                startActivity(intent)
            }catch(e:ActivityNotFoundException){
                Toast.makeText(this, "No App Found", Toast.LENGTH_LONG).show()
            }
        }
    }
}