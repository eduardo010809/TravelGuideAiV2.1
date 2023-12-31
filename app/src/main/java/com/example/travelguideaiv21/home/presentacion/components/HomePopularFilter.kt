package com.example.travelguideaiv21.home.presentacion.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.capitalize
import com.example.travelguideaiv21.home.domain.model.Region

@Composable
fun HomePopularFilter(
    selectedRegion: Region,
    selectRegion: (Region) -> Unit,
    modifier: Modifier = Modifier
){
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    )
    {
        Region.values().forEach{
            val textColor = if (it == selectedRegion)
                Color.Green else Color.Gray
            TextButton(onClick = {selectRegion(it)}) {
              Text(text = it.name.lowercase().capitalize(Locale.current),
                 color = textColor
                  )
            }
        }

    }
}