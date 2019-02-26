package task04.dataClasses


import utils.tests

fun main() {

    tests("data class - copy",
        { Solution.task2(JavaWine("test", 1, "test", 1)).name == task2(
            Wine(
                "test",
                1,
                "test",
                1
            )
        ).name && Solution.task2(JavaWine("test", 1, "test", 1)).score == task2(
            Wine(
                "test",
                1,
                "test",
                1
            )
        ).score }
    )
}

/**
 * Task 2 - copy
 * The function task2 takes a task04.dataClasses.Wine object as a parameter. In the function, change the object so that
 * the name is changed to have 'wine' at the end of the original name, and the score to +1 of the original score.
 * Then, return the newly created object.
 * When your done, uncomment the second test in DataClasses.tk.
 * Hint: copy()
 */

data class Wine(val name: String, val year: Int, val winery: String, val score: Int)

fun task2(wine: Wine): Wine {
    return wine //wine.copy( name = wine.name + "wine", score = wine.score + 1)
}