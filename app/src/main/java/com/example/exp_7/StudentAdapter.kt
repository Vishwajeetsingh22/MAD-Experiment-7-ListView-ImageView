package com.example.exp_7

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class StudentAdapter(
    private val students: List<Student>,
    private val inflater: LayoutInflater,
) : BaseAdapter() {

    override fun getCount(): Int {
        return students.size
    }

    override fun getItem(position: Int): Student {
        return students[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?,
    ): View {

        val view = convertView ?: inflater.inflate(
            R.layout.student_item,
            parent,
            false,
        )

        val image = view.findViewById<ImageView>(R.id.studentImage)
        val name = view.findViewById<TextView>(R.id.studentName)
        val usn = view.findViewById<TextView>(R.id.studentUsn)
        val course = view.findViewById<TextView>(R.id.studentCourse)

        val student = getItem(position)

        image.setImageResource(student.imageResId)
        name.text = student.name
        usn.text = student.usn
        course.text = student.course

        return view
    }
}