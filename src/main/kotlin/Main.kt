import kotlin.math.*
fun main(){
    var c1 = Point(-2,2)
    var c2 = Point(4,10)
    println(c1.toString())
    println(c2.toString())
    println(c1.equals(c2))
    println(c1.symmetry())
    println(c2.symmetry())
    println(c1.distance(c2))

}

class Point(var x: Int, var y: Int) {

    override fun toString(): String {
        return "X = $x ; Y = $y"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (x == other.x || y == other.y) {
                return true
            }
        }
        return false
    }

    fun symmetry(): String {
        var simetriaX = -x
        var simetriaY = -y
        return "Satavis Mimart Gadatanili Wertilis Kordinatebi X=$simetriaX ; Y=$simetriaY"
    }

    fun distance(other: Any?): String {
        if (other is Point) {
            var a = -x + other.x
            var b = other.y - y
            var d = a * a + b * b.toFloat()
            var c = sqrt(d)
            return "Sigrdze = $c"
        }
        return " "
    }
}