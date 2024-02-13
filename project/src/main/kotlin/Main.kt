

// write a function that satisfies the following requirements

// function takes 2 strings for first and last name
// function takes a formatting function parameter
// function should print the result of the passed format function
fun thisisfun(valu1:String,valu2:String,formatter :(String,String) ->String)
{
    println(formatter(valu1,valu2))
}

fun main() {
thisisfun("John","Doe") { ok, ok1 -> "$ok,$ok1" }
}

