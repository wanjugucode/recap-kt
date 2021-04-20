import java.util.*
import kotlin.collections.ArrayList
fun Even(num:Int):Boolean {
    if (num % 2 == 0) {
        return true
    }
    else{
        return false
    }

}
data class User(var name: String,var weight:Int,var price:Int ,var category: String){
    fun product(category:String){
        when(category){
            "Gloceries"-> println("This belong to gloceries")
            "Hygine"-> println("This belong to hygine")
        else-> println("not classified")
        }

    }
}
 fun text(text:String):String{
     var t=text
     return t
     }




fun sortName(nameArrays:Array<String>):String {
    var names = listOf(nameArrays)
    for (name in nameArrays)
        if (name.length % 2 == 0) {
            return name
        }
}
    fun main() {
        var num = Even(9)
        println(num)

        var y = User("carbage", 5, 50, "gloceries")
        println(y.product("Gloceries"))

        var u = text("kotlin")
        println(u[0])
        println(u[2])
        println(u[4])

var allNames=sortName(nameArrays = arrayOf("mary","adama","apple"))
    println(allNames)

    }
