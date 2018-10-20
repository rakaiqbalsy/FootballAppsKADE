package com.dicoding.kotlin.rakaiqbalsy.footballapps_kade

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.jetbrains.anko.dip
import org.jetbrains.anko.padding
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

class DetailActivity : AppCompatActivity() {

    

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

            nameTextView = textView()

            stadionName = textView()

            deskripsiClub = textView()
        }

        val intent = intent
        name = intent.getStringExtra("name")
        nameTextView.text = name

        stadion = intent.getStringExtra("stadion")
        stadionName.text = stadion

        deskripsi = intent.getStringExtra("deskripsi")
        deskripsiClub.text = deskripsi
    }
}
