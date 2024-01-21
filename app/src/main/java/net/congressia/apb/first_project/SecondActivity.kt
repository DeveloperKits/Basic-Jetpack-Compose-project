package net.congressia.apb.first_project

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

@OptIn(ExperimentalComposeUiApi::class)
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
            modifier = modifier.fillMaxWidth()
        ) {
            OutlinedTextField(
                value = name.value,
                onValueChange = {name.value = it},
                label = { Text(text = "Enter your name...")},
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
                modifier = modifier.padding(0.dp, 10.dp)
            ) {
                Text(text = "Add")
            }
        }

        Spacer(modifier = modifier.height(10.dp))

        LazyColumn{
            items(
                nameList.size
            ){index ->
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 10.dp),

                    text = nameList[index],
                    textAlign = TextAlign.Justify,
                    color = Color.Gray,
                )

                if (nameList.size != index+1) {
                    Log.d("index", "Size = ${nameList.size} & index = $index")
                    Divider()
                }else{
                    Spacer(modifier = modifier.height(10.dp))
                }
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