package net.congressia.apb.first_project.meditation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.congressia.apb.first_project.R
import net.congressia.apb.first_project.ui.theme.ButtonBlue
import net.congressia.apb.first_project.ui.theme.DarkerButtonBlue
import net.congressia.apb.first_project.ui.theme.DeepBlue
import net.congressia.apb.first_project.ui.theme.TextWhite

@Composable
fun HomePage() {
    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
            .padding(horizontal = 15.dp)
    ) {
        Column {
            GreetingSection()
            Spacer(modifier = Modifier.height(30.dp))
            ChipSection(chips = listOf("Sweet sleep", "Insomnia", "Depression", "Happy"))
        }
    }
}

@Composable
fun GreetingSection(
    name: String = "Akash"
) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Column (
            verticalArrangement = Arrangement.Center
        ){
            Text(
                text = "Good To See You $name",
                color = TextWhite,
                style = MaterialTheme.typography.titleMedium,
                fontSize = 22.sp,

            )

            Text(
                text = "We wish you have a good day",
                style = MaterialTheme.typography.bodyMedium,
                color = TextWhite
            )
        }

        Icon(painter = painterResource(
            id = R.drawable.baseline_search_24),
            contentDescription = "search",
            tint = TextWhite,
            modifier = Modifier.size(28.dp)
        )
    }
}

@Composable
fun ChipSection(
    chips: List<String>
) {
    var sectionChipIndex by remember {
        mutableIntStateOf(0)
    }

    LazyRow {
        items(chips.size){
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(end = 15.dp)
                    .clickable {
                        sectionChipIndex = it
                    }
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        if (sectionChipIndex == it) ButtonBlue
                        else DarkerButtonBlue
                    )
                    .padding(15.dp)
            ) {
                Text(text = chips[it], color = TextWhite)
            }
        }
    }
}
