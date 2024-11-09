package com.example.paktaiv2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter

class RecommendationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecommendationScreen()
        }
    }
}

@Composable
fun RecommendationScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(
            text = "สถานที่แนะนำ",
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "Recommend",
            fontSize = 16.sp
        )

        // Recommendations List
        LazyColumn {
            items(10) { index ->
                ImageWithText(imageUrl = "url_to_image_$index", label = "Item $index")
            }
        }

        // View More Button
        Button(onClick = { /* Handle view more */ }) {
            Text(text = "View More")
        }
    }
}

@Composable
fun ImageWithText(imageUrl: String, label: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(8.dp)
    ) {
        Image(
            painter = rememberImagePainter(imageUrl),
            contentDescription = null,
            modifier = Modifier.size(100.dp).padding(bottom = 4.dp)
        )
        Text(text = label)
    }
}

