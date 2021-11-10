
import java.time.LocalDate


object HelloWorld extends App{


    val t =  Trade(1, "AAPL",10, 20.0)

    println(t)

    println("Calculated Value: "+ t.value())


//    val p1 = new Person("Fred", "Asas", LocalDate.of(2021, 12, 10))
//    println(p1)

    println("*"*15)
    val str = "A glass of beer - I love Beer"
    println(str)

    println(str.replaceAll("[bB]eer", "Fanta"))


    val pattern = "Scala".r
    val str1 = "Scala is Scalable and cool"

    println(pattern findFirstIn str1)

 println("Factorial Code ")

    def factorial(i: Int): Int = {
        def fact(i: Int, acumulator: Int): Int ={
             if(i<=1) acumulator else fact(i-1, i * acumulator)
        }
        fact(i, 1)
    }


    println( factorial(0) )
    println( factorial(1) )
    println( factorial(2) )
    println( factorial(5) )


}
