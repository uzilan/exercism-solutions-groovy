class Raindrops {
    static def map = [3: "Pling", 5: "Plang", 7: "Plong"]

    static def convert(num) {
        def result = map.collect {
            pair -> num % pair.key == 0 ? pair.value : ""
        }.join("")
        result.isEmpty() ? "$num" : result
    }
}
