fun main(args: Array<String>) {

    val myF = fun (){

    }

    myF()

    myFun(myF)

    val myFff = ret()
    myFff()()

    ret()()()

    mem()()
}

fun myFun(callMe:()->Unit){
    callMe()
}

fun ret():()->()->Unit{
    return fun ():()->Unit{
       return fun (){
           println("Hello")
       }
    }
}

fun mem():()->Unit{
    return fun (){
        println("mem")
    }
}