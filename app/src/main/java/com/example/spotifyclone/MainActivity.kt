package com.example.spotifyclone

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.songList)

        val songs = listOf(
            "Song 1",
            "Song 2",
            "Song 3"
        )

        // 🔥 IMPORTANT LINE (custom layout use karto)
        val adapter = ArrayAdapter(this, R.layout.song_item, R.id.songName, songs)

        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "Playing ${songs[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}
