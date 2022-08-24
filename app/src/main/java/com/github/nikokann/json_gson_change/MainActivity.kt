package com.github.nikokann.json_gson_change

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.change_button).setOnClickListener {
            val voice_recognition_lists = "[{time=00-00-00,text=今日の授業を始めます },{time=00-00-06,text=教科書00ページを開いてください },{time=00-00-11,text=あ}]"
            val listtype = object : TypeToken<List<Voices>>() {}.type
            val data = Gson().fromJson<List<Voices>>(voice_recognition_lists,listtype)
            val time = data[0].time

            val outputText = "time = ${data[0].time}\ntime2 = ${data[1].time}\ntime3 = ${data[2].time}"

            Log.d("jsonCheck",outputText)
            findViewById<TextView>(R.id.output_textview).text = outputText

            }
        }
    }
