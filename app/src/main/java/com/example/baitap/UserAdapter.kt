package com.example.baitap

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(
    private val context: Context,
    private val userList: ArrayList<User>,
): RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = userList[position]
        holder.imgAvatar.setImageResource(user.avatar)
        holder.txtName.text = user.name
        holder.txtdate.text = user.date
        holder.txtDescription.text = user.desciption
        holder.txtTime.text = user.time
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    inner class UserViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imgAvatar: ImageView = itemView.findViewById(R.id.img_item_user_avatar)
        val txtName: TextView = itemView.findViewById(R.id.txt_user_name)
        val txtdate: TextView = itemView.findViewById(R.id.txt_item_user_date)
        val txtTime: TextView = itemView.findViewById(R.id.txt_item_user_time)
        val txtDescription: TextView = itemView.findViewById(R.id.txt_item_user_description)
    }
}