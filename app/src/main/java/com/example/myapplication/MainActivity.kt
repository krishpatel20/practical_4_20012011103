package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btn_ref_browser: Button
    lateinit var btn_ref_map: Button
    lateinit var btn_ref_msg: Button
    lateinit var btn_ref_alarm: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_ref_browser=findViewById(R.id.btn_browser)
        btn_ref_map=findViewById(R.id.btn_map)
        btn_ref_msg=findViewById(R.id.btn_sendmsg)
        btn_ref_alarm=findViewById(R.id.btn_openalarm)
        implicit_intent();
    }
    fun implicit_intent(){
        btn_ref_browser.setOnClickListener {
            Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ganpatuniversity.ac.in/")).also { startActivity(it) }

        }
        btn_ref_map.setOnClickListener {
            val address_url:Uri= Uri.parse("geo:0,0?q="+"Ahmedabad")
            val i1=Intent(Intent.ACTION_VIEW,address_url)
            startActivity(i1)
        }
    }
}