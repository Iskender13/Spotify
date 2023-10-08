package com.example.spotify

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spotify.databinding.ActivityMainBinding
import com.example.spotify.databinding.ItemMusicBinding

class MusicAdapter(private var list: ArrayList<MusicModel>,
private var onClick: (position: Int) -> Unit): RecyclerView.Adapter<MusicAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])

    }
    inner class ViewHolder(private var binding: ItemMusicBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: MusicModel){
            itemView.setOnClickListener{
                onClick(adapterPosition)
            }
            binding.name.text = item.name
            binding.author.text = item.author
            binding.time.text = item.time
            binding.number.text=item.number
        }

    }


}