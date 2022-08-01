package tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetlist

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import tomasz.kopycinski.domain.model.CharacterSheet
import tomasz.kopycinski.domain.usecase.GetListOfCharacterSheetsUseCase
import javax.inject.Inject

@HiltViewModel
class CharacterSheetListViewModel @Inject constructor(
    private val getListOfCharacterSheetsUseCase: GetListOfCharacterSheetsUseCase
) : ViewModel() {

    var uiState by mutableStateOf(CharacterSheetListUiState())
        private set

    fun updateUiState() = viewModelScope.launch {
        getListOfCharacterSheetsUseCase().collect {
            uiState = uiState.copy(characterSheets = it)
        }
    }
}

data class CharacterSheetListUiState(
    val characterSheets: List<CharacterSheet> = emptyList()
)
