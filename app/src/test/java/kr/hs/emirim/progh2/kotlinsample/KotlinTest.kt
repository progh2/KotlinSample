package kr.hs.emirim.progh2.kotlinsample

import org.junit.Assert
import org.junit.Test

class KotlinTest {
    @Test
    fun test1(){
        Assert.assertEquals(4, 1+3)
    }
    @Test
    fun testGetterSetter(){
        val person = Person("john")
        person.age = 20
        Assert.assertEquals(20, person.age)
    }
}