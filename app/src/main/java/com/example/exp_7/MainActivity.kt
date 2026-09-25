package com.example.exp_7

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val studentListView = findViewById<ListView>(
            R.id.studentListView
        )

        val students = listOf(

            Student(
                "Vishwajeet Singh",
                "25MCAR0219",
                "MCA • Machine Learning",
                R.drawable.vishwajeet
            ),

            Student(
                "Rahul Kumar",
                "25MCAR0205",
                "MCA • Data Science",
                R.drawable.ic_launcher_foreground
            ),

            Student(
                "Aman Sharma",
                "25MCAR0210",
                "MCA • Cloud Computing",
                R.drawable.ic_launcher_foreground
            ),

            Student(
                "Priya Singh",
                "25MCAR0221",
                "MCA • Artificial Intelligence",
                R.drawable.ic_launcher_foreground
            )
        )

        val adapter = StudentAdapter(
            students,
            layoutInflater
        )

        studentListView.adapter = adapter

        studentListView.setOnItemClickListener { _, _, position, _ ->

            val selectedStudent = students[position]

            Toast.makeText(
                this,
                "${selectedStudent.name} selected",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}