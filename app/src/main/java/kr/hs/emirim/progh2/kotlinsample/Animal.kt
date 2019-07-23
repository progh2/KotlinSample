package kr.hs.emirim.progh2.kotlinsample

class Animal(val map:MutableMap<String, Any?>) {
    var name:String by map
    var age:Int by map
}