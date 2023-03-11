package com.example.interfazgrafica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    var number: EditText? = null
    var myRadioButton1: RadioButton? = null
    var myRadioButton2: RadioButton? = null
    var myCheckBox1: CheckBox? = null
    var myCheckBox2: CheckBox? = null
    var myToggleButton: ToggleButton? = null
    var mySwitch: Switch? = null



        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            number = findViewById(R.id.editText)
         myRadioButton1 = findViewById(R.id.Radiobutton1)
            myRadioButton2 = findViewById(R.id.Radiobutton2)
         myCheckBox1 = findViewById(R.id.checkBox1)
         myCheckBox2 = findViewById(R.id.checkBox2)
            myToggleButton = findViewById(R.id.BottonToogle)
            mySwitch = findViewById(R.id.Switch)
            var myImageButton: ImageButton = findViewById(R.id.ImagenButton)
            myImageButton.setOnClickListener{onClickImage()}

            var myButton: Button = findViewById(R.id.button)
            myButton.setOnClickListener { onClick() }



    }

    private fun onClickImage() {
        Toast.makeText(this, "presiono la imagen", Toast.LENGTH_LONG).show()
    }


    private fun onClick() {

        var numero: String = number!!.text.toString()
        var cod: String = "Selecionado: \n"

        if(myRadioButton1?.isChecked == true){
            cod+="opcion 1. RadioButton\n"
        }
        if(myRadioButton2?.isChecked == true){
            cod+="opcion 2. RadioButton\n"
        }
        if(myCheckBox1?.isChecked == true){
            cod+="opcion 1. Check \n"
        }
        if(myCheckBox2?.isChecked == true){
            cod+="opcion 2. Check \n"
        }
        if(myToggleButton?.isChecked == true){
            cod+="ToogleButton Modo On \n"
        }
        if(mySwitch?.isChecked == true){
            cod+="Switch Modo On"
        }
        Toast.makeText(this, "Number: $numero \n $cod", Toast.LENGTH_LONG).show()
    }
}