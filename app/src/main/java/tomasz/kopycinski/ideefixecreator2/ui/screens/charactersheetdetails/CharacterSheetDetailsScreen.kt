package tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetdetails

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun CharacterSheetDetailsScreen(
    characterSheetId: Int
) {
    Text(text = "Id = $characterSheetId")
}
