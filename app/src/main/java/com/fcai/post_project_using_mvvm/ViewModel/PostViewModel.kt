package com.fcai.post_project_using_mvvm.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.fcai.post_project_using_mvvm.Model.AccountModel
import com.fcai.post_project_using_mvvm.Model.PostModel
import java.nio.file.attribute.PosixFileAttributeView

class PostViewModel: ViewModel() {

    var posts:MutableLiveData<ArrayList<PostModel>> = MutableLiveData<ArrayList<PostModel>>()

    fun GetData(): ArrayList<PostModel> {

        var List = arrayListOf<PostModel>(
            PostModel(1,
                AccountModel(5,"Mohamed Sofy",""),
                "Happy birthDay","Jun 1, 2023"),
            PostModel(2,
            AccountModel(122,"Adel Ahmed",""),
            "Today, I leaved FCAI ","October 10, 2023"),
            PostModel(3,
                AccountModel(20,"mai Ahmed",""),
                "Ramadan Kareem","March 23, 2024")
        )
        return List
    }

    fun GetAllPosts(){
        posts.value = GetData()
    }
}