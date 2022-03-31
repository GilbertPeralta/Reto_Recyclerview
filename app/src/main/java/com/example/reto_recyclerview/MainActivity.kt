package com.example.reto_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.reto_recyclerview.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fakeProfileData: Array<JSONObject> = arrayOf(
            JSONObject("{\"name\": \"Jennifer Aniston\", \"Mutualfriends\": \"10 mutual friends\"}"),
            JSONObject("{\"name\": \"Scarlett Johansson\", \"Mutualfriends\": \"10 mutual friends\"}"),
            JSONObject("{\"name\": \"Elizabeth Olsen\", \"Mutualfriends\": \"8 mutual friends\"}"),
            JSONObject("{\"name\": \"Florence Pugh\", \"Mutualfriends\": \"12 mutual friends\"}"),
            JSONObject("{\"name\": \"Hayley Atwell\", \"Mutualfriends\": \"4 mutual friends\"}")
        )
        binding.rvProfileEntries.adapter = MainAdapter(fakeProfileData)
    }
}