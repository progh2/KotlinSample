package kr.hs.emirim.progh2.kotlinsample

import java.io.InputStreamReader
import java.net.URL
import kotlin.properties.Delegates

class User {
    var nickname by DelegateString()
    val httpText by lazy{
        println("lazy init start")
        InputStreamReader(
            URL("https://www.naver.com").openConnection()
            .getInputStream()).readText()
    }

    var name:String by Delegates.observable(""){
        property, oldValue, newValue ->
        println("기존값: ${oldValue}, 새로적용될 값: ${newValue}")
    }
}