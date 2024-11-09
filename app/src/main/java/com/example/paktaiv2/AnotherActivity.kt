package com.example.paktaiv2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class AnotherActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // ใส่ UI หรือฟังก์ชันที่ต้องการในหน้าใหม่
        }
    }
}
