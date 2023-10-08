package com.example.spotify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Получаем переданное значение из интента
        val receivedValue = intent.getStringExtra("selectedItem")

        // Найдите TextView в макете активности по его идентификатору
        val textView = findViewById<TextView>(R.id.text_view) // Замените "textViewId" на актуальный идентификатор TextView

        // Устанавливаем значение в TextView
        textView.text = receivedValue
    }
}