package com.varun.shoppingapp.Controller

import android.os.Bundle
import android.os.ConditionVariable
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.varun.shoppingapp.Adapter.CategoryAdapter
import com.varun.shoppingapp.Model.Category
import com.varun.shoppingapp.R
import com.varun.shoppingapp.Services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,DataService.categories)

        findViewById<ListView>(R.id.CategoryListView).adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}