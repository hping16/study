package sk.src.main.scala

import java.util

object L02_Functions {
  def main(args: Array[String]): Unit = {
    println("-------1.basic----------")
    def fun01(): Unit = {
      println("hello world")
    }
    fun01()

    var x = 3
    var y = fun01()
    println(y)

    def fun02() = {
      new util.LinkedList[String]()
    }
    fun02()

    def fun03(a:Int):Unit = {
      println(a)
    }
    fun03(33)

    println("-------2.递归函数----------")
    //递归先写触底！  触发什么报错呀
    def fun04(num: Int): Int = {
      if (num == 1) {
        num
      } else {
        num * fun04(num - 1)
      }
    }
    val i: Int = fun04(10)
    println(i)


    println("-------3.默认值函数----------")
    def fun05(a: Int = 8, b:String = "abc"):Unit = {
      println(s"$a\t$b")
    }
    fun05(22)
    fun05(b="dd")

    println("-------4.匿名函数----------")
    var xx: Int = 3
    var yy: (Int, Int) =>Int = (a: Int, b:Int) => {
      a + b
    }
    val w: Int = yy(3,4)
    println(w)

    println("--------5.嵌套函数---------")
    def fun06(a: String): Unit = {
      def fun05(): Unit = {
        println(a)
      }
      fun05()
    }
    fun06("hello")







  }
}
