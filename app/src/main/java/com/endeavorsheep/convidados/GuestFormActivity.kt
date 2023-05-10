package com.endeavorsheep.convidados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.endeavorsheep.convidados.repository.GuestRepository

class GuestFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest_form)
    }
}