package tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetcreator

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import tomasz.kopycinski.domain.usecase.SaveCharacterSheetUseCase
import javax.inject.Inject

@HiltViewModel
class CharacterSheetCreatorViewModel @Inject constructor(
    private val saveCharacterSheetUseCase: SaveCharacterSheetUseCase
) : ViewModel() {

    var uiState by mutableStateOf(CharacterSheetCreatorUiState())
        private set

    fun saveCharacterSheet() = viewModelScope.launch {
//        saveCharacterSheetUseCase(uiState.characterSheet)
    }

    fun changeName(value: String) {
        uiState = uiState.copy(name = value)
    }

    fun changeSurName(value: String) {
        uiState = uiState.copy(surname = value)
    }

    fun changeAge(value: String) = try {
        val newValue = value.toInt()
        uiState = uiState.copy(age = newValue)
    } catch (e: Exception) {
        Log.d("ViewModel", e.toString())
    }

    fun changeGender(value: String) {
        uiState = uiState.copy(gender = value)
    }

    fun changeExperience(value: String) = try {
        val newValue = value.toInt()
        uiState = uiState.copy(experience = newValue)
    } catch (e: Exception) {
        Log.d("ViewModel", e.toString())
    }

    fun changeNotes(value: String) {
        uiState = uiState.copy(notes = value)
    }
}

data class CharacterSheetCreatorUiState(
    val name: String = "",
    val surname: String = "",
    val age: Int = 0,
    val gender: String = "",
    val experience: Int = 150,
    val notes: String = "",
)
