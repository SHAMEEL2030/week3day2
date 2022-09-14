package com.example.week3day2

import org.junit.Assert
import org.junit.Test


internal class RegistrationUtilTest{
    @Test
    fun `test validate password`(){
        val result = RegistrationUtil.validateInput("Sham","Shameel","Shameel")
        Assert.assertTrue(result)
    }
}