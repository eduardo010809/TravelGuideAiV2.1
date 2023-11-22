package com.example.travelguideaiv21.home.presentacion.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeFilterDialog(
    modifier: Modifier = Modifier
){
    AlertDialog(onDismissRequest = { /*TODO*/ }, modifier = modifier.fillMaxWidth(),
        confirmButton = {
            Button(onClick = { /*TODO*/ },
                modifier = modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    ) {
                Text(text = "Aplicar")
            }
        },
        text = {
            Column(modifier =  Modifier.fillMaxWidth()) {
                Row (modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                    ){
                    Text(text = "Personas")
                    HomeFilterIncrement(number = 1,
                        onMinus = { /*TODO*/ },
                        onPlus = { /*TODO*/ })
                }
                Spacer(modifier = Modifier.height(16.dp));
                Divider(modifier = Modifier.fillMaxWidth())
                Spacer(modifier = Modifier.height(16.dp));
                
                Row (modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Bares")
                    HomefilterCheckBox(onClick = { /*TODO*/ }, isChecked = false     )
                }

                Spacer(modifier = Modifier.height(16.dp));
                Divider(modifier = Modifier.fillMaxWidth())
                Spacer(modifier = Modifier.height(16.dp));

                Row (modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Discotecas")
                    HomefilterCheckBox(onClick = { /*TODO*/ }, isChecked = false     )
                }
            }
        }, shape = RoundedCornerShape(38.dp)
    )

}
@Preview
@Composable
fun HomeFilterDialogPreview(){
    HomeFilterDialog()
}