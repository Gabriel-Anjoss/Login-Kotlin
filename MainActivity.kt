package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}
@Composable
fun App(){
    Column(
        Modifier

            .fillMaxWidth()

    ) {
        Row(  Modifier
            .padding(15.dp)) {
        }

        Row (
            Modifier

                .fillMaxWidth(),
            Arrangement.Center)   {
            Text(text = "App Cadastro ", fontWeight = FontWeight.Bold, fontSize = 30.sp)
        }
        Row(  Modifier
            .padding(15.dp)) {
        }

        Column{
            Row (Modifier
                .fillMaxWidth(),
                Arrangement.Center
            )
            {
                var text by remember { mutableStateOf("")}

                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Nome") }
                )
            }

        }
        Row( Modifier
            .padding(20.dp)) {
        }


        Row (Modifier
            .fillMaxWidth(),
            Arrangement.Center
        )
        {
            var text by remember { mutableStateOf("")}

            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Endereço") }
            )
        }

        Row( Modifier
            .padding(20.dp)) {
        }


        Row (Modifier
            .fillMaxWidth(),
            Arrangement.Center
        )
        {
            var text by remember { mutableStateOf("")}

            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Bairro") }
            )
        }

        Row( Modifier
            .padding(20.dp)) {
        }


        Row (Modifier
            .fillMaxWidth(),
            Arrangement.Center
        )
        {
            var text by remember { mutableStateOf("")}

            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("CEP") }
            )
        }

        Row( Modifier
            .padding(20.dp)) {
        }


        Row (Modifier
            .fillMaxWidth(),
            Arrangement.Center
        )
        {
            var text by remember { mutableStateOf("")}

            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Cidade") }
            )
        }

        Row( Modifier
            .padding(20.dp)) {
        }


        Row (Modifier
            .fillMaxWidth(),
            Arrangement.Center
        )
        {
            var text by remember { mutableStateOf("")}

            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Estado") }
            )
        }
        Row( Modifier
            .padding(20.dp)) {
        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center)
        {
            Button(onClick = { /*TODO*/ },
                Modifier.height(80.dp),


                ) {
                Text(text = "Cadastrar")
            }
        }
    }

}



@Composable
@Preview
fun AppPrebiew() {
    MyApplicationTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}