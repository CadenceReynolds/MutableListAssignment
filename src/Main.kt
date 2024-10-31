fun main() {
    val newBuildIdea = mutableListOf(
        "Stone", "Stone_Bricks", "Pale_Planks", "Pale_Logs"
    )
    newBuildIdea.add(2, "Birch_Stripped_Logs")
    newBuildIdea[2] = "Birch_Planks"
    newBuildIdea.remove("Birch_Planks")
    println(newBuildIdea)
}