package tomasz.kopycinski.data.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import tomasz.kopycinski.data.entity.CharacterSheet

interface CharacterSheetDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(characterSheet: CharacterSheet)

    @Update
    suspend fun update(characterSheet: CharacterSheet)

    @Delete
    suspend fun delete(characterSheet: CharacterSheet)

    @Query("SELECT * FROM charactersheet WHERE id = :id")
    suspend fun getOneById(id: Int): CharacterSheet

    @Query("SELECT * FROM charactersheet")
    fun getAll(): Flow<List<CharacterSheet>>
}
