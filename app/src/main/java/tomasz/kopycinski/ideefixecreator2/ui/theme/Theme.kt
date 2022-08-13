package tomasz.kopycinski.ideefixecreator2.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColors(
    primary = primary,
    secondary = secondary,
    background = background,
    onBackground = onBackground,
    onSurface = primary
)

@Composable
fun IdeeFixeCreator2Theme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
