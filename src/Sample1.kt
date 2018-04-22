infix fun Any.fuck(str:Any):String{
    return "$this is fucking $str"
}

fun String.talha():String{
    return "$this is called by talha"
}

fun main(args: Array<String>) {
    println("Younus" fuck "darhi wala admi")
    println(1 fuck 2)

    "".talha()

    val nums:ArrayList<String> = arrayListOf(
            "","",""
    )
    nums.add("")

    nums.forEach {

    }
    nums.map { "$it mapped" }.forEach {

    }
    nums.filter { (it == "Fuck") }.map { "$it mapped" }.forEach {

    }

}