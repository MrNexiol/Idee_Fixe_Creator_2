package tomasz.kopycinski.ideefixecreator2.ui.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import tomasz.kopycinski.ideefixecreator2.ui.theme.HalfCutCornerShape

@Composable
fun TextInput(
    value: String,
    onValueChange: (String) -> Unit,
    label: String = "",
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    shape: Shape = HalfCutCornerShape()
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) },
        keyboardOptions = keyboardOptions,
        shape = shape,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.medium)
        )
    )
}

@Composable
@Preview
fun TextInputPreview() {
    TextInput(value = "Content", onValueChange = {}, label = "Label")
}
