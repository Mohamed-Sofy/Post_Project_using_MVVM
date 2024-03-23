package com.fcai.post_project_using_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.fcai.post_project_using_mvvm.Adapter.PostAdapter
import com.fcai.post_project_using_mvvm.ViewModel.PostViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel :PostViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        post_recycler.layoutManager = LinearLayoutManager(this)
        // Create and set adapter


        viewModel.posts.observe(this,{ PostList->
            val adapter = PostAdapter(PostList)
            post_recycler.adapter = adapter
        })

    }
}