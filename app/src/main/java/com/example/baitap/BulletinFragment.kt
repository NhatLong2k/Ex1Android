package com.example.baitap

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BulletinFragment : Fragment() {

    var rvUser: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_bulletin, container, false)
        val userList = ArrayList<User>()
        userList.add(User(R.drawable.avatar, "Nhật Long", "23 Maret 2022 - 00:41 WIB", "23 Maret 2022 - 00:41 WIB", getString(R.string.description)))
        userList.add(User(R.drawable.avatar, "Viên Bương", "23 Maret 2021 - 00:00 WIB", "23 Maret 2023 - 00:02 WIB", getString(R.string.description)))
        userList.add(User(R.drawable.avatar, "Phạm Trường", "23 Maret 2020 - 00:01 WIB", "23 Maret 2024 - 00:05 WIB", getString(R.string.description)))
        rvUser = root.findViewById(R.id.rv_fragment_bulletin_user)
        rvUser?.setHasFixedSize(true)
        rvUser?.layoutManager = LinearLayoutManager(requireContext())
        val adapter: UserAdapter= UserAdapter(requireContext(), userList)
        rvUser?.adapter = adapter

        return root
    }
}