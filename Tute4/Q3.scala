object Q3 extends App {
  def toUpper(x:String):String={
    return (x.toUpperCase())

  }
  def toLower(x:String):String={
    return(x.toLowerCase())
  }

  def formatNames(g:String=>String,x:String): Unit ={
    val StringValue=g(x)
    print(StringValue)
  }
  formatNames(toUpper,"Benny ")
  println()
  formatNames(toUpper,"Niroshan ".slice(0,2))
  formatNames(toLower,"Niroshan ".slice(2,8))
  println()
  formatNames(toLower,"Saman ".slice(0,6))
  println()
  formatNames(toUpper,"Kumara ".slice(0,1))
  formatNames(toLower,"Kumara ".slice(1,5))
  formatNames(toUpper,"Kumara ".slice(5,6))
  println()

}
