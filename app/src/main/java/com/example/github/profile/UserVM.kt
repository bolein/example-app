package com.example.github.profile

import com.controllers.Controller
import com.example.R
import com.example.model.data.User
import eu.theappshop.baseadapter.vm.BaseVM

class UserVM(val parent: Controller<*>, val user: User) : BaseVM {
    override fun getLayoutId() = R.layout.item_user
}