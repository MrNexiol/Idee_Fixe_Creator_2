package tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetcreator

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import tomasz.kopycinski.domain.usecase.SaveCharacterSheetUseCase
import javax.inject.Inject

@HiltViewModel
class CharacterSheetCreatorViewModel @Inject constructor(
    saveCharacterSheetUseCase: SaveCharacterSheetUseCase
) : ViewModel() {
}
