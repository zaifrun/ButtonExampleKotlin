package org.pondar.buttonexamplekotlin

import android.app.Dialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "Startup finished")
       /* btnHello.setOnClickListener( {
            var toast:  Toast = Toast.makeText(getApplicationContext(),"Hello class",Toast.LENGTH_LONG)
            toast.show()

        }) */

    }


    fun sayHello(view: View)
    {
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
