package com.izzaweb.arrayrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.item_list.view.*
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_detail)
        var  nameClub = intent.getStringExtra("name")
        var imageClub = intent.getIntExtra("image", 0)
        DetailActivityUI().setContentView(this)

        verticalLayout {
            imageView(imageClub).lparams(width = matchParent, height = 500){
                padding = dip(16)
                margin = dip(15)
            }
            textView(nameClub).lparams(width = matchParent){
                gravity = Gravity.CENTER
            }
        }
    }
    class DetailActivityUI() : AnkoComponent<DetailActivity>{
        override fun createView(ui: AnkoContext<DetailActivity>)= with(ui) {
            verticalLayout {

            }
        }
    }

}
