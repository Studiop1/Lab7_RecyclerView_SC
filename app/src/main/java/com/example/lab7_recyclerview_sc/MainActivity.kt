package com.example.lab7_recyclerview_sc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//Don't forget to add the plugin, sync the gradle and add two import statements.
//             These statements bind the controls in the GUI to the code you use.
//In this lab you will add New packages (think folders). and new files in those packages
//Notice that packages "model" and "data" are used to separate the files according to a MVC pattern
//Important!!! Book has a typo page 7-64 which prevents code from working!!!  'inner' has
//             to be lower case "i" not "Inner"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}