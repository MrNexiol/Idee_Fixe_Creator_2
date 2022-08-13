package tomasz.kopycinski.ideefixecreator2.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tomasz.kopycinski.domain.model.CharacterSheet
import tomasz.kopycinski.ideefixecreator2.ui.theme.HalfCutCornerShape
import java.util.Date

@Composable
fun CharacterSheetListItem(
    characterSheet: CharacterSheet
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .border(2.dp, MaterialTheme.colors.primary, HalfCutCornerShape())
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = characterSheet.fullName())
        Text(text = characterSheet.experiencePoints())
    }
}

@Composable
@Preview
fun CharacterSheetListItemPreview() {
    val characterSheet =
        CharacterSheet(0, "Preview", "Character", 21, "Male", Date(), 150, 0, 10000.0, 0.0, 0.0, "")
    CharacterSheetListItem(characterSheet = characterSheet)
}
