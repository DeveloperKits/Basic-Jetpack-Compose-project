package net.congressia.apb.first_project

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.congressia.apb.first_project.meditation.MeditationMain
import net.congressia.apb.first_project.ui.theme.First_projectTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            First_projectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UserInterface()
                }
            }
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterial3Api::class)
@Composable
fun UserInterface(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val keyboardController = LocalSoftwareKeyboardController.current
    val name = remember { mutableStateOf("") }
    val nameList = remember { mutableStateListOf<String>(
        context.getString(R.string.title),
        context.getString(R.string.sub_title),
        context.getString(R.string.description)
    ) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp, 20.dp, 20.dp, 0.dp)
    ) {
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom
        ) {
            OutlinedTextField(
                value = name.value,
                onValueChange = {name.value = it},
                label = { Text(
                    text = "Enter your name...",
                    style = MaterialTheme.typography.labelMedium
                ) },
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                keyboardActions = KeyboardActions(
                    onDone = {
                        keyboardController?.hide()
                    }
                ),

                modifier = modifier.weight(1f)
            )

            Spacer(modifier = modifier.width(5.dp))

            Button(
                onClick = {
                    if (name.value.isNotBlank()){
                        nameList.add(name.value)
                        name.value = ""
                    }
                },
                shape = RoundedCornerShape(7.dp),

            ) {
                Text(
                    text = "Add",
                    style = MaterialTheme.typography.labelMedium
                )
            }
        }

        Spacer(modifier = modifier.height(3.dp))

        LazyColumn{
            items(
                nameList.size
            ){index ->
                if (index == 0){
                    Spacer(modifier = modifier.height(15.dp))
                }

                Card(
                    onClick = {context.startActivity(Intent(context, MeditationMain::class.java))},
                    modifier = modifier
                        .fillMaxWidth(),

                    shape = RoundedCornerShape(10.dp),
                    enabled = true

                ) {
                    Column() {
                        Image(
                            painter = painterResource(id = R.drawable.bg_compose_background),
                            contentDescription = null
                        )
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(15.dp, 15.dp),

                            text = nameList[index],
                            textAlign = TextAlign.Justify,
                            color = Color.Gray,
                        )
                    }
                }

                Spacer(modifier = modifier.height(15.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    First_projectTheme {
        UserInterface()
    }
}