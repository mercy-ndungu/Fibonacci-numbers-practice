package com.kirigo.fibonaccinumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kirigo.fibonaccinumbers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        numbersdisplay(100)
        var fibonacci = numbersdisplay(100)
        println(fibonacci)
        binding.rvNumbers.layoutManager=LinearLayoutManager(this)
        binding.rvNumbers.adapter=NumberRecyclerViewAdapter(fibonacci)
    }
    fun numbersdisplay(size:Int):List<Int>{
        var numbers = listOf<Int>()
        var first = 0
        var firstsecond = 1 //fibonacci another default number
        var positions = 0

        while (positions < size){
            first = firstsecond
            var sum = first + firstsecond
            firstsecond = sum

            positions++

            numbers+=firstsecond


        }
        return numbers


    }
}

//}
//class MainActivity : AppCompatActivity() {
//    lateinit var binding:ActivityMainBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        //numbersdisplay(100)
//        var fibonacci = numbersdisplay(100)
//        println(fibonacci)
//        binding.rvNumbers.layoutManager=LinearLayoutManager(this)
//        binding.rvNumbers.adapter=NumberRecyclerViewAdapter(fibonacci)
//    }
//
//    fun numbersdisplay(size:Int):List<Int>{
//        var numbers = listOf<Int>()
//        var first = 0
//        var firstsecond = 1 //fibonacci another default number
//        var positions = 0
//
//        while (positions < size){
//            first = firstsecond
//            var sum = first + firstsecond
//            firstsecond = sum
//
//            positions++
//
//            numbers+=firstsecond
//
//
//        }
//        return numbers
//
//
//    }
//}