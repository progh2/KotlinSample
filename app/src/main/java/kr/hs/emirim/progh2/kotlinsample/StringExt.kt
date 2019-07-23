package kr.hs.emirim.progh2.kotlinsample

fun String.lastString():String{
    return this.get(this.length - 1).toString()
}

class ExtTest{
    fun String.extFunc(){
        println(this.lastString())
    }
    fun method1(){
        "test".extFunc()
    }
}
fun test(){
    "test".lastString()
   // "test".ex
}