package com.codekata.pokedex.ui.widgets


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codekata.pokedex.R

//https://pokeapi.co/

@Composable
fun SectionItemList() {
    Button(
        modifier = Modifier
            .width(150.dp)
            .height(72.dp),
        onClick = { /*TODO*/ }
    ) {
        Text(text = "Lorem1")
        Image(
            modifier = Modifier.size(24.dp),
            painter = painterResource(id = R.drawable.pokeball_background),
            contentDescription = "pokeball"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SectionItemListPreview() {
    SectionItemList()
}