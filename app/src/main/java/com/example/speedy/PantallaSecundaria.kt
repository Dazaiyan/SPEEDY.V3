package com.example.speedy

import android.R
import android.os.Bundle
import android.view.View
import android.widget.NumberPicker
import androidx.appcompat.app.AppCompatActivity
import com.example.speedy.databinding.ActivityPantallaSecundariaBinding


class PantallaSecundaria : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaSecundariaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantallaSecundariaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.weightPicker2.minValue = 30
        binding.weightPicker2.maxValue = 150

        binding.heightPicker2.minValue = 100
        binding.heightPicker2.maxValue = 250

        binding.AgePicker.minValue = 1
        binding.AgePicker.maxValue = 100

        binding.weightPicker2.setOnValueChangedListener{ _, _, _->
            calculateSpeedy()
        }
    }
    private fun calculateSpeedy(){
        val height = binding.heightPicker2.value
        val height2 = height.toDouble() * 3.098
        val weight = binding.weightPicker2.value
        val weight2 = weight.toDouble() * 9.247
        val age = binding.AgePicker.value
        val age2 = age.toDouble() * 4.330
        val mujer = 447.593
        val speedy2 = mujer + weight2 + height2 - age2

        val fheight = binding.heightPicker2.value
        val fheight2 = fheight.toDouble() * 4.799
        val fweight = binding.weightPicker2.value
        val fweight2 = fweight.toDouble() * 13.397
        val fage = binding.AgePicker.value
        val fage2 = fage.toDouble() * 5.677
        val hombre = 88.362
        val speedy = hombre + fweight2 + fheight2 - fage2

        binding.resultsTV.text = String.format("Basal metabolic rate of man: %.2f", speedy)
        binding.healthyTV.text = String.format("Basal metabolic rate of women: %.2f", speedy2)

    }
    }

