package com.example.tarea4bis

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tarea4bis.databinding.FragmentColorSemaforoBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ColorSemaforo.newInstance] factory method to
 * create an instance of this fragment.
 */
class ColorSemaforo : Fragment() {
 private var _binding:FragmentColorSemaforoBinding?=null
    private val binding get()=_binding!!
    private val semaforo=Semaforo()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentColorSemaforoBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtcolorSemaforo.setBackgroundColor(Color.RED)

    }
    fun avanzarSemaforo() {
        semaforo.avanzar()
        binding.txtcolorSemaforo.setBackgroundColor(semaforo.color)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            ColorSemaforo()
            }
}