package net.congressia.apb.first_project

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.congressia.apb.first_project.ui.theme.Beige1
import net.congressia.apb.first_project.ui.theme.Beige2
import net.congressia.apb.first_project.ui.theme.Beige3
import net.congressia.apb.first_project.ui.theme.First_projectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            First_projectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UI()
                }
            }
        }
    }
}

@Composable
fun UI(modifier: Modifier = Modifier) {
    Column {
        val context = LocalContext.current

        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null
        )

        Text(
            text = stringResource(id = R.string.title),
            modifier = modifier.padding(16.dp, 16.dp),
            style = MaterialTheme.typography.titleMedium,
            color = Beige3
        )

        Text(
            text = stringResource(id = R.string.sub_title),
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp, 0.dp, 16.dp, 0.dp),
            style = MaterialTheme.typography.bodySmall,
            color = Beige2
        )

        Text(
            text = stringResource(id = R.string.description),
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp, 16.dp, 16.dp, 16.dp),
            style = MaterialTheme.typography.bodySmall,
            color = Beige2
        )

        Spacer(modifier = modifier.weight(1f))

        Button(
            shape = RoundedCornerShape(5.dp),
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp),

            onClick = { context.startActivity(Intent(context, SecondActivity::class.java))}
        ) {
            Text(
                text = "Next Page",
                style = MaterialTheme.typography.labelLarge
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    First_projectTheme {
        UI()
    }
}