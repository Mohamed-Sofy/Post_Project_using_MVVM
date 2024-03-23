package com.fcai.post_project_using_mvvm.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fcai.post_project_using_mvvm.Model.PostModel
import com.fcai.post_project_using_mvvm.R

class PostAdapter(private val postList: List<PostModel>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    inner class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileImage: ImageView = itemView.findViewById(R.id.profile_image)
        val personName: TextView = itemView.findViewById(R.id.person_name)
        val postDate: TextView = itemView.findViewById(R.id.post_date)
        val postDescription: TextView = itemView.findViewById(R.id.post_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.post_item, parent, false)
        return PostViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val currentItem = postList[position]

        // Bind data to views
        //holder.profileImage.setImageResource(currentItem.profileImageResId)
        holder.personName.text = currentItem.account.name
        holder.postDate.text = currentItem.DateTime
        holder.postDescription.text = currentItem.post_description
    }

    override fun getItemCount() = postList.size
}