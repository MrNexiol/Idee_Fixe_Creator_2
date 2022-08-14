package tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetdetails

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun CharacterSheetDetailsScreen(
    characterSheetId: Int,
    viewModel: CharacterSheetDetailsViewModel = hiltViewModel()
) {
    Text(text = "Id = $characterSheetId")
}
