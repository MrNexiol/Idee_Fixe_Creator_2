package tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetlist

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import tomasz.kopycinski.domain.usecase.GetListOfCharacterSheetsUseCase
import javax.inject.Inject

@HiltViewModel
class CharacterSheetListViewModel @Inject constructor(
    private val getListOfCharacterSheetsUseCase: GetListOfCharacterSheetsUseCase
) : ViewModel() {
}
