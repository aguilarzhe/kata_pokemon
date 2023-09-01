package com.codekata.pokedex.ui.view

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.codekata.pokedex.ui.theme.PokedexTheme
import com.codekata.pokedex.ui.widgets.SectionItemList

@Composable
fun HomeScreen(viewModel: ViewModel) {
    val state = viewModel.state.collectLifecycle()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "What pokemon are you looking for?",
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(16.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Buscar...")
        }

        Spacer(modifier = Modifier.height(16.dp))

        SectionItemList("Pokebola", Modifier) {
            navHost.navigate()
            viewModel.registrarEvento()
        }

    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PokedexTheme {
        HomeScreen()
    }
}