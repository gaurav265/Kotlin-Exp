package com.prg.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG


lateinit var click:Button
lateinit var entertext:EditText
lateinit var viewtext:TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click=findViewById(R.id.button)
        entertext=findViewById(R.id.editTextTextPersonName)
        viewtext=findViewById(R.id.textView)

        //click.setOnClickListener(this)

        click.setOnClickListener {
            val msg= entertext.text
            viewtext.text=msg

            Toast.makeText(this,"Action Completed", LENGTH_LONG).show()

        }
    }

    override fun onClick(view: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.



    }
}