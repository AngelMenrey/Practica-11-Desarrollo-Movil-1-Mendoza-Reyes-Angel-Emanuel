package com.example.practica11mendozareyesangelemanuel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.Toast

class Formulario : Fragment() {

    private lateinit var vista: View
    private lateinit var estrellas: RatingBar

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vista = inflater.inflate(R.layout.fragment_formulario, container, false)

        estrellas = vista.findViewById(R.id.ratingBar)
        estrellas.rating = 3f

        estrellas.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            if(estrellas.rating <= 2f){
                Toast.makeText(context, "Mal servicio",Toast.LENGTH_SHORT).show()
            } else if(estrellas.rating <= 4f){
                Toast.makeText(context, "Buen servicio",Toast.LENGTH_SHORT).show()
            }else if(estrellas.rating <= 5f){
                Toast.makeText(context, "Excelente  servicio",Toast.LENGTH_SHORT).show()
            }
        }
        return vista
    }
}