package tomasz.kopycinski.ideefixecreator2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import tomasz.kopycinski.ideefixecreator2.ui.navigation.Navigation
import tomasz.kopycinski.ideefixecreator2.ui.theme.IdeeFixeCreator2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IdeeFixeCreator2Theme {
                val navHostController = rememberNavController()

                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Navigation(navHostController = navHostController)
                }
            }
        }
    }
}
