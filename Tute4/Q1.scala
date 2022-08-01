 object Q1 extends App {

    def interest(x:Double):Double = x match{
      case x if x<20000 => x*0.02
      case x if x<200000 => x*0.04
      case x if x<2000000 => x*0.035
      case _ => x*0.065
    }

    println("Interest amount : Rs.",interest(3000))
    println("Interest amount : Rs.",interest(30000))
    println("Interest amount : Rs.",interest(300000))
    println("Interest amount : Rs.",interest(3000000))

 }


