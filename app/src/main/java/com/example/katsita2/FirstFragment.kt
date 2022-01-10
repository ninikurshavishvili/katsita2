package com.example.katsita2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sendButton = view.findViewById<Button>(R.id.button)
        val emountEditText = view.findViewById<EditText>(R.id.editTextNumber)

        val controller = Navigation.findNavController(view)

        sendButton.setOnClickListener {
            val amountText = emountEditText.text.toString()

            if (amountText.isEmpty()){
                return@setOnClickListener
            }


            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()


            controller.navigate(action)


        }
    }
}