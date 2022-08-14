package tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetdetails

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import tomasz.kopycinski.domain.usecase.GetSingleCharacterSheetUseCase
import javax.inject.Inject

@HiltViewModel
class CharacterSheetDetailsViewModel @Inject constructor(
    getSingleCharacterSheetUseCase: GetSingleCharacterSheetUseCase
) : ViewModel() {
}
