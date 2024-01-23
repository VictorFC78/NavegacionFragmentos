package com.example.tarea4bis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tarea4bis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //intent para lanzar la actividad de semaforo
        val intentSemaforo=Intent(this,SemaforoActivity::class.java)
        binding.btnSemaforo.setOnClickListener {
            startActivity(intentSemaforo)
        }

    }
}