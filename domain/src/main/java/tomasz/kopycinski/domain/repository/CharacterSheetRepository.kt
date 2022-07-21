package tomasz.kopycinski.domain.repository

import kotlinx.coroutines.flow.Flow
import tomasz.kopycinski.domain.model.CharacterSheet

interface CharacterSheetRepository {
    suspend fun getCharacterSheet(id: Int): CharacterSheet

    suspend fun deleteCharacterSheet(id: Int)

    suspend fun saveCharacterSheet(characterSheet: CharacterSheet)

    suspend fun getListOfCharacterSheets(): Flow<List<CharacterSheet>>
}
