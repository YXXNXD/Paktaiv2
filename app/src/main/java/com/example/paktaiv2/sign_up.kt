package com.example.paktaiv2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.input.PasswordVisualTransformation

class SignUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SignUpScreen()
        }
    }
}

@Composable
fun SignUpScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Sign up now", fontSize = 24.sp, modifier = Modifier.padding(bottom = 8.dp))
        Text(text = "Please fill the details and create account", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(16.dp))

        // Name Input
        TextField(
            value = "",
            onValueChange = {},
            label = { Text("Enter Name") },
            modifier = Modifier.fillMaxWidth()
        )

        // Email Input
        TextField(
            value = "",
            onValueChange = {},
            label = { Text("Enter e-mail") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        // Password Input
        TextField(
            value = "",
            onValueChange = {},
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth(),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Text(text = "Password must be 8 character", fontSize = 12.sp)

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Handle sign up */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Sign Up")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Already have an account? Sign in")
        Text(text = "Or connect")
    }
}
