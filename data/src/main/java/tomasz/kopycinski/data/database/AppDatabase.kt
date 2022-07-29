package tomasz.kopycinski.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import tomasz.kopycinski.data.converter.DateConverter
import tomasz.kopycinski.data.dao.CharacterSheetDao
import tomasz.kopycinski.data.entity.CharacterSheet

@Database(entities = [CharacterSheet::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun characterSheetDao(): CharacterSheetDao
}
