package net.congressia.apb.first_project.meditation

import android.view.RoundedCorner
import android.view.WindowInsets
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.congressia.apb.first_project.R
import net.congressia.apb.first_project.ui.theme.AquaBlue
import net.congressia.apb.first_project.ui.theme.ButtonBlue
import net.congressia.apb.first_project.ui.theme.DarkerButtonBlue
import net.congressia.apb.first_project.ui.theme.DeepBlue
import net.congressia.apb.first_project.ui.theme.Pink80
import net.congressia.apb.first_project.ui.theme.Purple80
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
            Spacer(modifier = Modifier.height(20.dp))
            CurrentMeditation()
            Spacer(modifier = Modifier.height(20.dp))
            
            FeatureSection(feature = listOf(
                Feature(
                    tittle = "Hello Akash What up brother?",
                    iconId = androidx.core.R.drawable.ic_call_answer_video
                ),
                Feature(
                    tittle = "Call Cancel",
                    iconId = androidx.core.R.drawable.ic_call_decline
                ),
                Feature(
                    tittle = "Video Call",
                    iconId = androidx.core.R.drawable.ic_call_answer_low
                ),
                Feature(
                    tittle = "Video Call",
                    iconId = androidx.core.R.drawable.ic_call_answer_video
                ),
                Feature(
                    tittle = "Hello Akash What up brother?",
                    iconId = androidx.core.R.drawable.ic_call_answer_video
                ),
                Feature(
                    tittle = "Call Cancel",
                    iconId = androidx.core.R.drawable.ic_call_decline
                ),
                Feature(
                    tittle = "Video Call",
                    iconId = androidx.core.R.drawable.ic_call_answer_video
                )
            ))
        }
        BottomMenu(items = listOf(
            BottomMenuContent("Home", androidx.core.R.drawable.ic_call_answer_video),
            BottomMenuContent("Meditate", androidx.core.R.drawable.ic_call_answer_video),
            BottomMenuContent("Sleep", androidx.core.R.drawable.ic_call_answer_video),
        ), modifier = Modifier.align(Alignment.BottomCenter))

    }
}

@Composable
fun BottomMenu(
    items: List<BottomMenuContent>,
    modifier: Modifier = Modifier,
    activeHighLightColor: Color = ButtonBlue,
    activeTextColor: Color = Color.White,
    inactiveTextColor: Color = AquaBlue,
    initSelectedItem: Int = 0
) {
    var selectedItem by remember {
        mutableIntStateOf(initSelectedItem)
    }

    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .background(DeepBlue)
            .padding(15.dp)
    ) {
        items.forEachIndexed { index, bottomMenuContent ->  
            BottomMenuItem(
                item = bottomMenuContent,
                isSelected = index == selectedItem,
                activeHighLightColor = activeHighLightColor,
                activeTextColor = activeTextColor,
                inactiveTextColor = inactiveTextColor
            ) {
                selectedItem = index
            }
        }
    }
}

@Composable
fun BottomMenuItem(
    item: BottomMenuContent,
    isSelected: Boolean = false,
    activeHighLightColor: Color = ButtonBlue,
    activeTextColor: Color = Color.White,
    inactiveTextColor: Color = AquaBlue,
    onItemClick: () -> Unit
) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.clickable {
            onItemClick()
        }
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .background(if (isSelected) activeHighLightColor else Color.Transparent)
                .padding(10.dp)
        ) {
            Icon(
                painter = painterResource(id = item.iconId),
                contentDescription = "null",
                tint = if (isSelected) activeTextColor else inactiveTextColor,
                modifier = Modifier.size(20.dp)
            )
        }

        Text(
            text = item.tittle,
            color = if (isSelected) activeTextColor else inactiveTextColor,
            modifier = Modifier
        )
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

@Composable
fun CurrentMeditation() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .background(color = ButtonBlue)
            .padding(15.dp)
            .fillMaxWidth()

    ) {
        Column {
            Text(
                text = "Daily Thought",
                color = TextWhite,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = "Meditation • 3-10 min",
                color = TextWhite,
                style = MaterialTheme.typography.bodySmall
            )
        }

        Box (
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(color = Purple80)
                .padding(10.dp)
        ){
            Icon(
                painter = painterResource(id = androidx.core.R.drawable.ic_call_answer),
                contentDescription = null,
                tint = Color.White
            )
        }
    }
}

@Composable
fun FeatureSection(feature: List<Feature>) {
    Text(
        text = "Feature",
        style = MaterialTheme.typography.titleMedium,
        color = TextWhite
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(bottom = 20.dp),
        modifier = Modifier
            .fillMaxHeight()
            .padding(top = 10.dp, bottom = 80.dp)
    ){
        items(feature.size){
            FeatureItem(feature = feature[it])
        }
    }
}

@Composable
fun FeatureItem(
    feature: Feature
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 5.dp, end = 5.dp, bottom = 10.dp)
            .aspectRatio(1.2f)
            .clip(RoundedCornerShape(10.dp))
            .background(color = Color.DarkGray)
            .padding(15.dp)

    ) {
        Text(
            text = feature.tittle,
            style = MaterialTheme.typography.titleMedium,
            color = TextWhite,
            lineHeight = 24.sp,
            modifier = Modifier.align(Alignment.TopStart)
        )

        Icon(
            painter = painterResource(id = feature.iconId),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.align(Alignment.BottomStart)
        )

        Text(
            text = "Start",
            style = MaterialTheme.typography.bodyMedium,
            color = TextWhite,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .clickable {

                }
                .align(Alignment.BottomEnd)
                .clip(RoundedCornerShape(6.dp))
                .background(color = Pink80)
                .padding(vertical = 6.dp, horizontal = 10.dp)
        )
    }
}
