package com.endeavorsheep.convidados.ui.form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.endeavorsheep.convidados.R
import com.endeavorsheep.convidados.databinding.ActivityGuestFormBinding
import com.endeavorsheep.convidados.repository.model.GuestModel

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityGuestFormBinding
    private lateinit var viewModel: GuestFormViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGuestFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(GuestFormViewModel::class.java)

        binding.buttonSave.setOnClickListener(this)
        binding.radioGuestPresent.isChecked = true
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_save) {
            val name = binding.editNameGuest.text.toString()
            val presence = binding.radioGuestPresent.isChecked

            val model = GuestModel(0, name, presence)
            viewModel.insert(model)
        }
    }
}