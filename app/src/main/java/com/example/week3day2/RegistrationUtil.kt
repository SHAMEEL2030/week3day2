package com.example.week3day2

object RegistrationUtil {

    fun validateInput(username: String, password: String, confirmpassword: String): Boolean {
        if (password!=confirmpassword) {
            return false
        }
        return true
    }
}
