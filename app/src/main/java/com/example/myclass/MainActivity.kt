package com.example.myclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterStudent = StudentAdapter(generateStudents()) {
            student ->
            Toast.makeText(this@MainActivity, "${student.name}",
                Toast.LENGTH_SHORT).show()
        }

        with(binding) {
            rvStudent.apply {
                adapter = adapterStudent
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        }
    }

    fun generateStudents(): List<Student> {
        return listOf(
            Student(resID = R.drawable.scoups, name = "Choi Seungcheol", nim = "22/505621/SV/21841", gpa = 4.0),
            Student(resID = R.drawable.jeonghan, name = "Yoon Jeonghan", nim = "22/505622/SV/21842", gpa = 3.7),
            Student(resID = R.drawable.joshua, name = "Hong Joshua", nim = "22/505623/SV/21843", gpa = 3.5),
            Student(resID = R.drawable.jun, name = "Wen Junhui", nim = "22/505624/SV/21844", gpa = 4.0),
            Student(resID = R.drawable.hoshi, name = "Kwon Soonyoung", nim = "22/505625/SV/21845", gpa = 3.0),
            Student(resID = R.drawable.wonwoo, name = "Jeon Wonwoo", nim = "22/505626/SV/218446", gpa = 4.0),
            Student(resID = R.drawable.woozi, name = "Lee Jihoon", nim = "22/505627/SV/21847", gpa = 3.2),
            Student(resID = R.drawable.mingyu, name = "Kim Mingyu", nim = "22/505628/SV/21848", gpa = 2.5),
            Student(resID = R.drawable.the8, name = "Xu Minghao", nim = "22/505629/SV/21849", gpa = 2.5),
            Student(resID = R.drawable.dk, name = "Lee Dokyeom", nim = "22/505630/SV/21850", gpa = 3.7),
            Student(resID = R.drawable.seungkwan, name = "Boo Seungkwan", nim = "22/505631/SV/21851", gpa = 2.0),
            Student(resID = R.drawable.vernon, name = "Chwe Vernon", nim = "22/505632/SV/21852", gpa = 3.2),
            Student(resID = R.drawable.dino, name = "Lee Dino", nim = "22/505633/SV/21853", gpa = 3.4)
        )
    }
}