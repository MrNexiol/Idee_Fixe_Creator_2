package tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetlist

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import tomasz.kopycinski.ideefixecreator2.R
import tomasz.kopycinski.ideefixecreator2.ui.components.CharacterSheetListItem

@Composable
fun CharacterSheetList(
    navigateToCreator: () -> Unit,
    viewModel: CharacterSheetListViewModel = hiltViewModel()
) {
    val uiState = viewModel.uiState

    LaunchedEffect(Any()) {
        viewModel.updateUiState()
    }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { navigateToCreator() }) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = stringResource(id = R.string.add)
                )
            }
        }
    ) {
        LazyColumn {
            items(uiState.characterSheets) {
                CharacterSheetListItem(characterSheet = it)
            }
        }
    }
}
