package com.varun.shoppingapp.Controller

import android.os.Bundle
import android.os.ConditionVariable
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.varun.shoppingapp.Adapter.CategoryAdapter
import com.varun.shoppingapp.Adapter.CategoryRecycleAdapter
import com.varun.shoppingapp.Model.Category
import com.varun.shoppingapp.R
import com.varun.shoppingapp.Services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this,DataService.categories)
        findViewById<RecyclerView>(R.id.CategoryListView).adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        findViewById<RecyclerView>(R.id.CategoryListView).layoutManager = layoutManager
        findViewById<RecyclerView>(R.id.CategoryListView).setHasFixedSize(true)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}