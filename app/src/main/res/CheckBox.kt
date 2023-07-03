import android.app.Activity
import com.example.checkbox.R

class CheckBox : Activity() {
    val  checkBox = findViewById<CheckBox>(R.id.checkbox)

    checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
        //  Realiza alguna acción cuando el estado de CheckBox cambia
        if (isChecked)  {
            //  El CheckBox esta marcado
            //  Realiza alguna accion
        }  else {
            // El CheckBox esta desmarcado
            // Realiza alguna otra accion
        }
    }
}