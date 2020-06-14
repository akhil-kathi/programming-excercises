import scala.language.implicitConversions
object P1{
implicit def INTToStr(num: Int): String = s"The value is $num"
def functionTakingString(str: String) = str
def main(args:Array[String]):Unit={
println(42.toUpperCase()) 
println(functionTakingString(42))
}
}