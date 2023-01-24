package com.example.speedy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.speedy.databinding.ActivityMainBinding

class PantallaPrincipal : AppCompatActivity()
{

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.weightPicker.minValue = 30
        binding.weightPicker.maxValue = 150

        binding.heightPicker.minValue = 100
        binding.heightPicker.maxValue = 250

        binding.weightPicker.setOnValueChangedListener{ _,_,_ ->
            calculateSpeedy()
        }
    }
    private fun calculateSpeedy()
    {
        val height = binding.heightPicker.value
        val doubleheight = height.toDouble() / 100

        val weight = binding.weightPicker.value

        val speedy = weight.toDouble() / (doubleheight * doubleheight)

        binding.resultsTV.text = String.format("Your body mass index is: %.2f", speedy)
        binding.healthyTV.text = String.format("your weight is: %s", healthyMessage(speedy))
    }

    private fun healthyMessage(speedy: Double): String
    {
        if(speedy < 18.5)
            return "Under weight"

        if(speedy < 25.0)
            return "Healthy"

        if(speedy < 30.0)
            return "Overweight"

        return "Obesity"
    }
}