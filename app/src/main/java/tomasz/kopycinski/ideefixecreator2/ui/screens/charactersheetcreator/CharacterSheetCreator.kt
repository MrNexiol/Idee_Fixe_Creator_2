package tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetcreator

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun CharacterSheetCreator(
    viewModel: CharacterSheetCreatorViewModel = hiltViewModel()
) {
    Text(text = "Creator")
}
