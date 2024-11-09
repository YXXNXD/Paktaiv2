package com.example.paktaiv2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.paktaiv2.ui.theme.Paktaiv2Theme
import kotlinx.coroutines.delay
import androidx.compose.ui.platform.LocalContext


class NextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Paktaiv2Theme {
                NextAutoNavigateScreen() // เรียกใช้งาน Composable ฟังก์ชัน
            }
        }
    }
}

@Composable
fun NextAutoNavigateScreen() {
    val context = LocalContext.current

    LaunchedEffect(Unit) {
        delay(1000)
        val intent = Intent(context, SignInActivity::class.java)
        context.startActivity(intent)
    }

    // UI จะแสดงอยู่ที่นี่ในระหว่างรอ
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Welcome to Sign In", fontSize = 24.sp)
    }
}


@Preview(showBackground = true)
@Composable
fun AutoNavigateScreenPreview() {
    Paktaiv2Theme {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "Preview of Sign In", fontSize = 24.sp)
        }
    }
}
