package tomasz.kopycinski.ideefixecreator2.ui.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TextInput(
    value: String,
    onValueChange: (String) -> Unit,
    label: String = "",
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default
) {
    OutlinedTextField(
        value = value,
        label = { Text(text = label) },
        onValueChange = onValueChange,
        keyboardOptions = keyboardOptions
    )
}

@Composable
@Preview
fun TextInputPreview() {
    TextInput(value = "Content", onValueChange = {}, label = "Label")
}
