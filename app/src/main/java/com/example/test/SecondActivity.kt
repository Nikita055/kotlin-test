package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.test.bottomSheet.BottomSheetActivity

class SecondActivity : AppCompatActivity() {
     var radioGroup : RadioGroup? = null
    lateinit var radioButton: RadioButton
    private lateinit var button: Button
    private lateinit var nextbtn : Button
    private lateinit var bottomSheet : Button
    private lateinit var dataBinding : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle:Bundle = intent.extras!!
        val id = bundle.get("id_value")
        val language = bundle.get("language_value")
        Toast.makeText(applicationContext,id.toString()+ "" +language,Toast.LENGTH_SHORT).show()

        radioGroup = findViewById(R.id.radioGroup)
        button = findViewById(R.id.btnDisplay)
        bottomSheet = findViewById(R.id.bottomSheet)

        bottomSheet.setOnClickListener(View.OnClickListener {
           /* intent = Intent(applicationContext,BottomSheetActivity::class.java)
            startActivity(intent)*/
            intent = Intent(applicationContext, BottomSheetActivity::class.java)
            startActivity(intent)
        })

        button.setOnClickListener(View.OnClickListener {
            val intSelection :Int = radioGroup !!.checkedRadioButtonId
            radioButton = findViewById(intSelection)
            Toast.makeText(applicationContext,radioButton.text,Toast.LENGTH_SHORT).show()
        })

        dataBinding.setOnClickListener(View.OnClickListener {
            intent = Intent(applicationContext,DataBindingActivity::class.java)
            startActivity(intent)
        })

        val listBtn = findViewById<Button>(R.id.list_btn)as Button
        listBtn.setOnClickListener(View.OnClickListener {
            intent = Intent(applicationContext, Listvw::class.java)
            startActivity(intent)
           /* intent = Intent(applicationContext,Listvw::class.java)
            startActivity(intent)*/
        })

        val Recyclerbtn = findViewById<Button>(R.id.recyclervw_btn) as Button
        Recyclerbtn.setOnClickListener(View.OnClickListener {
            intent = Intent(applicationContext, RecyclerViewActivity::class.java)
            startActivity(intent)
        })


        val languages = resources.getStringArray(R.array.Languages)
        val spinner = findViewById<Spinner>(R.id.spinner)

        if (spinner != null){
            val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,languages)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object : AdapterView.OnItemClickListener,
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    Toast.makeText(applicationContext,getString(R.string.selected_item)+ ""+ ""+languages[position],Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

                override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    TODO("Not yet implemented")
                }


            }
        }



    }
}