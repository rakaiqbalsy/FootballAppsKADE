package com.dicoding.kotlin.rakaiqbalsy.footballapps_kade

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {

    private lateinit var logoClub: ImageView

    private var name: String = ""
    private lateinit var nameTextView: TextView

    private var stadion: String = ""
    private lateinit var stadionName: TextView

    private var deskripsi: String = ""
    private lateinit var deskripsiClub: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout{
            padding = dip(14)
            gravity = Gravity.CENTER_HORIZONTAL

            logoClub = imageView{
                setImageResource(R.drawable.img_barca)
            }. lparams(width = 150, height = 150) {
                gravity = Gravity.CENTER
                margin = dip(20)
            }

            nameTextView = textView {
                textSize = 24F
                typeface = Typeface.DEFAULT_BOLD
                textAlignment = View.TEXT_ALIGNMENT_CENTER
            }. lparams{
                width = matchParent
            }

            deskripsiClub = textView{
                textSize = 15F
                typeface = Typeface.DEFAULT_BOLD
                textAlignment = View.TEXT_ALIGNMENT_CENTER
            }. lparams {
                width = matchParent
                bottomMargin = dip(12)
            }

            stadionName = textView()

        }

        val intent = intent

        //getExtra Intent

        name = intent.getStringExtra("name")
        stadion = intent.getStringExtra("stadion")
        deskripsi = intent.getStringExtra("deskripsi")

        //setIntent
        nameTextView.text = name
        stadionName.text = stadion
        deskripsiClub.text = deskripsi
        logoClub.setImageResource(intent.getIntExtra("image", R.drawable.img_barca))
    }
}