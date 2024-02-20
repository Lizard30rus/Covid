package com.example.covid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.core_navigation.bottomBarStateFlow
import com.example.core_navigation.routes.graphs.FoodEnterDestination
import com.example.core_navigation.routes.screens.SplashScreenDestination
import com.example.core_navigation.states.BottomBarState
import com.example.core_navigation.states.TopBarState
import com.example.core_ui.composables.top_bar.AppBarState
import com.example.covid.ui.navigation.graphs.globalGraph
import com.example.covid.ui.navigation.models.NavigationItem
import com.example.covid.ui.theme.CovidTheme
import com.example.covid.ui.views.BottomBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController: NavHostController = rememberNavController()
            CovidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainContent(navController)
                }
            }
        }
    }
}

@Composable
fun MainContent(navController: NavHostController) {
    val context = LocalContext.current
    val topBarState = remember { mutableStateOf(TopBarState.Gone) }
    val bottomBarState = navController.bottomBarStateFlow().collectAsState(BottomBarState.Gone)
    val navigationItems = listOf(
        NavigationItem.Food,
        NavigationItem.Alcohol
    )
    val (appBarState, onAppBarState) = remember {
        mutableStateOf<AppBarState>(AppBarState.WithoutAppBar())
    }
    Scaffold(
        topBar = { appBarState.appBar },
        bottomBar = {
            BottomBar(
                navigationItems = navigationItems,
                navController = navController,
                bottomBarState = bottomBarState
            )
        }
    ) {
        NavHost(
            navController = navController,
            modifier = Modifier.padding(it),
            startDestination = FoodEnterDestination.route()
        ) {
            globalGraph(context, navController, onAppBarState)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CovidTheme {
        MainContent(rememberNavController())
    }
}