package com.example.checkbox

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import com.example.checkbox.R

class CheckBox : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.box_check)
        val  myButton = findViewById<Button>(R.id.btn)
        val  checkBox = findViewById<CheckBox>(R.id.checkbox)

        checkBox.setOnCheckedChangeListener {buttonView, isChecked ->
            //  Realiza alguna acción cuando el estado de CheckBox cambia

              if (isChecked)  {
                 myButton.isEnabled=true
                    //  El CheckBox esta marcado
                    //  Realiza alguna accion
              }  else {
                  myButton.isEnabled=true
            // El CheckBox esta desmarcado
            // Realiza alguna otra accion
              }
       }
    }
}