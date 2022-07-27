package tomasz.kopycinski.domain.usecase

import tomasz.kopycinski.domain.model.CharacterSheet
import tomasz.kopycinski.domain.repository.CharacterSheetRepository

class SaveCharacterSheetUseCase(
    private val repository: CharacterSheetRepository
) {
    suspend operator fun invoke(characterSheet: CharacterSheet) =
        repository.saveCharacterSheet(characterSheet)
}
