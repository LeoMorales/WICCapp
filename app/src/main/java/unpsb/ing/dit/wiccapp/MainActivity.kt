package unpsb.ing.dit.wiccapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import unpsb.ing.dit.wiccapp.ui.login.LoginScreen
import unpsb.ing.dit.wiccapp.ui.login.LoginViewModel
import unpsb.ing.dit.wiccapp.ui.screens.Hello
import unpsb.ing.dit.wiccapp.ui.screens.Second
import unpsb.ing.dit.wiccapp.ui.theme.WICCappTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WICCappTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "screen2") {
        composable("screen1") { LoginScreen(LoginViewModel())}
        composable("screen2") { Hello(navController) }
        composable("screen3") { Second(navController) }
    }
}

