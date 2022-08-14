package tomasz.kopycinski.ideefixecreator2.ui.navigation

sealed class Screen(val route: String) {
    object CharacterSheetList : Screen("charactersheet_list")
    object CharacterSheetCreator : Screen("charactersheet_creator")
    object CharacterSheetDetails : Screen("charactersheet_details/{id}") {
        fun createRoute(id: Int): String = "charactersheet_details/$id"
    }
}
