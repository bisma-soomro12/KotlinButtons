package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var str:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_Clear: Button = findViewById(R.id.btnClear)
        val btn_Undo: Button = findViewById(R.id.btnUndo)
        var txt: EditText?= findViewById(R.id.editTxt)

        btn_Clear.setOnClickListener{
            str= txt?.text.toString()
            txt?.setText(" ")
        }
        btn_Undo.setOnClickListener {
            txt?.setText(str)
        }

    }
}