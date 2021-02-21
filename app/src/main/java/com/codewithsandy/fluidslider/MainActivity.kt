package com.codewithsandy.fluidslider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.ramotion.fluidslider.FluidSlider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        setUpSlider()
    }

    private fun setUpSlider()
    {
        val slider=findViewById<FluidSlider>(R.id.slider)
        val text=findViewById<TextView>(R.id.text)

        slider.positionListener={pos->text.text =(pos *100).toString()        }

//        slider.beginTrackingListener=
//            {
//                Toast.makeText(applicationContext,"Started tracking",Toast.LENGTH_SHORT).show()
//            }
//        slider.endTrackingListener={
//            Toast.makeText(applicationContext,"Ended tracking ",Toast.LENGTH_SHORT).show()
//        }
    }
}