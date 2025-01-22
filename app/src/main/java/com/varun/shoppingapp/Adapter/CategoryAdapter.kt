package com.varun.shoppingapp.Adapter

import android.content.Context
import android.media.Image
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.varun.shoppingapp.Model.Category
import com.varun.shoppingapp.R

class CategoryAdapter(context : Context, categories : List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

    override fun getCount(): Int {
        return categories.count()
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView : View
        val holder : ViewHolder

        if(convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_view, null)
            holder = ViewHolder()

            holder.categoryImage = categoryView.findViewById(R.id.CategoryImage)
            holder.categoryName = categoryView.findViewById(R.id.CategoryName)
            categoryView.tag = holder
        }else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = categories[position]

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text =  category.title

        return categoryView
    }

    private class ViewHolder {
        var categoryName : TextView? = null
        var categoryImage : ImageView? = null
    }
}