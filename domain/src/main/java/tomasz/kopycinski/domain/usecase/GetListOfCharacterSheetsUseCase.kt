package tomasz.kopycinski.domain.usecase

import tomasz.kopycinski.domain.repository.CharacterSheetRepository

class GetListOfCharacterSheetsUseCase(
    private val repository: CharacterSheetRepository
) {
    suspend operator fun invoke() = repository.getListOfCharacterSheets()
}
