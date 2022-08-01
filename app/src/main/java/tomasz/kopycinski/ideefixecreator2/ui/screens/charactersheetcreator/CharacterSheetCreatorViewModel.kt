package tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetcreator

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

    private val characterSheet =
        CharacterSheet(0, "Preview", "Character", 21, "Male", Date(), 150, 0, 10000.0, 0.0, 0.0, "")


    fun saveCharacterSheet() = viewModelScope.launch {
        saveCharacterSheetUseCase(characterSheet)
    }
}
