package com.example.paktaiv2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.paktaiv2.ui.theme.Paktaiv2Theme

class SignInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Paktaiv2Theme {
                SignInScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInScreen() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(32.dp))

        // Title
        Text(
            text = "Sign in now",
            fontSize = 24.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Email Input
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Enter e-mail") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Password Input
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            singleLine = true,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Forgot Password Text
        Text(
            text = "Forgot Password?",
            color = Color.Gray,
            modifier = Modifier
                .align(Alignment.End)
                .padding(end = 8.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Sign In Button
        Button(
            onClick = { /* Handle Sign In */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .padding(8.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF90A889))
        ) {
            Text(text = "Sign In", color = Color.White)
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Sign Up Link
        Row {
            Text(text = "Don't have an account?")
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "Sign up",
                color = Color(0xFF90A889),
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignInScreenPreview() {
    Paktaiv2Theme {
        SignInScreen()
    }
}
