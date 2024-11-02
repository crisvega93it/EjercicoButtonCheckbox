package es.crisvega.ejercicobuttoncheckbox

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

@Composable
fun MyCheckBox(){
    var isChecked by rememberSaveable { mutableStateOf(false) }
    if(isChecked){
        Text("TEXTO NO VISIBLE")
    }
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = isChecked,
            onCheckedChange = {isChecked = it}
        )
        Text("Activar")
    }

}