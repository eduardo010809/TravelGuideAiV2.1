package com.example.travelguideaiv21.home.presentacion.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.nio.file.WatchEvent

@Composable
fun HomeFilterIncrement(
    number: Int,
    onMinus: () -> Unit,
    onPlus: () -> Unit,
    modifier: Modifier = Modifier
){
    Row (modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically


    ){
        HomefilterSettingsButton(onClick = onMinus,
            icon = Icons.Default.Add)
       Text(text = "$number")
        HomefilterSettingsButton(onClick = onPlus,
            icon = Icons.Default.Add)
        /*IconButton(onClick = onPlus,
            modifier =   Modifier.background(
                color = Color.Transparent,
                shape = RoundedCornerShape(10.dp)
            ) )
            {

        }*/
    }
}
@Preview
@Composable
fun HomeFilterIncrementPreview(){
    HomeFilterIncrement(number = 5,
        onMinus = {},
        onPlus = {})
}