package tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetcreator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import tomasz.kopycinski.domain.model.CharacterSheet
import tomasz.kopycinski.domain.usecase.SaveCharacterSheetUseCase
import java.util.Date
import javax.inject.Inject

@HiltViewModel
class CharacterSheetCreatorViewModel @Inject constructor(
    private val saveCharacterSheetUseCase: SaveCharacterSheetUseCase
) : ViewModel() {

    var uiState by mutableStateOf(CharacterSheetCreatorUiState())

    fun saveCharacterSheet() = viewModelScope.launch {
        saveCharacterSheetUseCase(uiState.characterSheet)
    }
}

data class CharacterSheetCreatorUiState(
    val characterSheet: CharacterSheet = CharacterSheet(0, "Preview", "Character", 21, "Male", Date(), 150, 0, 10000.0, 0.0, 0.0, "")
)
