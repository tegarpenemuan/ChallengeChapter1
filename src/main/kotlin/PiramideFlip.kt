fun main() {
    for (i in 8 downTo 1) {
        for (k in 1 until i * 2) {
            print("*")
        }
        println()

        for (j in 8 downTo i) {
            print(" ")
        }
    }
}