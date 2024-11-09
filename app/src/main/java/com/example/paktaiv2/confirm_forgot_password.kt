package com.example.paktaiv2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ForgotPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        // Initialize views
        val emailDisplay: TextView = findViewById(R.id.email_display)
        val codeInput: EditText = findViewById(R.id.code_input)
        val confirmButton: Button = findViewById(R.id.confirm_button)

        // Set email to display
        emailDisplay.text = "xxxxxx@gmail.com" // Replace with actual email from previous screen

        // Set confirm button listener
        confirmButton.setOnClickListener {
            val enteredCode = codeInput.text.toString()
            // Add logic to handle the confirmation of the entered code
        }
    }
}
