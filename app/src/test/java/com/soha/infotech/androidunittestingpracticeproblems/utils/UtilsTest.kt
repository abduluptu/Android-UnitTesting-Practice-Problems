package com.soha.infotech.androidunittestingpracticeproblems.utils

import org.junit.After
import org.junit.AfterClass
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

class UtilsTest {

    lateinit var utils: Utils

    companion object {

        @BeforeClass
        @JvmStatic
        fun beforeEveryThing() {
            println("Before Everything")
        }

        @AfterClass
        @JvmStatic
        fun afterEveryThing() {
            println("After Everything")
        }
    }

    @Before
    fun setUp() {
        utils = Utils()
    }


    @After
    fun tearDown() {
        println("Tearing it down")
    }

    @Test
    fun isPallindrome_forInput_Hello_expectedFalse() {
        //Arrange
        val input = ""
        //Act
        val result = utils.isPallindrome(input)
        //Assert
        assertEquals(false, result)
    }

    @Test
    fun isPallindrome_inputstring_level_expectedTrue() {
        //Arrange
        val input = "level"
        //Act
        val result = utils.isPallindrome(input)
        //Assert
        assertEquals(true, result)
    }
}