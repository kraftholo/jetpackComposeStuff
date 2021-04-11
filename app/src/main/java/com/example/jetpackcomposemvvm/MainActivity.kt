package com.example.jetpackcomposemvvm

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.happy_meal),
                    contentDescription = "Happy Meal",
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop
                )

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()                       //Make the row fill full width
                ) {
                    //inside row scope
                    Text(
                        text = "Happy Meal",
                        style = TextStyle(
                            color = Color.Yellow,
                            fontSize = 26.sp
                        ),
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Text(
                        text = "Rs. 250",
                        style = TextStyle(
                            color = Color.Blue,
                            fontSize = 18.sp
                        ),
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
                Spacer(Modifier.padding(top = 10.dp))
                //inside column scope
                Text(
                    text = "600 Cals",
                    fontSize = 18.sp,
                    color = Color.Red
                )

                Spacer(Modifier.padding(top = 10.dp))
                //inside column scope
                Button(
                    onClick = {},
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {
                    Text(text = "Order Now")        //text inside the button
                }
            }
        }
    }
}
