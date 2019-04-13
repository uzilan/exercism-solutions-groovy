rootProject.name = "groovy"

file("./").listFiles()
        .filter { it.isDirectory }
        .filter { !listOf(".idea", ".gradle", ".git").contains(it.name) }
        .forEach { include(it.name) }