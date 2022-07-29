package tomasz.kopycinski.domain.usecase

import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import tomasz.kopycinski.domain.model.CharacterSheet
import tomasz.kopycinski.domain.repository.CharacterSheetRepository

class SaveCharacterSheetUseCaseTest {
    private lateinit var repository: CharacterSheetRepository
    private lateinit var saveCharacterSheetUseCase: SaveCharacterSheetUseCase

    @Before
    fun setup() {
        repository = mockk(relaxed = true)
        saveCharacterSheetUseCase = SaveCharacterSheetUseCase(repository)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun callsRepositoryGetCharacterSheetMethod() = runTest {
        val testCharacterSheet = mockk<CharacterSheet>()
        saveCharacterSheetUseCase(testCharacterSheet)

        coVerify(exactly = 1) { repository.save(testCharacterSheet) }
    }
}
