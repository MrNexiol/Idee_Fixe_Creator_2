package tomasz.kopycinski.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import tomasz.kopycinski.data.converter.toDomain
import tomasz.kopycinski.data.converter.toEntity
import tomasz.kopycinski.data.dao.CharacterSheetDao
import tomasz.kopycinski.domain.model.CharacterSheet
import tomasz.kopycinski.domain.repository.CharacterSheetRepository

class CharacterSheetRepositoryImpl(
    private val characterSheetDao: CharacterSheetDao
) : CharacterSheetRepository {
    override suspend fun getCharacterSheetBy(id: Int): CharacterSheet =
        characterSheetDao.getOneById(id).toDomain()

    override suspend fun delete(characterSheet: CharacterSheet) =
        characterSheetDao.delete(characterSheet.toEntity())

    override suspend fun save(characterSheet: CharacterSheet) =
        characterSheetDao.insert(characterSheet.toEntity())

    override suspend fun getListOfCharacterSheets(): Flow<List<CharacterSheet>> =
        characterSheetDao.getAll().map { list -> list.map { it.toDomain() } }
}
