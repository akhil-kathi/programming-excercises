import scala.language.implicitConversions
//implicit classes
case class name(nm:String)

object P3{
    implicit class Lstnm(nme:name){
        def lastname:String=nme.nm.split(" ")(1).take(1)
    }
    def main(args:Array[String]):Unit={
        val x= name("Akhil K")
        println(x.lastname)
    }

}