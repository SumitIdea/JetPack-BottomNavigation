package com.sumit.bottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Create
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val title: String,
    val activeIcon: ImageVector,
    val inactiveIcon: ImageVector,
    var route:String
) {
    object Home: Screen("Home", Icons.Filled.Home, Icons.Outlined.Home,"Home")
    object MyNetwork: Screen("MyNetwork", Icons.Filled.Create, Icons.Outlined.Create,"MyNetwork")
    object Notification: Screen("Notification", Icons.Filled.Person, Icons.Outlined.Person,"Notification")
    object Jobs: Screen("Jobs", Icons.Filled.Settings, Icons.Outlined.Settings,"Jobs")
}