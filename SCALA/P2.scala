import scala.language.implicitConversions
object P2
{
    implicit def num(x:String):Int=10
    def strg (inp:Int):Int=inp
    def main(args:Array[String]):Unit={
        val z="ten"
        println(z.toInt)

        println(strg("Hello World"))
    }

}