fun printCalc(value1:Int,value2:Int,calculator:(Int,Int)->Int){
   println("The value is : ${calculator(value1,value2)}")
}

fun main() {
    printCalc(2,2) { value1, valu2 -> value1 + valu2 }
    printCalc(2,2){
        value1,valu2-> value1-valu2
    }
}