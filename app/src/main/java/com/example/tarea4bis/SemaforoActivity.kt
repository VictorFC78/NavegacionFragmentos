package com.example.tarea4bis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tarea4bis.databinding.ActivitySemaforoBinding

class SemaforoActivity : AppCompatActivity(),IListenerSemaforo {
    private lateinit var binding:ActivitySemaforoBinding
    private lateinit var instanciaColorSemaforo:ColorSemaforo
    private lateinit var instanciaBotonSemaforo:BotonSemaforo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySemaforoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //instanciamos los fragmentos y se los asociamos a sus contenedores
        instanciaColorSemaforo=ColorSemaforo.newInstance()
        instanciaBotonSemaforo=BotonSemaforo.newInstance()
        supportFragmentManager.beginTransaction().add(R.id.contenedorSemaforoColor,instanciaColorSemaforo).commit()
        supportFragmentManager.beginTransaction().add(R.id.contenedorSemaforoBoton,instanciaBotonSemaforo).commit()

    }

    override fun actualizar() {
        instanciaColorSemaforo.avanzarSemaforo()
    }
}