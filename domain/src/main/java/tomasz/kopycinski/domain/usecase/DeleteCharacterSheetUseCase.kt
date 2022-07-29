package tomasz.kopycinski.domain.usecase

import tomasz.kopycinski.domain.model.CharacterSheet
import tomasz.kopycinski.domain.repository.CharacterSheetRepository

class DeleteCharacterSheetUseCase(
    private val repository: CharacterSheetRepository
) {
    suspend operator fun invoke(characterSheet: CharacterSheet) = repository.delete(characterSheet)
}
