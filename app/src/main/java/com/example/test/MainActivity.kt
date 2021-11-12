package com.example.test

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.lang.StringBuilder
///https://www.youtube.com/watch?v=moc8x8uXOsw
class MainActivity : AppCompatActivity() {
    val id:Int = 10
    val language : String = "Kotlin"
    lateinit var pizza : CheckBox
    lateinit var coffee : CheckBox
    lateinit var burger : CheckBox
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textview = findViewById<TextView>(R.id.hello) as TextView
        val button1 = findViewById<Button>(R.id.button1) as Button
        val button2 = findViewById<Button>(R.id.button2) as Button
        val CTview = findViewById<CheckedTextView>(R.id.checkedbox) as CheckedTextView

        pizza = findViewById(R.id.checkBox1)
        coffee = findViewById(R.id.checkBox2)
        burger = findViewById(R.id.checkBox3)
        button = findViewById(R.id.button)

       button.setOnClickListener(View.OnClickListener {
           var totalAmount : Int = 0
           val result = StringBuilder()
           result.append("Selected Items")
           if (pizza.isChecked) {
               result.append("\nPizza 100rs")
               totalAmount += 100
           }
           if (coffee.isChecked){
               result.append("\nCoffee 50rs")
               totalAmount += 50
           }
           if (burger.isChecked){
               result.append("\nBurger 120rs")
               totalAmount += 120
           }

           result.append("\nTotal:" +totalAmount + "rs")
           Toast.makeText(applicationContext,result.toString(),Toast.LENGTH_SHORT).show()
       })


        textview ?. setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()
        })

        button1 ?. setOnClickListener(View.OnClickListener {
            intent = Intent(applicationContext, SecondActivity::class.java)
            intent.putExtra("language_value",language)
            intent.putExtra("id_value",id)
            startActivity(intent)
        })

        button2.setOnClickListener(View.OnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.javatpoint.com/"))
            startActivity(intent)
        })

    }
}