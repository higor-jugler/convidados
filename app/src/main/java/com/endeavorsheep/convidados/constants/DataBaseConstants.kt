package com.endeavorsheep.convidados.constants
/**
 * This class is not currently being used. Reason, I found your application confusing.
 */
class DataBaseConstants private constructor(){

    object GUEST{
        const val TABLE_NAME = "Guest"

        object COLUMNS {
            const val ID = "id"
            const val NAME = "name"
            const val PRESENCE = "presence"
        }

    }

}