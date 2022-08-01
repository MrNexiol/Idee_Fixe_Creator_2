package tomasz.kopycinski.ideefixecreator2.ui.navigation

sealed class Screen(val route: String) {
    object CharacterSheetList : Screen("charactersheet_list")
    object CharacterSheetCreator : Screen("charactersheet_creator")
}
