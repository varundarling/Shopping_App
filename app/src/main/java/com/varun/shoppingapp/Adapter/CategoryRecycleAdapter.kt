package com.varun.shoppingapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.varun.shoppingapp.Model.Category
import com.varun.shoppingapp.R

class CategoryRecycleAdapter(val context : Context, val categories : List<Category>, val itemClick : (Category) -> Unit) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {

    inner class Holder(itemView: View, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView){
        val categoryName = itemView.findViewById<TextView>(R.id.CategoryName)
        val categoryImage = itemView.findViewById<ImageView>(R.id.CategoryImage)

        fun bindCategory(category: Category,context: Context){
            val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
            categoryImage.setImageResource(resourceId)
            categoryName.text = category.title

            itemView.setOnClickListener{itemClick(category)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_view,parent,false)

        return Holder(view,itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(categories[position],context)
    }

}