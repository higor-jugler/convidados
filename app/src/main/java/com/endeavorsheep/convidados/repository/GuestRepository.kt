package com.endeavorsheep.convidados.repository

import android.content.ContentValues
import android.content.Context
import com.endeavorsheep.convidados.constants.DataBaseConstants
import com.endeavorsheep.convidados.repository.model.GuestModel

/**
 * Data manipulation
 */
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

    }

    fun insert(guest: GuestModel): Boolean {
        return try {
            val db = guestDataBase.writableDatabase

            // Check for true or false whether or not there is creation in the database
            val presence = if (guest.presence) 1 else 0

            // Content Values - Will upload the information to the database
            val values = ContentValues()

            // Information for writing to the database
            values.put("name", guest.name)
            values.put("presence", presence)

            /**
             * id is autoincrement, database takes care of insertion
             */

            db.insert("Guest", null, values)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun update(guest: GuestModel): Boolean {

        return try {
            val db = guestDataBase.writableDatabase
            val presence = if (guest.presence) 1 else 0

            val values = ContentValues()
            values.put(DataBaseConstants.GUEST.COLUMNS.PRESENCE, presence)
            values.put(DataBaseConstants.GUEST.COLUMNS.NAME, guest.name)

            val selection = DataBaseConstants.GUEST.COLUMNS.ID + " = ?"
            val args = arrayOf(guest.id.toString())

            db.update(DataBaseConstants.GUEST.TABLE_NAME, values, selection, args)
            true
        } catch (e: Exception) {
            false
        }
    }
}