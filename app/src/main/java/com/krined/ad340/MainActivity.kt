package com.krined.ad340

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zipcodeEditText: EditText = findViewById(R.id.inputzip)
        val enterButton: Button = findViewById(R.id.submit_button)

        enterButton.setOnClickListener {
            val zipCode: String = zipcodeEditText.text.toString()

            if (zipCode.length != 5){
                Toast.makeText(this, R.string.zipcode_entry_error, Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this, zipCode, Toast.LENGTH_SHORT).show()
            }



        }
    }
}