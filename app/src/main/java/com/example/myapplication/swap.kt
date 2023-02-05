package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class swap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swap)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val btnCalculate: Button = findViewById(R.id.BtnCalculate)
        val edtInputNumber: EditText = findViewById(R.id.inputNumber)
        val resultFinal: TextView = findViewById(R.id.resultFinal)


        btnCalculate.setOnClickListener {

            val inputNumberStr = edtInputNumber.text.toString()

            if (inputNumberStr.isNotEmpty()) {
                val inputNumber: Float = inputNumberStr.toFloat()

                val result: Float = (inputNumber-32)*5/9

                resultFinal.text = result.toString()


            } else {
                Toast.makeText(this, "Please fill up all the data.", Toast.LENGTH_LONG).show()
            }

        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }

}