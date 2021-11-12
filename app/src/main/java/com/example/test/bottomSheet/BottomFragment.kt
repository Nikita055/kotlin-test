package com.example.test.bottomSheet

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.test.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomFragment() : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_bottom_sheet,container,false);
        var username = view.findViewById<EditText>(R.id.edUsername)
        var btnContinue = view.findViewById<Button>(R.id.btnContinue)

        btnContinue.setOnClickListener{
            if (username.text.isNotEmpty()){
                var username = username.text.trim().toString()
              startActivity(Intent(requireActivity(),ItemActivity::class.java).putExtra("data",username))
            }
            else{
                Toast.makeText(requireContext(),"INPUT Required",Toast.LENGTH_SHORT).show();
            }
        }


        return view
    }
}