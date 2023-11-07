package com.example.myclass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myclass.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("student_name")
        val nim = intent.getStringExtra("student_nim")
        val gpa = intent.getStringExtra("student_gpa")
        val img = intent.getStringExtra("student_img")

        with(binding) {
            val resID = img?.toInt()
            studentName.text = name
            studentNim.text = nim
            studentGpa.text = gpa
            resID?.let { studentImg.setImageResource(it) }

            btnBack.setOnClickListener {
                val intentToMainActivity = Intent(this@DetailActivity, MainActivity::class.java)
                startActivity(intentToMainActivity)
            }
        }
    }
}