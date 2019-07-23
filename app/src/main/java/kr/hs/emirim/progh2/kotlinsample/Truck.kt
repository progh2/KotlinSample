package kr.hs.emirim.progh2.kotlinsample

class Truck(val id:Int, val name:String) {
    override fun equals(other:Any?):Boolean{
        val otherTruck = other as? Truck ?: return false
        return otherTruck.id == id
    }
}