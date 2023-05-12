package com.endeavorsheep.convidados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.endeavorsheep.convidados.databinding.ActivityGuestFormBinding
import com.endeavorsheep.convidados.repository.GuestRepository

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityGuestFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGuestFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSave.setOnClickListener(this)
        binding.radioGuestPresent.isChecked = true
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_save) {

        }
    }
}