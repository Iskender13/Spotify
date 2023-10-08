package com.example.spotify

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.spotify.databinding.ActivityMainBinding
import com.example.spotify.databinding.FragmentMusicBinding

class Music : Fragment() {
    private lateinit var binding: FragmentMusicBinding
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


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        binding = FragmentMusicBinding.inflate(layoutInflater)
        return inflater.inflate(R.layout.fragment_music, container, false)
        val adapter = MusicAdapter(musicList, this::onClick)
        binding.rvMusic.adapter=adapter
    }
     public fun onClick(pos: Int){
        Log.d("Spotify", musicList[pos].toString())
    }


}