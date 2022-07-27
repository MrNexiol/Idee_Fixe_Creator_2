package tomasz.kopycinski.domain.usecase

import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import tomasz.kopycinski.domain.repository.CharacterSheetRepository

class GetListOfCharacterSheetsUseCaseTest {

    private lateinit var repository: CharacterSheetRepository
    private lateinit var getListOfCharacterSheetsUseCase: GetListOfCharacterSheetsUseCase

    @Before
    fun setup() {
        repository = mockk(relaxed = true)
        getListOfCharacterSheetsUseCase = GetListOfCharacterSheetsUseCase(repository)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun callsRepositoryGetListOfCharacterSheetsMethod() = runTest {
        getListOfCharacterSheetsUseCase()

        coVerify(exactly = 1) { repository.getListOfCharacterSheets() }
    }
}
