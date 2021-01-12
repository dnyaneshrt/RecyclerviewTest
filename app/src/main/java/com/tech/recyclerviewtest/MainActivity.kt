package com.tech.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tech.recyclerviewtest.model.Images


class MainActivity : AppCompatActivity() {

    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.my_recycler_view)


        var images = arrayListOf<Images>(
            Images("men's images", R.drawable.men),
            Images("women's images", R.drawable.women),
            Images("phonecase's images", R.drawable.phonecase),
            Images("kid's images", R.drawable.kids),
            Images("WallArt's images", R.drawable.wallart),
            Images("Accessories images", R.drawable.accessories),
            Images("Android images", R.drawable.imagetest),
            Images("logo's images", R.drawable.logo_matka)
        )


//        var mylayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        recyclerView?.layoutManager = mylayoutManager

        recyclerView?.layoutManager=GridLayoutManager(this,2)
        var new_adapter = MyAdapter(this, images)
        recyclerView?.adapter = new_adapter


    }
}