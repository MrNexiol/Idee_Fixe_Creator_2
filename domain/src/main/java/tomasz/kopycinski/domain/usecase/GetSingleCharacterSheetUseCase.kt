package tomasz.kopycinski.domain.usecase

import tomasz.kopycinski.domain.repository.CharacterSheetRepository
import javax.inject.Inject

class GetSingleCharacterSheetUseCase @Inject constructor(
    private val repository: CharacterSheetRepository
) {
    suspend operator fun invoke(id: Int) = repository.getCharacterSheetBy(id)
}
