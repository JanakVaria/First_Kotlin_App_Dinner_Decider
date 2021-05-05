package com.example.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodlist = arrayListOf("Chinese ","Hamburger", "Pizza","Mcdonalds", "Kfc")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            val random = Random()
            val randomfood = random.nextInt(foodlist.count())
            selectedFoodText.text = foodlist[randomfood ]
        }

        addFoodBtn.setOnClickListener {
            val newfood = addFoodTxt.text.toString()
            foodlist.add(newfood)
            addFoodTxt.text.clear()
            println(foodlist)
        }
    }
}