object Q2 extends App{

    def evenOdd(number:Int):Int = number match {
      case x if x <= 0 => -1
      case x if x%2 == 0 => 1
      case _ => 0
    }

    print("Enter a number : ")
    var getnumber = scala.io.StdIn.readInt()

    var returnValue = evenOdd(getnumber)

    returnValue match{
      case x if x == -1 => println("The given number is Negative or Zero")
      case x if x == 0 =>  println("The given number is odd")
      case x if x == 1 =>  println("The given number is even")
    }

  }

