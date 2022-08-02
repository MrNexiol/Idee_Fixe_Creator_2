package tomasz.kopycinski.domain.usecase

import tomasz.kopycinski.domain.model.CharacterSheet
import tomasz.kopycinski.domain.repository.CharacterSheetRepository
import javax.inject.Inject

class SaveCharacterSheetUseCase @Inject constructor(
    private val repository: CharacterSheetRepository
) {
    suspend operator fun invoke(characterSheet: CharacterSheet) = repository.save(characterSheet)
}
