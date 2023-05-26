package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class creationprofile : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_creationprofile, container, false)

        val button = view.findViewById<Button>(R.id.buttonsignin)
        val buttonliste = view.findViewById<Button>(R.id.buttonconnect)

        buttonliste.setOnClickListener {

                view ->
            view.findNavController().navigate(R.id.action_creationprofile_to_listetaxi)

        }
        button.setOnClickListener {

              view ->
            view.findNavController().navigate(R.id.action_creationprofile_to_blankFragment2)

        }
        return view
    }


}