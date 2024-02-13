

var greetingFunction: (String) ->Unit={
    println(it)
}


fun main() {
 greetingFunction("ok")
 greetingFunction.invoke("ok my man")
}

