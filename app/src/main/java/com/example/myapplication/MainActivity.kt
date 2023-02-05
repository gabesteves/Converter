package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate: Button = findViewById(R.id.BtnCalculate)
        val edtInputNumber: EditText = findViewById(R.id.inputNumber)
        val resultFinal: TextView = findViewById(R.id.resultFinal)

        val btnSwap: Button = findViewById(R.id.BtnSwap)
        /*val txtConversion: TextView = findViewById(R.id.txtConversion)
        val txtInput: TextView = findViewById(R.id.txtInput)
        val txtName: TextView = findViewById(R.id.txtName)*/

        btnCalculate.setOnClickListener {

            val inputNumberStr = edtInputNumber.text.toString()

            if (inputNumberStr.isNotEmpty()) {
                val inputNumber: Float = inputNumberStr.toFloat()

                val result: Float = (inputNumber*9/5)+32

                resultFinal.text = result.toString()


            } else {
                Toast.makeText(this, "Please fill up all the data.", Toast.LENGTH_LONG).show()
            }

        }

        btnSwap.setOnClickListener {
            val intent = Intent(this, swap::class.java)
            startActivity(intent)

                /*txtConversion.text = "FAHRENHEIT to CELSIUS"
                txtInput.text = "Input Fahrenheit"
                txtName.text = "Celsius:"


            btnCalculate.setOnClickListener {

                val inputNumberStr = edtInputNumber.text.toString()

                if (inputNumberStr.isNotEmpty()) {
                    val inputNumber: Float = inputNumberStr.toFloat()

                    val result: Float = (inputNumber-32)*5/9

                    resultFahrenheit.text = result.toString()

                } else {
                    Toast.makeText(this, "Please fill up all the data.", Toast.LENGTH_LONG).show()
                }

            }*/


        }
    }
}