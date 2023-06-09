package com.endeavorsheep.convidados.ui.form

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.endeavorsheep.convidados.repository.GuestRepository
import com.endeavorsheep.convidados.repository.model.GuestModel

class GuestFormViewModel(application: Application): AndroidViewModel(application) {

    private val repository = GuestRepository.getInstance(application)

    fun insert(guest: GuestModel) {
        repository.insert(guest)
    }

}