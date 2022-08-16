package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var first = " "
        var second = " "
        var operator = " "
        var result = 0f
        val screen = findViewById<EditText>(R.id.editText)

        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            if (operator !== " "){
                second = second + "1"
            }else{
            first = first + "1" }
        screen.setText(first + operator + second)}
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            if (operator !== " "){
                second = second + "2"
            }else{
            first = first + "2"}
            screen.setText(first + operator + second) }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {    if (operator !== " " ){
            second = second + "3"
        }else{
            first = first + "3"}
            screen.setText(first + operator + second)}
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            if (operator !== " "){
            second = second + "4"
        }else{
            first = first + "4" }
            screen.setText(first + operator + second) }
        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {   if (operator !== " "){
            second = second + "5"
        }else{
            first = first + "5"}
            screen.setText(first + operator + second) }
        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {   if (operator !== " "){
            second = second + "6"
        }else{
            first = first + "6"}
            screen.setText(first + operator + second) }
        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {  if (operator !== " "){
            second = second + "7"
        }else{
            first = first + "7"}
            screen.setText(first + operator + second) }
        val button8 = findViewById<Button>(R.id.button8)
        button8.setOnClickListener { if (operator !== " "){
            second = second + "8"
        }else{
            first = first + "8"}
            screen.setText(first + operator + second) }
        val button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener {  if (operator !== " "){
            second = second + "9"
        }else{
            first = first + "9"}
            screen.setText(first + operator + second) }
        val zero = findViewById<Button>(R.id.zero)
        zero.setOnClickListener {  if (operator !== " "){
            second = second + "0"
        }else{
            first = first + "0"}
            screen.setText(first + operator + second)}
        val add = findViewById<Button>(R.id.add)
        add.setOnClickListener {  
            if ((operator !== " ")&& (result !== 0f)) {
                first = result.toString()
                second = " "


            }
            operator =" + "
            screen.setText(first + operator + second) }
        val negative = findViewById<Button>(R.id.negative)
        negative.setOnClickListener {
            if ((operator !== " ")&& (result !== 0f) ){
                first = result.toString()
                second = " "
            }
            operator = " - "
            screen.setText(first + operator + second)}
        val divide = findViewById<Button>(R.id.divide)
        divide.setOnClickListener {
            if ((operator !== " ")&& (result !== 0f) ){
                first = result.toString()
                second = " "
            }

            operator = " / "
            screen.setText(first + operator + second) }
        val multi = findViewById<Button>(R.id.multi)
        multi.setOnClickListener {  if ((operator !== " ")&& (result !== 0f)) {
            first = result.toString()
            second = " "
        }

            operator = " x "
            screen.setText(first + operator + second)}
        val equal = findViewById<Button>(R.id.equal)
        equal.setOnClickListener {
            var Fir = first.toFloat()
            var sec = second.toFloat()
             var visible = ""
when (operator) {
    " + " -> {
        result = Fir + sec
        visible = result.toString()
        screen.setText(visible)
    }
    " - " -> {
        result = Fir - sec
        visible = result.toString()
        screen.setText(visible)
    }
    " x " -> {
        result = Fir * sec
        visible = result.toString()
        screen.setText(visible)
    }
    " / " -> {
        result = Fir / sec
        visible = result.toString()
        screen.setText(visible)
    }
}

}




}
}