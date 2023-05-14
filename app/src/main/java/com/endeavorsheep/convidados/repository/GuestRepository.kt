package com.endeavorsheep.convidados.repository

import android.content.Context

class GuestRepository private constructor(context: Context) {

    /**
     *When this class is instantiated, the database class will be instantiated along with
     **/
    private val guestDataBase = GuestDataBase(context)

    // Singleton
    companion object {
        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository {
            if (!::repository.isInitialized) {
                repository = GuestRepository(context)
            }
            return repository
        }

        fun insert() {

        }

        fun update() {

        }
    }
}