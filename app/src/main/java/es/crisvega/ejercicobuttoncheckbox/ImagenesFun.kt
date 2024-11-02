package es.crisvega.ejercicobuttoncheckbox

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ImageSwitcher() {

    var currentImage by remember { mutableStateOf(R.drawable.image1) }


    val images = listOf(R.drawable.image1, R.drawable.image2jpg, R.drawable.image3)


    var imageIndex by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = currentImage),
            contentDescription = "Imagen Cambiante",
            modifier = Modifier
                .size(200.dp)
                .clickable {

                    imageIndex = (imageIndex + 1) % images.size
                    currentImage = images[imageIndex]
                }
        )

        Button(onClick = {

            imageIndex = (imageIndex + 1) % images.size
            currentImage = images[imageIndex]
        }) {
            Text(text = "Cambiar imagen")
        }
    }
}