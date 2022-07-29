package tomasz.kopycinski.domain.repository

import kotlinx.coroutines.flow.Flow
import tomasz.kopycinski.domain.model.CharacterSheet

interface CharacterSheetRepository {
    suspend fun getCharacterSheetBy(id: Int): CharacterSheet

    suspend fun delete(characterSheet: CharacterSheet)

    suspend fun save(characterSheet: CharacterSheet)

    suspend fun getListOfCharacterSheets(): Flow<List<CharacterSheet>>
}
