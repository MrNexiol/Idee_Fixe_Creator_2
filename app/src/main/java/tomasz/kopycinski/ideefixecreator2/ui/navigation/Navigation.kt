package tomasz.kopycinski.ideefixecreator2.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetcreator.CharacterSheetCreator
import tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetdetails.CharacterSheetDetailsScreen
import tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetlist.CharacterSheetList

@Composable
fun Navigation(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = Screen.CharacterSheetList.route) {
        composable(Screen.CharacterSheetList.route) {
            CharacterSheetList(navigateToCreator = {
                navHostController.navigate(Screen.CharacterSheetCreator.route)
            })
        }
        composable(Screen.CharacterSheetCreator.route) {
            CharacterSheetCreator()
        }
        composable(
            route = Screen.CharacterSheetDetails.route,
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) { backStackEntry ->
            CharacterSheetDetailsScreen(characterSheetId = 2)
        }
    }
}
