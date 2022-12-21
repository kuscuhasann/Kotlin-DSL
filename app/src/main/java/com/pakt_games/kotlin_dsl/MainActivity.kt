package com.pakt_games.kotlin_dsl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun printAndExecuteTask(text: String, task: () -> Unit) {
            println(text)
            task()
        }

        val mySurnameTask: () -> Unit = {
            println("Kuşçu")
        }
        printAndExecuteTask("Hasan", mySurnameTask)

    }
}