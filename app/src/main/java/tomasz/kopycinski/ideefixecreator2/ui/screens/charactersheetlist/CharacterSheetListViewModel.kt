package tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import tomasz.kopycinski.domain.model.CharacterSheet
import tomasz.kopycinski.domain.usecase.GetListOfCharacterSheetsUseCase
import javax.inject.Inject

@HiltViewModel
class CharacterSheetListViewModel @Inject constructor(
    private val getListOfCharacterSheetsUseCase: GetListOfCharacterSheetsUseCase
) : ViewModel() {

    private var _characterSheets = MutableStateFlow<List<CharacterSheet>>(listOf())

    val characterSheets: StateFlow<List<CharacterSheet>> = _characterSheets.asStateFlow()

    init {
        viewModelScope.launch {
            getListOfCharacterSheetsUseCase().collect {
                _characterSheets.value = it
            }
        }
    }
}
