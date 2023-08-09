package com.carmo.starwars

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.carmo.starwars.R.font.starjout
import com.carmo.starwars.ui.theme.StarWarsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            app()
        }
    }
}


@Preview
@Composable
fun app() {
    val starwars = FontFamily(Font(starjout))
    Column(Modifier.background(Color.Black).padding(20.dp)){
        Column(modifier = Modifier
            .border(width = 5.dp, color = Color.Cyan, shape = RectangleShape)
            .fillMaxSize()
            .padding()){
            Row(Modifier.fillMaxWidth()){
                Text(text = "Star Wars", color = Color.Yellow,
                    fontFamily = starwars, textAlign = TextAlign.Center,
                    fontSize = 40.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 50.dp)
                )
            }
            Row (Modifier.fillMaxWidth()){
                Text(text = "Feria vocacional", color = Color.Yellow,
                    fontFamily = starwars, textAlign = TextAlign.Center,
                    fontSize = 25.sp, modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 5.dp))
            }
            Row(Modifier.fillMaxWidth()){
                Column(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 40.dp), horizontalAlignment = Alignment.CenterHorizontally){
                    Image(painter = painterResource(id = R.drawable.img), contentDescription = "Messi", Modifier.size(175.dp))
                }
            }
            Row(Modifier.fillMaxWidth()){
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Empezar", color = Color.Yellow, fontFamily = starwars, fontSize = 20.sp
                        , modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 60.dp)
                            .padding(top = 75.dp)
                            .border(3.dp, color = Color.Cyan, RectangleShape),
                        textAlign = TextAlign.Center)

                }
            }
            }
    }




}