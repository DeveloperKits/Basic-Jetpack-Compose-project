package ai.codia.x.composeui.demo

import ai.codia.x.composeui.demo.ui.theme.CodiaDemoComposeUITheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.congressia.apb.first_project.R

/**
 * Created by codia-figma
 */
@Composable
fun CodiaMainView() {
    // Column-310:376-[Codia](Temporary layer)Settings
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color(0xffffffff))
            .size(390.dp, 1012.dp)
            .clipToBounds()
            .padding(horizontal = 5.dp, vertical = 0.dp),
    ) {
        // Column-310:632-group
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 12.999984741210938.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.Start)
                .fillMaxWidth()
                .padding(start = 0.dp, end = 10.dp)
                .height(992.dp),
        ) {
            // Row-310:642-Layer-ViewGroup (0,0,390,23)
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.Start)
                    .fillMaxWidth()
                    .padding(start = 0.dp, end = 0.dp)
                    .height(17.dp)
                    .padding(start = 0.dp, top = 0.dp, end = 2.4228515625.dp, bottom = 0.dp),
            ) {
                // Row-310:640-group
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 257.55712890625.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.Bottom,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .fillMaxSize()
                        .padding(start = 0.dp, end = 2.423000000000002.dp, top = 0.dp, bottom = 0.dp)
                        .padding(start = 0.dp, top = 0.3601665496826172.dp, end = 0.dp, bottom = 0.dp),
                ) {
                    // Box-310:391-Time Style
                    Box(
                        contentAlignment = Alignment.TopStart,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .fillMaxHeight()
                            .padding(top = 0.dp, bottom = 0.35999999999999943.dp)
                            .width(56.dp)
                            .clipToBounds(),
                    ) {
                        // Text-310:392-Time
                        Text(
                            modifier = Modifier
                                .align(Alignment.BottomStart)
                                .fillMaxWidth()
                                .offset(x = 0.dp, y = 5.359999999999999.dp)
                                .padding(start = 0.dp, end = 0.dp),
                            text = "9:02",
                            color = Color(0xff151921),
                            fontSize = 15.455.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Image-310:655-group
                    Image(
                        painter = painterResource(id = R.drawable.container_group_310655),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.Bottom)
                            .size(64.02.dp, 14.219.dp),
                    )
                }
            }
            // Column-310:633-group
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 23.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Start)
                    .fillMaxWidth()
                    .padding(start = 0.dp, end = 0.dp)
                    .height(962.dp)
                    .padding(horizontal = 10.dp, vertical = 0.dp),
            ) {
                // Box-310:635-group
                Box(
                    contentAlignment = Alignment.TopStart,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .fillMaxWidth()
                        .padding(start = 0.dp, end = 20.dp)
                        .height(40.dp),
                ) {
                    // Text-310:393-Settings
                    Text(
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .fillMaxHeight()
                            .padding(top = 2.dp, bottom = 8.dp),
                        text = "Settings",
                        color = Color(0xff2a4b49),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Image-310:656-Group 62
                    Image(
                        painter = painterResource(id = R.drawable.iv_group_310656),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.CenterStart)
                            .offset(x = 5.dp, y = 0.dp)
                            .size(40.dp, 40.dp),
                    )
                }
                // Box-310:634-Layer-ListView (0,78,389,934)
                Box(
                    contentAlignment = Alignment.TopStart,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .fillMaxWidth()
                        .padding(start = 0.dp, end = 20.dp)
                        .height(899.dp),
                ) {
                    // Row-310:489-group[c:cell]
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .offset(x = 11.dp, y = 0.dp)
                            .advancedShadow(color = Color(0x19000000), alpha = 0.10000000149011612f, cornersRadius = 10.dp, shadowBlurRadius = 4.dp, offsetX = 0.dp, offsetY = 4.dp)
                            .background(Color(0xfff6fffe), RoundedCornerShape(10.dp))
                            .size(338.dp, 55.dp),
                    ) {
                        // Row-310:403-navigations
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .fillMaxSize()
                                .padding(start = 0.dp, end = 0.dp, top = 0.dp, bottom = 0.dp),
                        ) {
                            // Box-310:643-Group[c:stackview]
                            Box(
                                contentAlignment = Alignment.TopStart,
                                modifier = Modifier
                                    .align(Alignment.Top)
                                    .fillMaxSize()
                                    .padding(start = 0.dp, end = 0.dp, top = 0.dp, bottom = 0.dp),
                            ) {
                                // Box-310:404-Nav-Item[c:collectioncell]
                                Box(
                                    contentAlignment = Alignment.TopStart,
                                    modifier = Modifier
                                        .align(Alignment.TopStart)
                                        .fillMaxSize()
                                        .padding(start = 0.dp, end = 253.5.dp, top = 0.dp, bottom = 0.dp),
                                ) {
                                    // Image-310:405-heroicons-solid/home
                                    Image(
                                        painter = painterResource(id = R.drawable.image_home_310405),
                                        contentDescription = null,
                                        contentScale = ContentScale.Fit,
                                        modifier = Modifier
                                            .align(Alignment.TopCenter)
                                            .offset(x = 0.dp, y = 8.dp)
                                            .size(24.dp, 24.dp)
                                            .clipToBounds(),
                                    )
                                    // Text-310:406-Home
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.TopStart)
                                            .fillMaxWidth()
                                            .offset(x = 0.dp, y = 32.dp)
                                            .padding(start = 0.dp, end = 0.dp),
                                        text = "Home",
                                        color = Color(0xff1a998e),
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Box-310:408-Component 7[c:collectioncell]
                                Box(
                                    contentAlignment = Alignment.TopStart,
                                    modifier = Modifier
                                        .align(Alignment.TopStart)
                                        .fillMaxSize()
                                        .padding(start = 84.5.dp, end = 169.dp, top = 0.dp, bottom = 0.dp),
                                ) {
                                    // Image-310:409-Bell Icon
                                    Image(
                                        painter = painterResource(id = R.drawable.image_bell_icon_310409),
                                        contentDescription = null,
                                        contentScale = ContentScale.Fit,
                                        modifier = Modifier
                                            .align(Alignment.TopCenter)
                                            .offset(x = 0.dp, y = 10.5.dp)
                                            .size(16.dp, 19.dp),
                                    )
                                    // Text-310:410-Notification
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.TopStart)
                                            .fillMaxWidth()
                                            .offset(x = 0.dp, y = 29.5.dp)
                                            .padding(start = 0.dp, end = 0.dp),
                                        text = "Notification",
                                        color = Color(0xff2a4b49),
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Box-310:412-Component 10[c:collectioncell]
                                Box(
                                    contentAlignment = Alignment.TopStart,
                                    modifier = Modifier
                                        .align(Alignment.TopStart)
                                        .fillMaxSize()
                                        .padding(start = 169.dp, end = 84.5.dp, top = 0.dp, bottom = 0.dp),
                                ) {
                                    // Image-310:413-material-symbols:settings-rounded
                                    Image(
                                        painter = painterResource(id = R.drawable.image_settings_rounded_310413),
                                        contentDescription = null,
                                        contentScale = ContentScale.Fit,
                                        modifier = Modifier
                                            .align(Alignment.TopCenter)
                                            .offset(x = 0.dp, y = 10.dp)
                                            .size(20.dp, 20.dp)
                                            .clipToBounds(),
                                    )
                                    // Text-310:415-Settings
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.TopStart)
                                            .fillMaxWidth()
                                            .offset(x = 0.dp, y = 30.dp)
                                            .padding(start = 0.dp, end = 0.dp),
                                        text = "Settings",
                                        color = Color(0xff2a4b49),
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Box-310:417-Component 8[c:collectioncell]
                                Box(
                                    contentAlignment = Alignment.TopStart,
                                    modifier = Modifier
                                        .align(Alignment.TopStart)
                                        .fillMaxSize()
                                        .padding(start = 253.5.dp, end = 0.dp, top = 0.dp, bottom = 0.dp),
                                ) {
                                    // Image-310:418-heroicons-solid/inbox
                                    Image(
                                        painter = painterResource(id = R.drawable.image_inbox_310418),
                                        contentDescription = null,
                                        contentScale = ContentScale.Fit,
                                        modifier = Modifier
                                            .align(Alignment.TopCenter)
                                            .offset(x = 0.dp, y = 8.dp)
                                            .size(24.dp, 24.dp)
                                            .clipToBounds(),
                                    )
                                    // Text-310:419-****
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.TopStart)
                                            .fillMaxWidth()
                                            .offset(x = 0.dp, y = 32.dp)
                                            .padding(start = 0.dp, end = 0.dp),
                                        text = "****",
                                        color = Color(0xff2a4b49),
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                        }
                    }
                    // Text-310:480-Version: 1.2.15[c:cell]
                    Text(
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .offset(x = 116.dp, y = -78.dp)
                            .size(96.dp, 14.dp),
                        text = "Version: 1.2.15",
                        color = Color(0xff000000),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Column-310:650-group
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 41.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .wrapContentHeight()
                            .offset(x = 5.dp, y = 0.dp)
                            .width(350.dp),
                    ) {
                        // Column-310:644-Layer-ViewGroup (0,70,389,185)
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .size(155.dp, 149.dp),
                        ) {
                            // Box-310:651-Frame
                            Box(
                                contentAlignment = Alignment.TopStart,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .fillMaxWidth()
                                    .padding(start = 0.dp, end = 0.dp)
                                    .height(97.dp)
                                    .clipToBounds(),
                            ) {
                                // Empty-310:421-Avatar[c:cell]
                                Box(
                                    modifier = Modifier
                                        .align(Alignment.TopCenter)
                                        .fillMaxHeight()
                                        .padding(top = 0.dp, bottom = 0.dp)
                                        .background(Color(0xffffd88d), RoundedCornerShape(48.5.dp))
                                        .width(100.096.dp)
                                        .clip(RoundedCornerShape(48.5.dp)),
                                )
                            }
                            // Column-310:398-Name
                            Column(
                                verticalArrangement = Arrangement.Top,
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .fillMaxWidth()
                                    .padding(start = 0.dp, end = 0.dp)
                                    .height(48.dp),
                            ) {
                                // Text-310:399-Akash Das
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .fillMaxWidth()
                                        .padding(start = 0.dp, end = 0.dp),
                                    text = "Akash Das",
                                    color = Color(0xff2a4b49),
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Center,
                                    overflow = TextOverflow.Ellipsis,
                                )
                                // Text-310:400-+8801857959953 akashdas@gmail.com[c:cell]
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .fillMaxWidth()
                                        .padding(start = 0.dp, end = 0.dp),
                                    text = "+8801857959953\nakashdas@gmail.com",
                                    color = Color(0xff535662),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Center,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                        // Column-310:649-group
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 23.5.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .fillMaxWidth()
                                .padding(start = 0.dp, end = 0.dp)
                                .height(606.dp),
                        ) {
                            // Column-310:648-group
                            Column(
                                verticalArrangement = Arrangement.spacedBy(space = 13.dp, alignment = Alignment.Top),
                                horizontalAlignment = Alignment.Start,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .fillMaxWidth()
                                    .padding(start = 0.dp, end = 0.dp)
                                    .height(199.dp),
                            ) {
                                // Box-310:652-Frame
                                Box(
                                    contentAlignment = Alignment.TopStart,
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .fillMaxWidth()
                                        .padding(start = 0.dp, end = 0.dp)
                                        .height(14.dp)
                                        .clipToBounds(),
                                ) {
                                    // Text-310:442-Account
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.TopStart)
                                            .fillMaxHeight()
                                            .padding(top = 0.dp, bottom = 0.dp)
                                            .width(70.dp),
                                        text = "Account",
                                        color = Color(0xff2a4b49),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-310:490-group[c:cell]
                                Row(
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .fillMaxWidth()
                                        .padding(start = 0.dp, end = 0.dp)
                                        .background(Color(0xfff6fffe), RoundedCornerShape(6.dp))
                                        .height(172.dp)
                                        .border(1.dp, Color(0xff2a4b49), RoundedCornerShape(6.dp))
                                        .padding(start = 10.dp, top = 13.dp, end = 10.dp, bottom = 12.dp),
                                ) {
                                    // Column-310:548-group
                                    Column(
                                        verticalArrangement = Arrangement.spacedBy(space = 9.dp, alignment = Alignment.Top),
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier
                                            .align(Alignment.Top)
                                            .fillMaxSize()
                                            .padding(start = 0.dp, end = 20.dp, top = 0.dp, bottom = 25.dp)
                                            .padding(horizontal = 6.374267578125.dp, vertical = 0.dp),
                                    ) {
                                        // Row-310:556-group
                                        Row(
                                            horizontalArrangement = Arrangement.spacedBy(space = 36.842071533203125.dp, alignment = Alignment.CenterHorizontally),
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .align(Alignment.Start)
                                                .fillMaxWidth()
                                                .padding(start = 0.dp, end = 12.749000000000024.dp)
                                                .height(30.dp),
                                        ) {
                                            // Image-310:438-iconamoon:profile-light
                                            Image(
                                                painter = painterResource(id = R.drawable.image_profile_light_310438),
                                                contentDescription = null,
                                                contentScale = ContentScale.Fit,
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .size(30.702.dp, 30.dp)
                                                    .clipToBounds(),
                                            )
                                            // Text-310:426-Edit profile
                                            Text(
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .wrapContentHeight()
                                                    .width(250.708.dp),
                                                text = "Edit profile",
                                                color = Color(0xff2a4b49),
                                                fontSize = 16.sp,
                                                fontWeight = FontWeight.Normal,
                                                textAlign = TextAlign.Left,
                                                overflow = TextOverflow.Ellipsis,
                                            )
                                        }
                                        // Row-310:618-group
                                        Row(
                                            horizontalArrangement = Arrangement.spacedBy(space = 36.923980712890625.dp, alignment = Alignment.CenterHorizontally),
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .align(Alignment.Start)
                                                .fillMaxWidth()
                                                .padding(start = 0.dp, end = 12.749000000000024.dp)
                                                .height(30.dp),
                                        ) {
                                            // Image-310:436-material-symbols:privacy-tip-outline
                                            Image(
                                                painter = painterResource(id = R.drawable.image_privacy_tip_outline_310436),
                                                contentDescription = null,
                                                contentScale = ContentScale.Fit,
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .size(30.702.dp, 30.dp)
                                                    .clipToBounds(),
                                            )
                                            // Text-310:427-About Us
                                            Text(
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .wrapContentHeight()
                                                    .width(250.626.dp),
                                                text = "About Us",
                                                color = Color(0xff2a4b49),
                                                fontSize = 16.sp,
                                                fontWeight = FontWeight.Normal,
                                                textAlign = TextAlign.Left,
                                                overflow = TextOverflow.Ellipsis,
                                            )
                                        }
                                        // Row-310:611-group
                                        Row(
                                            horizontalArrangement = Arrangement.spacedBy(space = 36.923980712890625.dp, alignment = Alignment.CenterHorizontally),
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .align(Alignment.Start)
                                                .fillMaxWidth()
                                                .padding(start = 0.dp, end = 12.749000000000024.dp)
                                                .height(30.dp),
                                        ) {
                                            // Image-310:432-iconamoon:notification
                                            Image(
                                                painter = painterResource(id = R.drawable.image_notification_310432),
                                                contentDescription = null,
                                                contentScale = ContentScale.Fit,
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .size(30.702.dp, 30.dp)
                                                    .clipToBounds(),
                                            )
                                            // Text-310:428-Terms & Condition
                                            Text(
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .wrapContentHeight()
                                                    .width(250.626.dp),
                                                text = "Terms & Condition",
                                                color = Color(0xff2a4b49),
                                                fontSize = 16.sp,
                                                fontWeight = FontWeight.Normal,
                                                textAlign = TextAlign.Left,
                                                overflow = TextOverflow.Ellipsis,
                                            )
                                        }
                                        // Row-310:549-group
                                        Row(
                                            horizontalArrangement = Arrangement.spacedBy(space = 36.842071533203125.dp, alignment = Alignment.CenterHorizontally),
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .align(Alignment.Start)
                                                .fillMaxWidth()
                                                .padding(start = 0.dp, end = 12.749000000000024.dp)
                                                .height(30.dp),
                                        ) {
                                            // Image-310:430-ic:outline-lock
                                            Image(
                                                painter = painterResource(id = R.drawable.image_lock_310430),
                                                contentDescription = null,
                                                contentScale = ContentScale.Fit,
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .size(30.702.dp, 30.dp)
                                                    .clipToBounds(),
                                            )
                                            // Text-310:429-Privacy
                                            Text(
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .wrapContentHeight()
                                                    .width(250.708.dp),
                                                text = "Privacy",
                                                color = Color(0xff2a4b49),
                                                fontSize = 16.sp,
                                                fontWeight = FontWeight.Normal,
                                                textAlign = TextAlign.Left,
                                                overflow = TextOverflow.Ellipsis,
                                            )
                                        }
                                    }
                                }
                            }
                            // Column-310:646-Layer-ViewGroup (14,500,360,208)[c:cell]
                            Column(
                                verticalArrangement = Arrangement.spacedBy(space = 13.dp, alignment = Alignment.Top),
                                horizontalAlignment = Alignment.Start,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .fillMaxWidth()
                                    .padding(start = 0.dp, end = 0.dp)
                                    .height(199.dp),
                            ) {
                                // Box-310:653-Frame
                                Box(
                                    contentAlignment = Alignment.TopStart,
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .fillMaxWidth()
                                        .padding(start = 0.dp, end = 0.dp)
                                        .height(14.dp)
                                        .clipToBounds(),
                                ) {
                                    // Text-310:462-Control Panel
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.TopStart)
                                            .fillMaxHeight()
                                            .padding(top = 0.dp, bottom = 0.dp)
                                            .width(111.dp),
                                        text = "Control Panel",
                                        color = Color(0xff2a4b49),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Box-310:491-group
                                Box(
                                    contentAlignment = Alignment.TopStart,
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .fillMaxWidth()
                                        .padding(start = 0.dp, end = 0.dp)
                                        .background(Color(0xfff6fffe), RoundedCornerShape(6.dp))
                                        .height(172.dp)
                                        .border(1.dp, Color(0xff2a4b49), RoundedCornerShape(6.dp)),
                                ) {
                                    // Text-310:446-Add Salesman
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.TopStart)
                                            .offset(x = 84.dp, y = 21.dp)
                                            .size(119.dp, 16.dp),
                                        text = "Add Salesman",
                                        color = Color(0xff2a4b49),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                    // Text-310:481-Not for salesman
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.TopEnd)
                                            .wrapContentSize()
                                            .offset(x = -34.dp, y = 18.dp),
                                        text = "Not for salesman",
                                        color = Color(0xffd73e3e),
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                    // Row-310:569-group
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(space = 36.923980712890625.dp, alignment = Alignment.CenterHorizontally),
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .align(Alignment.BottomStart)
                                            .offset(x = 10.dp, y = -12.dp)
                                            .size(330.dp, 30.dp)
                                            .padding(horizontal = 6.374267578125.dp, vertical = 0.dp),
                                    ) {
                                        // Image-310:450-ic:outline-lock
                                        Image(
                                            painter = painterResource(id = R.drawable.image_lock_310450),
                                            contentDescription = null,
                                            contentScale = ContentScale.Fit,
                                            modifier = Modifier
                                                .align(Alignment.CenterVertically)
                                                .size(30.702.dp, 30.dp)
                                                .clipToBounds(),
                                        )
                                        // Text-310:449-Add Products
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.CenterVertically)
                                                .wrapContentHeight()
                                                .width(250.626.dp),
                                            text = "Add Products",
                                            color = Color(0xff2a4b49),
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Normal,
                                            textAlign = TextAlign.Left,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                    }
                                    // Column-310:576-group
                                    Column(
                                        verticalArrangement = Arrangement.spacedBy(space = 25.dp, alignment = Alignment.Top),
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier
                                            .align(Alignment.CenterStart)
                                            .wrapContentHeight()
                                            .offset(x = 57.076.dp, y = 0.5.dp)
                                            .width(282.924.dp)
                                            .padding(start = 16.9239501953125.dp, top = 0.dp, end = 0.dp, bottom = 0.dp),
                                    ) {
                                        // Text-310:447-Add Generic
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.CenterHorizontally)
                                                .wrapContentHeight()
                                                .offset(x = 0.5.dp, y = 0.dp)
                                                .width(247.dp),
                                            text = "Add Generic",
                                            color = Color(0xff2a4b49),
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Normal,
                                            textAlign = TextAlign.Left,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                        // Text-310:448-Add Company
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.CenterHorizontally)
                                                .wrapContentHeight()
                                                .offset(x = 0.5.dp, y = 0.dp)
                                                .width(247.dp),
                                            text = "Add Company",
                                            color = Color(0xff2a4b49),
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Normal,
                                            textAlign = TextAlign.Left,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                    }
                                    // Image-310:645-group
                                    Image(
                                        painter = painterResource(id = R.drawable.container_group15_310645),
                                        contentDescription = null,
                                        contentScale = ContentScale.Fit,
                                        modifier = Modifier
                                            .align(Alignment.TopStart)
                                            .wrapContentHeight()
                                            .offset(x = 16.374.dp, y = 13.dp)
                                            .width(30.702.dp),
                                    )
                                }
                            }
                            // Column-310:647-group
                            Column(
                                verticalArrangement = Arrangement.spacedBy(space = 13.dp, alignment = Alignment.Top),
                                horizontalAlignment = Alignment.Start,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .fillMaxWidth()
                                    .padding(start = 0.dp, end = 0.dp)
                                    .height(161.dp),
                            ) {
                                // Box-310:654-Frame
                                Box(
                                    contentAlignment = Alignment.TopStart,
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .fillMaxWidth()
                                        .padding(start = 0.dp, end = 0.dp)
                                        .height(14.dp)
                                        .clipToBounds(),
                                ) {
                                    // Text-310:479-Actions
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.TopStart)
                                            .fillMaxHeight()
                                            .padding(top = 0.dp, bottom = 0.dp)
                                            .width(63.dp),
                                        text = "Actions",
                                        color = Color(0xff2a4b49),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-310:492-group[c:cell]
                                Row(
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .fillMaxWidth()
                                        .padding(start = 0.dp, end = 0.dp)
                                        .background(Color(0xfff6fffe), RoundedCornerShape(6.dp))
                                        .height(134.dp)
                                        .border(1.dp, Color(0xff2a4b49), RoundedCornerShape(6.dp))
                                        .padding(start = 10.dp, top = 12.92431640625.dp, end = 10.dp, bottom = 13.703475952148438.dp),
                                ) {
                                    // Column-310:589-group
                                    Column(
                                        verticalArrangement = Arrangement.spacedBy(space = 8.947734832763672.dp, alignment = Alignment.Top),
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier
                                            .align(Alignment.Top)
                                            .fillMaxSize()
                                            .padding(start = 0.dp, end = 20.dp, top = 0.dp, bottom = 26.628.dp)
                                            .padding(horizontal = 6.374267578125.dp, vertical = 0.dp),
                                    ) {
                                        // Row-310:604-group
                                        Row(
                                            horizontalArrangement = Arrangement.spacedBy(space = 36.923980712890625.dp, alignment = Alignment.CenterHorizontally),
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .align(Alignment.Start)
                                                .fillMaxWidth()
                                                .padding(start = 0.dp, end = 12.749000000000024.dp)
                                                .height(29.826.dp),
                                        ) {
                                            // Image-310:475-iconamoon:profile-light
                                            Image(
                                                painter = painterResource(id = R.drawable.image_profile_light_310475),
                                                contentDescription = null,
                                                contentScale = ContentScale.Fit,
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .size(30.702.dp, 29.826.dp)
                                                    .clipToBounds(),
                                            )
                                            // Text-310:466-Sync Data
                                            Text(
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .size(250.626.dp, 16.dp),
                                                text = "Sync Data",
                                                color = Color(0xff2a4b49),
                                                fontSize = 16.sp,
                                                fontWeight = FontWeight.Normal,
                                                textAlign = TextAlign.Left,
                                                overflow = TextOverflow.Ellipsis,
                                            )
                                        }
                                        // Row-310:597-group
                                        Row(
                                            horizontalArrangement = Arrangement.spacedBy(space = 36.923980712890625.dp, alignment = Alignment.CenterHorizontally),
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .align(Alignment.Start)
                                                .fillMaxWidth()
                                                .padding(start = 0.dp, end = 12.749000000000024.dp)
                                                .height(29.826.dp),
                                        ) {
                                            // Image-310:473-material-symbols:privacy-tip-outline
                                            Image(
                                                painter = painterResource(id = R.drawable.image_privacy_tip_outline_310473),
                                                contentDescription = null,
                                                contentScale = ContentScale.Fit,
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .size(30.702.dp, 29.826.dp)
                                                    .clipToBounds(),
                                            )
                                            // Text-310:467-Check Update
                                            Text(
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .size(250.626.dp, 16.dp),
                                                text = "Check Update",
                                                color = Color(0xff2a4b49),
                                                fontSize = 16.sp,
                                                fontWeight = FontWeight.Normal,
                                                textAlign = TextAlign.Left,
                                                overflow = TextOverflow.Ellipsis,
                                            )
                                        }
                                        // Row-310:590-group
                                        Row(
                                            horizontalArrangement = Arrangement.spacedBy(space = 36.923980712890625.dp, alignment = Alignment.CenterHorizontally),
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .align(Alignment.Start)
                                                .fillMaxWidth()
                                                .padding(start = 0.dp, end = 12.749000000000024.dp)
                                                .height(29.826.dp),
                                        ) {
                                            // Image-310:469-iconamoon:notification
                                            Image(
                                                painter = painterResource(id = R.drawable.image_notification_310469),
                                                contentDescription = null,
                                                contentScale = ContentScale.Fit,
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .size(30.702.dp, 29.826.dp)
                                                    .clipToBounds(),
                                            )
                                            // Text-310:468-Log Out
                                            Text(
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .size(250.626.dp, 16.dp),
                                                text = "Log Out",
                                                color = Color(0xff2a4b49),
                                                fontSize = 16.sp,
                                                fontWeight = FontWeight.Normal,
                                                textAlign = TextAlign.Left,
                                                overflow = TextOverflow.Ellipsis,
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CodiaMainViewPreview() {
    CodiaDemoComposeUITheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                CodiaMainView()
            }
        }
    }
}
