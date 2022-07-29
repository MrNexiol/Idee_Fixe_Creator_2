package tomasz.kopycinski.domain.repository

import kotlinx.coroutines.flow.Flow
import tomasz.kopycinski.domain.model.CharacterSheet

interface CharacterSheetRepository {
    suspend fun getCharacterSheet(id: Int): CharacterSheet

    suspend fun deleteCharacterSheet(characterSheet: CharacterSheet)

    suspend fun saveCharacterSheet(characterSheet: CharacterSheet)

    suspend fun getListOfCharacterSheets(): Flow<List<CharacterSheet>>
}
