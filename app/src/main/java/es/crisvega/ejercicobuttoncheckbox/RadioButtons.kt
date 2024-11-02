package es.crisvega.ejercicobuttoncheckbox

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

@Composable
fun RadioButtons(){
    var selected by rememberSaveable { mutableStateOf("Radio1") }
    Row (verticalAlignment = Alignment.CenterVertically){
        RadioButton(
            selected = selected == "Radio 1",
            onClick = {selected = "Radio 1"}
        )
        Text("Radio 1")
    }
    Row (verticalAlignment = Alignment.CenterVertically){
        RadioButton(
            selected = selected == "Radio 2",
            onClick = {selected = "Radio 2"}
        )
        Text("Radio 2")
    }
    Row (verticalAlignment = Alignment.CenterVertically){
        RadioButton(
            selected = selected == "Radio 3",
            onClick = {selected = "Radio 3"}
        )
        Text("Radio 3")
    }
    Text("Texto Actualizable: "+selected)
}