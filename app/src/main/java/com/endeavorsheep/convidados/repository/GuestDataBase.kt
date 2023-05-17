package com.endeavorsheep.convidados.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.endeavorsheep.convidados.constants.DataBaseConstants
/**
 * Database connection
 */
class GuestDataBase(context: Context) : SQLiteOpenHelper(context, NAME, null, VERSION) {
    /**
     * Method executed only once when accessing the database for the first time
     */
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(/* sql = */
            CREATE_TABLE_GUEST
        )
    }
    /**
     * Method executed when the DATABASE_VERSION version is changed.
     * In this way, the application knows that the database has changed and it is necessary to run
     * the update script
     */
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    companion object {
        private const val NAME = "guestdb"
        private const val VERSION = 1

        private const val CREATE_TABLE_GUEST =
            ("create table " + DataBaseConstants.GUEST.TABLE_NAME + " ("
                    + DataBaseConstants.GUEST.COLUMNS.ID + " integer primary key autoincrement, "
                    + DataBaseConstants.GUEST.COLUMNS.NAME + " text, "
                    + DataBaseConstants.GUEST.COLUMNS.PRESENCE + " integer);")
    }
}