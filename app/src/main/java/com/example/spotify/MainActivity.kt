package com.example.spotify

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val musicList = arrayListOf(
        MusicModel("1", "Save Your Tears", "The Weekend", "4:09"),
        MusicModel("2", "Blinding Lights", "The Weekend", "3:24"),
        MusicModel("3", "Gangsta's Paradise", "Tommy Boy", "4:17"),
        MusicModel("4", "Superman", "Eminem", "4:47"),
        MusicModel("5", "Smack That", "Akon", "4:12"),
        MusicModel("6", "Right Now", "Akon", "5:01"),
        MusicModel("7", "Daylight", "David Kushner", "3:50"),
        MusicModel("8", "Human", "Rag'n'Bone Man", "3:17"),
        MusicModel("9", "Diamonds", "Rihanna", "4:43"),
        MusicModel("10", "Counting Stars", "OneRepublic", "4:44")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.rv_Music)


        listView.setOnItemClickListener { parent, view, position, id ->
            // Получаем текст выбранного элемента
            val selectedItemText = musicList[position]

            // Создаем Intent и передаем значение в SecondActivity
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("", selectedItemText)
            startActivity(intent)
        }
    }
}

private fun Intent.putExtra(s: String, selectedItemText: MusicModel) {
}
