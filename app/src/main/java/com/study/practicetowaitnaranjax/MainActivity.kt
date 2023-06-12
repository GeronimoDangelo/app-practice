package com.study.practicetowaitnaranjax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}

class ClaseGenerica<T>(t: T) {
    val propiedad: T = t
    fun metodo(param: T) {
        println(param)
    }
}