class ArmstrongNumber {
    static isArmstrongNumber(number) {
        def numberAsString = number.toString()
        def len = numberAsString.length()
        def result = numberAsString.collect { c -> c.toInteger()**len }.sum()
        result == number
    }
}