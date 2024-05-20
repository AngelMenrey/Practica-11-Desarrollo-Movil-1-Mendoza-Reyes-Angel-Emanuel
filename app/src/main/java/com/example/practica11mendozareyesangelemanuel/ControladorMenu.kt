package com.example.practica11mendozareyesangelemanuel

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ControladorMenu(fragment: FragmentActivity): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> Principal()
            1 -> Galeria()
            2 -> Formulario()
            else -> throw IllegalAccessException("Posicion Invalida")
        }
    }
}