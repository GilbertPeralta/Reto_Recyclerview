package com.example.reto_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.reto_recyclerview.databinding.ItemCardBinding
import org.json.JSONObject

class MainAdapter(private val profiles: Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(profiles[position])
    }

    override fun getItemCount(): Int = profiles.size

    class MainHolder(val binding: ItemCardBinding): RecyclerView.ViewHolder(binding.root) {
        fun render(profile: JSONObject) {
            binding.tvProfilename.setText(profile.getString("name"))
            binding.tvMutualfriends.setText(profile.getString("Mutualfriends"))
            binding.ivProfilepic.setImageResource(R.drawable.person_profile)
            binding.ivFriendspic.setImageResource(R.drawable.person_friends)




        }
    }
}