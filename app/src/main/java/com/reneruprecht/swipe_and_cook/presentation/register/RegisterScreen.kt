package com.reneruprecht.swipe_and_cook.presentation.register

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun RegisterScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

    }
    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val email = remember { mutableStateOf(TextFieldValue()) }
        val password = remember { mutableStateOf(TextFieldValue()) }

        Text(
            text = "Register",
            style = TextStyle(fontSize = 30.sp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            label = {
                Text(
                    text = "Email",
                )
            },
            value = email.value,
            onValueChange = { email.value = it },
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            label = {
                Text(
                    text = "Password",
                )
            },
            value = password.value,
            onValueChange = { password.value = it },
        )

        Spacer(modifier = Modifier.height(20.dp))

        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(
                onClick = {},
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
            ) {
                Text(text = "Register")
            }
        }
    }
}