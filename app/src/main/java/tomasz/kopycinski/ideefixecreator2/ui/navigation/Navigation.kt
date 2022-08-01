package tomasz.kopycinski.ideefixecreator2.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetcreator.CharacterSheetCreator
import tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetlist.CharacterSheetList

@Composable
fun Navigation(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = Screen.CharacterSheetList.route) {
        composable(Screen.CharacterSheetList.route) {
            CharacterSheetList()
        }
        composable(Screen.CharacterSheetCreator.route) {
            CharacterSheetCreator()
        }
    }
}
