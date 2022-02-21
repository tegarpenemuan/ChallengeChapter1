fun main() {
    for (i in 1 until 15 * 2) {
        for (j in 1..15) {
            if (j == i || j == 15 - i + 1) {
                print("*")
            }
            print(" ")
        }
        println()
    }
}
