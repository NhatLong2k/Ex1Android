package com.example.baitap


import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.baitap.databinding.ActivityMainBinding
import com.facebook.common.util.UriUtil
import com.google.android.material.tabs.TabLayoutMediator
import java.lang.String


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val uri = Uri.Builder()
            .scheme(UriUtil.LOCAL_RESOURCE_SCHEME) // "res"
            .path(String.valueOf(R.drawable.avatar))
            .build()
        binding.imgAvatar.setImageURI(uri)

        val adapter = FragmentAdapter(this)
        adapter.fragmentList = arrayListOf(BulletinFragment(), BulletinFragment(), BulletinFragment(), BulletinFragment())
        binding.vpMain.adapter = adapter
        TabLayoutMediator(binding.tlMain, binding.vpMain){ tab, position ->
            when(position){
                0 -> {
                    tab.setText("Bulletin")
                }
                1 -> {
                    tab.setText("Activities")
                }
                2 -> {
                    tab.setText("Members")
                }
                3 -> {
                    tab.setText("Pendings")
                }
            }
        }.attach()
    }
}