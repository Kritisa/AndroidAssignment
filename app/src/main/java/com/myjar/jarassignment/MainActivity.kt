package com.myjar.jarassignment

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.ui.platform.ComposeView
import com.myjar.jarassignment.ui.composables.AppNavigation
import com.myjar.jarassignment.ui.vm.JarViewModel

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<JarViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }

    override fun onResume() {
        super.onResume()
        viewModel.fetchData()
        val myView = findViewById<ComposeView>(R.id.container_view)
        myView.setContent { AppNavigation(viewModel = viewModel) }
    }
}