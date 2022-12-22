package com.pakt_games.kotlin_dsl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* fun printAndExecuteTask(text: String, task: () -> Unit) {
            println(text)
            task()
        }

        val mySurnameTask: () -> Unit = {
            println("Kuşçu")
        }
        printAndExecuteTask("Hasan", mySurnameTask) */


        /* val stringBuilder = StringBuilder().apply {
            this.append("Test Value")
        }

        val text = stringBuilder.toString()
        println(text) */


        /*val text = StringBuilder().run {
            this.append("Test Value")
            toString()
        }

        println(text)*/

        /*val sb = StringBuilder().also {
            it.append("Test Value")
        }

        val text = sb.toString()
        println(text)*/

        /*val stringBuilder = StringBuilder()

        val text = with(stringBuilder) {
            this.append("Scope Function")
            toString()
        }

        println(text)*/

        /*val testString = "H@s@n"

        infix fun String.changeCharacter(char: Char): String {
            return this.replace(char,'a')
        }

        println(testString.changeCharacter('@'))

        inlineFunction({ println("Service Events")})*/

        Internet.checkInternet()

    }
    inline fun inlineFunction(myFun: () -> Unit ) {
        myFun()
        print("Check Internet Event")
    }
}