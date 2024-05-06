package com.github.virtualpetapp

//ST10456560
//Olwethu S. Mbele
//GitHub Link: https://github.com/ollym21/TamagotchiApp
// YouTube Link:

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity2 : AppCompatActivity() {
    private lateinit var feedButton: Button
    private lateinit var washButton: Button
    private lateinit var playButton: Button
    private lateinit var statusTextView: TextView
    private lateinit var imageView: ImageView

    //establish norm of each status
    private var hunger = 23
    private var clean = 56
    private var happy = 76


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


      //initialise buttons ID
        feedButton = findViewById(R.id.feedButton)
        washButton = findViewById(R.id.washButton)
        playButton = findViewById(R.id.playButton)
        statusTextView = findViewById(R.id.statusTextView)
        imageView = findViewById(R.id.imageView)


        //enable onClicks to buttons that will carry out functions && display image
        findViewById<Button?>(R.id.feedButton).setOnClickListener {
            imageView.setImageResource(R.drawable.eating_pet)
            hunger += 4
            statusTextView.text = "Your pet's hunger level is now on $hunger%."

        }

        findViewById<Button?>(/* id = */ R.id.washButton).setOnClickListener {
            imageView.setImageResource(R.drawable.wash_pet)
            clean += 2
            statusTextView.text = "Your pet is $clean% clean."
        }


        findViewById<Button?>(R.id.playButton).setOnClickListener {
            imageView.setImageResource(R.drawable.play_pet)
            happy+= 9
           statusTextView.text = "Your pet's happines is now on $happy%."
        }




    }
}




