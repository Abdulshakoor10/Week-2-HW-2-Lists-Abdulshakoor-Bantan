
fun main() {
    
    // Read-only (immutable)
    val names = listOf("Ahad", "Turki", "Raghad", "Nasser", "Sumayah", "Fahdah")
    val namesAll = listOf("Ahad", "Turki", "Raghad", "Nasser")
    val color = listOf<String>()
    
    // Read and Write (mutable)
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val weekDays = mutableListOf("Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat")

    // another mutable list (from Abdulshakoor)
    val greeting = mutableListOf("Hi", "Hello")




    // Read-Write (mutable) List - Operations

    // Add (Element)
    println("\n================= Add (Element) =================")
    println("numbers before: $numbers")
    numbers.add("six")
    println("numbers.add(\"six\"): $numbers")
//    println("numbers.add(\"six\"): ${numbers.add("six")}")   // will return true

    // Add (Index, Element)
    println("\n============= Add (Index, Element) ==============")
    println("numbers before: $numbers")
    numbers.add(2,"zero")
    println("numbers.add(2,\"zero\"): $numbers")
//    println("numbers.add(2,\"zero\"): ${numbers.add(2, "zero"}")  ////return kotlin.Unit (not working)

    // Add All (List)
    println("\n================ Add All (List) =================")
    println("numbers before: $numbers")
    numbers.addAll(weekDays)
    println("numbers.addAll(weekDays) : $numbers")
//    println("numbers after : ${numbers.addAll(weekDays)}")   //will return true

    // Add All (Index, List)
    println("\n============ Add All (Index, List) ==============")
    println("greeting before: $greeting")
    greeting.addAll(1,names)
    println("greeting.addAll(names): $greeting")
//    println("greeting.addAll(names): ${greeting.addAll(1,names)}")   //will return true

    // Remove
    println("\n=============== Remove (Element) ================")
    println("numbers before: $numbers")
    numbers.remove("six")
    println("numbers.remove(\"six\") : $numbers")  //will remove the first "six" element only
//    println("numbers.remove(\"six\") : ${numbers.remove("ten")}")  //will return true/false

    // Remove At
    println("\n=============== Remove At (Index) ===============")
    println("numbers before: $numbers")
    numbers.removeAt(1)
    println("numbers.removeAt(1) : $numbers")
//    println("numbers.removeAt(1) : ${numbers.removeAt(2)}")  //will print (return) the element at that index

    // Remove All
    println("\n============== Remove All (Index) ===============")
    println("greeting before: $greeting")
    greeting.removeAll(names)
    println("greeting.removeAll(names) : $greeting")  //will remove all elements even if they're duplicated
//    println("greeting after : ${greeting.removeAll(weekDays)}")   //will return true/false

    // Clear
    println("\n==================== Clear ======================")
    println("numbers before: $numbers")
    numbers.clear()
    println("numbers.clear() : $numbers")
//    println("numbers after : ${numbers.clear()}")    //return kotlin.Unit (not working)



    // Read-only (immutable) List - Operations

    // The size of the list
    println("\n===================== Size ======================")
    println("names.size : ${names.size}")

    // Contains
    println("\n=============== Contains (Element) ==============")
    println("names.contains(\"Turki\") : ${names.contains("Turki")}")

    // Contains All
    println("\n============== Contains All (list) ==============")
    println("names.contains(namesAll) : ${names.containsAll(namesAll)}")

    // get
    println("\n================== Get (Index) ==================")
    println("names.get(4) : ${names.get(4)}")
//    println("names.get(4) : ${names[4]}")   //or you can use index operator lists in kotlin

    // indexOf
    println("\n=============== indexOf (Element) ===============")
    println("names.indexOf(\"Shaima\") : ${names.indexOf("Shaima")}")
    println("names.indexOf(\"Fahdah\") : ${names.indexOf("Fahdah")}")

    // isEmpty
    println("\n=================== is Empty ====================")
    println("names.isEmpty() : ${names.isEmpty()}")
    println("color.isEmpty() : ${color.isEmpty()}")


    // Sublist
    println("\n========= subList (fromIndex ,toIndex) ==========")
    println("names.subList(3,6) : ${names.subList(3,6)}")   // index 6 not included + won't change the original list


}// End main
