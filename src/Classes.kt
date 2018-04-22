class Me
class Me2(val v1:String,val v2:String){
    override fun toString(): String {
        return v1+v2
    }
}

data class MyStringWaliClass(val name:String,val age:Int)

fun main(args: Array<String>) {
    val m = Me()
    //m.toString()
    val m1 = Me2("Hello","World")
    m1.v1

    val myStrClass = MyStringWaliClass("Talha",23)
    val myStrClass1 = MyStringWaliClass("Talha",23)
    println(myStrClass)
    println(myStrClass == myStrClass1)
}