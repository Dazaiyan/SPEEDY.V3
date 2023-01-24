package com.example.speedy

import android.R
import android.os.Bundle
import android.view.View
import android.widget.NumberPicker
import androidx.appcompat.app.AppCompatActivity
import com.example.speedy.databinding.ActivityMainBinding
import com.example.speedy.databinding.ActivityPantallaTerceariaBinding

class PantallaTercearia : AppCompatActivity() {
    private lateinit var binding: ActivityPantallaTerceariaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantallaTerceariaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.weightPicker3.minValue = 30
        binding.weightPicker3.maxValue = 150

        binding.heightPicker3.minValue = 100
        binding.heightPicker3.maxValue = 250

        binding.weightPicker3.setOnValueChangedListener { _, _, _ ->
            calculateSpeedy2()
        }
    }
        private fun calculateSpeedy2(){

        val weight = binding.weightPicker3.value
        val weight2 = weight.toDouble() * 1.07
        val weight1 = binding.weightPicker3.value
        val weight3 = 148 * (weight1.toDouble() * weight1.toDouble())
        val height = binding.heightPicker3.value
        val height2 = height.toDouble() * height.toDouble()
        val speedy2 = weight2 - weight3 / height2

        val Hweight = binding.weightPicker3.value
        val Hweight2 = Hweight.toDouble() * 1.10
        val Hweight1 = binding.weightPicker3.value
        val Hweight3 = 128 * (Hweight1.toDouble() * Hweight1.toDouble())
        val Hheight = binding.heightPicker3.value
        val Hheight2 = Hheight.toDouble() * Hheight.toDouble()
        val speedy = Hweight2 - Hweight3 / Hheight2

        binding.resultsTV3.text = String.format("\n" +
                "Lean body mass of a man: %.2f", speedy)
        binding.healthyTV3.text = String.format("\n" +
                "Lean body mass of a woman: %.2f", speedy2)

    }
    }
