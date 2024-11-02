package es.crisvega.ejercicobuttoncheckbox

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun MyButton(){
    var pulsadoBoton by rememberSaveable { mutableStateOf(false) }
    var presionado by rememberSaveable { mutableStateOf("Presionar") }
    val coroutineScope = rememberCoroutineScope()

    Button(onClick = {
        presionado = "Botón presionado"
        pulsadoBoton = true
        if(pulsadoBoton) {
            coroutineScope.launch {
                delay(5000)
                presionado = "Presionar"
                pulsadoBoton = false
            }
        }


    }
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(presionado)
        }
    }
    Row(verticalAlignment = Alignment.CenterVertically) { if(pulsadoBoton) {
        CircularProgressIndicator(color = Color.Green, strokeWidth = 10.dp)
    } }
}