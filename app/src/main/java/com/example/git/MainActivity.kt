package com.example.git

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

const val PARAM1_NAME = "none"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    //tests on requirement 10
        //
        // tests on requirement 10 v1
        // tests on requirement 10 v2



        //add method A
        //add method B
    }

    fun button2(view: View) {
        var editTextHello = findViewById<EditText>(R.id.editext1)
        Toast.makeText(this,editTextHello.text,Toast.LENGTH_SHORT).show()
        findViewById<TextView>(R.id.text1).setText(editTextHello.text)
    }

    fun button(view: View) {
        var editTextHello = findViewById<EditText>(R.id.editext1)
        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra(PARAM1_NAME, editTextHello.text.toString())
        }
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.create_new -> {
                Toast.makeText(this,"create_new",Toast.LENGTH_SHORT).show()
                // Action goes here
                true
            }
            R.id.opcao1 -> {
                Toast.makeText(this,"opcao1",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.opcao2 -> {
                Toast.makeText(this,"opcao2",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.opcao3 -> {
                Toast.makeText(this,"opcao3",Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}