package com.example.git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    // Get the Intent that started this activity and extract the string
    val message = intent.getStringExtra(PARAM1_NAME)

    // Capture the layout's TextView and set the string as its text
    val textView = findViewById<TextView>(R.id.textViewActivity).apply {
        text = message
    }
}