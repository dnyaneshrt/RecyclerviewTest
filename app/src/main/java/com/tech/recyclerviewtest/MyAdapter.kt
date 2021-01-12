package com.tech.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tech.recyclerviewtest.model.Images

//step 1:create a class a child of androidx.recyclerview.widget.RecyclerView class
class MyAdapter(
    var mainActivity: MainActivity,
    var images: ArrayList<Images>,
) :
    RecyclerView.Adapter<MyAdapter.MyHolder>() {


    //override these three methods
//step 3:androidx.recyclerview.widget.RecyclerView.Adapter is an abstract class,so child class is reposible to provide the implemeation
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var inflater = LayoutInflater.from(parent.context)
        var view = inflater.inflate(R.layout.my_item_view, parent, false)
        return MyHolder(view)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
    var myimages=images[position]
        holder.imageview.setImageResource(myimages.imageSrc)
        holder.text_imagename.text=myimages.imageTitle
        holder.button_click.setOnClickListener {
            Toast.makeText(mainActivity,"hey i am click button",Toast.LENGTH_SHORT).show()
        }
    }


    override fun getItemCount(): Int {
        return images.size
    }

    //step 2:create a holder class as a child of RecyclerView.ViewHolder class
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var imageview = itemView.findViewById<ImageView>(R.id.image_view)
        var text_imagename = itemView.findViewById<TextView>(R.id.text_image_name)
        var button_click = itemView.findViewById<Button>(R.id.button_click)

    }


}