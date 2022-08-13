package tomasz.kopycinski.ideefixecreator2.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(0.dp)
)

class HalfCutCornerShape(private val cornerRadius: Float = 32f) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return Outline.Generic(
            path = Path().apply {
                moveTo(0f + cornerRadius, 0f)
                lineTo(size.width, 0f)
                lineTo(size.width, size.height - cornerRadius)
                lineTo(size.width - cornerRadius, size.height)
                lineTo(0f, size.height)
                lineTo(0f, 0f + cornerRadius)
                close()
            }
        )
    }
}
