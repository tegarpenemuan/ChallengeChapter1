fun main() {
    for (i in 1..8) {
        for (j in 8 downTo i + 1) {
            print(" ")
        }

        for (k in 1 until i * 2) {
            print("*")
        }
        println()
    }
    for (i in 8 - 1 downTo 1) {
        for (j in 8 - 1 downTo i) {
            print(" ")
        }

        for (k in 1 until i * 2) {
            print("*")
        }
        println()
    }
}
