package com.example.syntax_create_retrofit

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.syntax_create_retrofit.network.Demo
import com.example.syntax_create_retrofit.network.Network
import com.example.syntax_create_retrofit.ui.theme.Syntax_Create_RetrofitTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Bước 4: Tạo coroutine để lấy data từ sever trả về
        CoroutineScope(Dispatchers.IO).launch {
            val request = Network.createRetrofit("https://api.restful-api.dev/").create(Demo::class.java).getPost(1)
            if (request.isSuccessful){
                request.body()?.userId // lấy data từ server ô
                Log.d("result",request.body().toString())// em xem data tra ve tu server o day.
            }
        }
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Syntax_Create_RetrofitTheme {
        Greeting("Android")
    }
}