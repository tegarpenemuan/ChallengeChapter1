fun main() {
    for (i in 1 until 8 * 2) {
        if (i == 8) {
            for (j in 1 until 8 * 2) {
                print("*")
            }
        } else {
            for (k in 1 until 8) {
                print(" ")
            }
            print("*")
        }
        println()
    }
}