fun main() {

    var a = listOf(1,2,3,4,5,6,7,8,9,10)

    var b = listOf("Ivan","Anatolei","Boris","Danil")


    // Immutable list

    // println in index

    for (i in b)
        println(i)
    for (j in a)
        println(j)

    // println in get(index)

    println(b.get(0))
    println(b.get(3))

    //getOrNull()

    println(b.getOrNull(10))

    //subList

    println(b.subList(1, 3))

    //Mutable list and ArrayList

    var x: ArrayList<Int> = arrayListOf(1,2,3,4,5,6,7,8,9)

    var y: MutableList<String> = mutableListOf("Bob","Tom","Alexandro","Maria","Angela")

    // add remove clear

    println(x)
    println(y)

    x.add(55)

    x.removeAt(3)

    y.clear()

    println(x)
    println(y)







}