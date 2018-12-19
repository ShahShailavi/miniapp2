package edu.fullerton.shailavishah.miniapp2

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

import java.text.DecimalFormat

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var networkSpeed: EditText? = null
    private var fileSize: EditText? = null
    private var textView4: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        networkSpeed = findViewById<View>(R.id.networkSpeed)
//        fileSize = findViewById<View>(R.id.fileSize)
//        textView4 = findViewById<View>(R.id.textView4)

        networkSpeed=networkSpeedAct;
        fileSize=fileSizeAct;
        textView4=textView4Act;

        fileSize!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable) {
                if (networkSpeed!!.text.toString().length > 0 && fileSize!!.text.toString().length > 0) {
                    val dblNetworkSpeed = java.lang.Double.parseDouble(networkSpeed!!.text.toString())
                    val dblFileSize = java.lang.Double.parseDouble(fileSize!!.text.toString())
                    textView4!!.setTextColor(Color.BLACK)
                    textView4!!.text = "Computed transfer time in seconds: " + DecimalFormat("##.#").format(dblFileSize * 1024.0 * 1024.0 * 8.0 / (dblNetworkSpeed * 1000000))
                } else {
                    textView4!!.setTextColor(Color.RED)
                    textView4!!.text = "Please enter above mentioned value"
                }
            }
        })
        networkSpeed!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable) {
                if (networkSpeed!!.text.toString().length > 0 && fileSize!!.text.toString().length > 0) {
                    val dblNetworkSpeed = java.lang.Double.parseDouble(networkSpeed!!.text.toString())
                    val dblFileSize = java.lang.Double.parseDouble(fileSize!!.text.toString())
                    textView4!!.setTextColor(Color.BLACK)
                    textView4!!.text = "Computed transfer time in seconds: " + DecimalFormat("##.#").format(dblFileSize * 1024.0 * 1024.0 * 8.0 / (dblNetworkSpeed * 1000000))
                } else {
                    textView4!!.setTextColor(Color.RED)
                    textView4!!.text = "Please enter above mentioned value"
                }
            }
        })
    }
}
