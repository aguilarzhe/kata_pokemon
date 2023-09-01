package com.codekata.pokedex.ui.widgets


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codekata.pokedex.R

//https://pokeapi.co/

@Composable
fun SectionItemList(title: String, modifier: Modifier, onClick : () -> Unit = {}) {
    Button(
        shape = RoundedCornerShape(16.dp),
        contentPadding = PaddingValues(),
        modifier = Modifier
            .width(150.dp)
            .height(72.dp)
            .defaultMinSize(minWidth = 0.dp, minHeight = 0.dp),
        onClick = { /*TODO*/ }
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                alpha = 0.2f,
                modifier = Modifier
                    .fillMaxHeight()
                    .align(Alignment.CenterEnd)
                    .width(68.dp),
                contentScale = ContentScale.Crop,
                alignment = Alignment.CenterStart,
                painter = painterResource(id = R.drawable.pokeball_background),
                contentDescription = "pokeball"
            )
            Text(
                text = "Locations",
                modifier = Modifier
                    .align(
                        alignment = Alignment.CenterStart
                    )
                    .padding(start = 16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SectionItemListPreview() {
    SectionItemList()
}