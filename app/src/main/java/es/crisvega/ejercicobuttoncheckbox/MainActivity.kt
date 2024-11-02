package es.crisvega.ejercicobuttoncheckbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import es.crisvega.ejercicobuttoncheckbox.ui.theme.EjercicoButtonCheckboxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjercicoButtonCheckboxTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var state by rememberSaveable { mutableStateOf(false) }
    Column(modifier = modifier.fillMaxSize()
        .padding(top = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        Icon(imageVector = Icons.Rounded.LocationOn,
            modifier = Modifier.size(48.dp),
            contentDescription = "Icono",
            tint = Color.Green
        )
        MyButton()
        MyCheckBox()
        Switch(checked = state, onCheckedChange = {state = !state}, enabled = true)
        if(state) {
            RadioButtons()
        }
        ImageSwitcher()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EjercicoButtonCheckboxTheme {
        Greeting("Android")
    }
}