package com.example.paktaiv2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ForgotPasswordScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Header
        Text(text = "Forgot Password", fontSize = 24.sp)

        // Subtitle
        Text(text = "Enter your email account to reset your password", fontSize = 16.sp)

        // Email Input
        Spacer(modifier = Modifier.height(32.dp))
        BasicTextField(
            value = "", // Replace with your state variable
            onValueChange = { /* Update email state */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(Color.White) // Add a background to mimic the input field
        )

        // Reset Password Button
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { /* Handle reset password */ }) {
            Text(text = "Reset Password")
        }
    }
}
