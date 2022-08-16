package tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetdetails

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import tomasz.kopycinski.domain.model.CharacterSheet
import tomasz.kopycinski.domain.usecase.GetSingleCharacterSheetUseCase
import javax.inject.Inject

@HiltViewModel
class CharacterSheetDetailsViewModel @Inject constructor(
    private val getSingleCharacterSheetUseCase: GetSingleCharacterSheetUseCase,
) : ViewModel() {

    var uiState by mutableStateOf(CharacterSheetDetailsUiState())
        private set

    fun updateUiState(id: Int) = viewModelScope.launch {
        uiState = uiState.copy(
            loading = false,
            characterSheet = getSingleCharacterSheetUseCase(id)
        )
    }
}

data class CharacterSheetDetailsUiState(
    val loading: Boolean = true,
    val characterSheet: CharacterSheet? = null
)
