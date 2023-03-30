fun main() {
println(even(listOf("ann","ivy","book","Grace","pen","pencil","akech","atong","rebecca","maria")))
   println(avgheight(listOf(345.0,675.0,468.0)))
   people()
}
fun even(num:List<String>):List<String>{
    return num.filterIndexed { index,num->index%2==0 }


}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun avgheight(height:List<Double>):Pair<Double,Double>{
    var y = height.sum()
    var z = height.average()
    return Pair(y,z)

}



//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)

fun people(){
    val person1 = Person("Ann",20,160.0,54.0)
    val person2 = Person("Chut",25,171.0,65.8)
    val person3 = Person("Arok",21,167.0,58.0)
    val person4 = Person("Wel",24,162.0,69.0)
    val result = listOf(person1,person2,person3,person4)
    println(result.sortedByDescending { Person->Person.age })
}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.





//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
