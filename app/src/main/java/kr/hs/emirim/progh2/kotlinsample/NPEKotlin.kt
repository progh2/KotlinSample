package kr.hs.emirim.progh2.kotlinsample

fun strLenNonNull(str:String):Int{
    return str.length
}

fun strLenNullable(str:String?):Int{
    if(str != null){
        return str.length
    }else{
        return 0
    }

}

fun strLastCharNullable(str:String?):Char{
    // ?. 연산자는 str이 NULL이면 null이 반환된다.
    return str?.get(str.length - 1) ?: "".single()
}

fun strPrintLen(str:String?){
    str?.let{ print(strLenNonNull(it)) }

    //str?.let{ item:String -> print(strLenNonNull(item)) }
}