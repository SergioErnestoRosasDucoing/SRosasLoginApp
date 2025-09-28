package com.example.loginapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil3.compose.AsyncImage
import com.example.loginapp.R
import com.example.loginapp.components.ButtonBlack
import com.example.loginapp.components.TextFieldComponent
import com.example.loginapp.ui.theme.Background
import com.example.loginapp.ui.theme.LoginAppTheme
import com.example.loginapp.ui.theme.RegisterScreenRoute

@Composable
fun RegisterScreen(navController: NavController) {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
    )
    {
        AsyncImage(
            model = "https://i.pinimg.com/736x/c0/d8/54/c0d8541f82efc52aed82c3208e349c93.jpg",
            contentDescription = "Background",
            placeholder = painterResource(R.drawable.ic_launcher_background),
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column (
            modifier = Modifier
                .fillMaxSize()
        ) {
            Row (
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .height(110.dp)
                        .width(110.dp)
                        .clip(RoundedCornerShape(
                            topStart = 25.dp,
                            bottomStart = 25.dp,
                            bottomEnd = 25.dp
                        ))
                        .background(Color.White),
                    contentAlignment = Alignment.Center
                ){
                    Box(
                        modifier = Modifier
                            .size(55.dp)
                            .clip(RoundedCornerShape(
                                topStart = 27.5.dp,
                                topEnd = 27.5.dp,
                                bottomEnd = 27.5.dp

                            ))
                            .background(Color.Black)
                    )

                }
            }
            Column (
                modifier = Modifier
                    .weight(2f)
                    .fillMaxSize()
                    .clip(RoundedCornerShape(topStart = 90.dp))
                    .background(Background),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Login",
                    fontSize = 36.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(top = 50.dp)
                )

                TextFieldComponent(
                    label = "Email",
                    value = email,
                    onValueChange = { email = it }
                )

                TextFieldComponent(
                    label = "Password",
                    value = password,
                    onValueChange = { password = it },
                    isPassword = true
                )

                ButtonBlack(
                    text = "Login",
                    onClick = {  },
                    modifier = Modifier.padding(bottom = 10.dp)
                )

                TextButton(onClick = { navController.navigate(RegisterScreenRoute) }) {
                    Text(
                        text ="Don’t have an account? Sign Up",
                        color = Color.Black,
                        modifier = Modifier
                            .padding(bottom = 40.dp)
                    )
                }




            }

        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun RegisterScreenPreview() {
    LoginAppTheme {
        RegisterScreen(navController = rememberNavController())
    }
}
