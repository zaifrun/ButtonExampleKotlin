package org.pondar.buttonexamplekotlin

import android.app.Dialog

import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "Startup finished")
        btnHello.text = getString(R.string.button_label)
        btnHello.setOnClickListener {
            Log.d("button","Button clicked!")
            val toast = Toast.makeText(applicationContext, "Hello class", Toast.LENGTH_LONG)
            toast.show()
        }

    }


    //this function could also be a click listener
    //if we set in the .xml code for the button
    fun sayHello(view: View) {
        val dialog = Dialog(this)


        dialog.setTitle("greetings") //hardcoded - should be in strings.xml!
        val textView = TextView(this)
        //textView.setText("Hello World"); //Hardcoded - not best.
        textView.setText(R.string.hello_world) //refers to strings.xml  better!
        textView.setPadding(20, 20, 20, 20)

        dialog.setContentView(textView)

        dialog.show()
    }
}
