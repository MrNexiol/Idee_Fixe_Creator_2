package tomasz.kopycinski.domain.usecase

import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import tomasz.kopycinski.domain.repository.CharacterSheetRepository

class DeleteCharacterSheetUseCaseTest {
    private lateinit var repository: CharacterSheetRepository
    private lateinit var deleteCharacterSheetUseCase: DeleteCharacterSheetUseCase

    @Before
    fun setup() {
        repository = mockk(relaxed = true)
        deleteCharacterSheetUseCase = DeleteCharacterSheetUseCase(repository)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun callsRepositoryGetCharacterSheetMethod() = runTest {
        val testId = 0
        deleteCharacterSheetUseCase(testId)

        coVerify(exactly = 1) { repository.deleteCharacterSheet(testId) }
    }
}
