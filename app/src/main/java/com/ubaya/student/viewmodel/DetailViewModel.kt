package com.ubaya.student.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ubaya.student.model.Student

class DetailViewModel: ViewModel() {
    val studentLD = MutableLiveData<Student>()

    fun fetch() {
        val student1 = Student("16055","Nonie","1998/03/28","5718444778",
            "http://dummyimage.com/75x100.jpg/cc0000/ffffff")
        studentLD.value = student1

        val student2 = Student("160456","Jamal","1999/09/22","5718466789",
            "http://dummyimage.com/75x100.jpg/cc0000/ffffff")
        studentLD.value = student2
    }



}
