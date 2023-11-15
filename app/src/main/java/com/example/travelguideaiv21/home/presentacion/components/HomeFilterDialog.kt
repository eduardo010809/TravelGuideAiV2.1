package com.example.travelguideaiv21.home.presentacion.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeFilterDialog(
    modifier: Modifier = Modifier
){
    AlertDialog(onDismissRequest = { /*TODO*/ },
        confirmButton = {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Aplicar")
            }
        }, text = {
            Text(text ="Hola wey")
        }, shape = RoundedCornerShape(38.dp)
    )

}
@Preview
@Composable
fun HomeFilterDialogPreview(){
    HomeFilterDialog()
}