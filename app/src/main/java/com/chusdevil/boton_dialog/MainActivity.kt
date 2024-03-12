package com.chusdevil.boton_dialog

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciar()
    }

    private fun iniciar() {
        val boton = findViewById<Button>(R.id.btnPulsame)
        boton.setOnClickListener {
            val alerta: AlertDialog.Builder = AlertDialog.Builder(this)
            alerta
                .setTitle("Este es un Dialogo")
                .setMessage("Vamos que si podemos..")
                .show()
        }
    }
}