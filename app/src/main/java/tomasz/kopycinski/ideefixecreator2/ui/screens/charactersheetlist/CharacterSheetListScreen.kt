package tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetlist

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import tomasz.kopycinski.ideefixecreator2.ui.components.CharacterSheetListItem

@Composable
fun CharacterSheetList(
    navigateToCreator: () -> Unit,
    viewModel: CharacterSheetListViewModel = hiltViewModel()
) {
    val characterSheets by viewModel.characterSheets.collectAsState()

    LaunchedEffect(Any()) {
        viewModel.collectCharacterSheets()
    }

    LazyColumn {
        items(characterSheets) {
            CharacterSheetListItem(characterSheet = it)
        }
        item { 
            Button(onClick = { navigateToCreator() }) {
                Text(text = "Go to creator")
            }
        }
    }
}
