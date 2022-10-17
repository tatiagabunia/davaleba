fun main() {
    val f1 = Fraction(6,  12)
    val f2 = Fraction( 4, 8)

    println(f1.toString())
    println(f2.toString())
    println(f1.equals(f2))
    println(f1 == f2)
    println(f1.truncate())
    println(f2.truncate())
    println(f1.sum(f2))
    println(f1.multiplication(f2))

}

class Fraction( numerator: Int, denominator: Int) {
    private var numerator: Int = numerator
    private var denominator: Int = denominator
    override fun toString(): String {
        return "$numerator / $denominator"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator == other.numerator * denominator) {
                return true
            }
        }
        return false
    }

    fun truncate(): String {
        var gcd = 1
        var i = 1
        while (i <= numerator && i <= denominator) {
            // Checks if i is factor of both integers
            if (numerator % i == 0 && denominator % i == 0)
                gcd = i
            ++i
        }
        var mricxcveli = numerator / gcd
        var mnishvneli = denominator / gcd

        return "shekvecili wiladia: $mricxcveli / $mnishvneli"
    }

    fun sum(other: Any?): String {
        if (other is Fraction) {

            var mnishvneli1 = denominator * other.denominator
            var mricxveli1 = mnishvneli1 / denominator * numerator + mnishvneli1 / other.denominator * other.numerator

            return "Jami: $mricxveli1 / $mnishvneli1"
            //var jami = truncate(mricxveli1,mnishvneli1)
            //return "Jami: $jami"
        }
        return ""
    }
    fun multiplication(other: Any?): String {
        if (other is Fraction) {
            var mricxveli2 = numerator * other.numerator
            var mnishvneli2 = denominator * other.denominator
            return "Namravli: $mricxveli2 / $mnishvneli2"
        }
        return ""
    }


}
