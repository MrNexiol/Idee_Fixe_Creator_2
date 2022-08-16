package tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetdetails

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun CharacterSheetDetailsScreen(
    characterSheetId: Int,
    viewModel: CharacterSheetDetailsViewModel = hiltViewModel()
) {
    val uiState = viewModel.uiState

    LaunchedEffect(Unit) {
        viewModel.updateUiState(characterSheetId)
    }

    if (uiState.loading) {
        Text(text = "Loading")
    } else {
        Text(text = "Id = ${uiState.characterSheet!!.surname}")
    }
}
