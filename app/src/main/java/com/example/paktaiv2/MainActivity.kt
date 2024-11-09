package com.example.paktaiv2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.paktaiv2.ui.theme.Paktaiv2Theme
import kotlinx.coroutines.delay
import androidx.compose.ui.platform.LocalContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Paktaiv2Theme {
                MainAutoNavigateScreen()
            }
        }
    }
}

@Composable
fun MainAutoNavigateScreen() {
    // ดึง context จาก LocalContext
    val context = LocalContext.current

    // ใช้ LaunchedEffect เพื่อรอ 2 วินาทีแล้วไปหน้าถัดไป
    LaunchedEffect(Unit) {
        delay(1000) // รอ 2 วินาที
        // หลังจากรอเสร็จ ให้เปลี่ยนหน้าไปยัง SignInActivity
        val intent = Intent(context, SignInActivity::class.java)
        context.startActivity(intent)
    }

    // UI จะแสดงอยู่ที่นี่ในระหว่างรอ
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF90A889))
    ) {
        Text(
            text = "PAKTAI",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFF4F1E0)
        )
    }
}

