package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Test

class NumberAdderHelperTest {

    @Test
    fun addNums_returnsSumCorrectly() {
        // Arrange
        val numberAdderHelper = NumberAdderHelper()

        // Act 
        val ans = numberAdderHelper.addNums(3, 3)

        // Assert
        assertEquals(ans, 6)
    }
}