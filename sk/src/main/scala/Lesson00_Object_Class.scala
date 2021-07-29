
//约等于  static  单例对象
object ooxx {


  //private val xo = new ooxx("男")
  private val xo = new ooxx(11)
  private val name = "object:zhangsan"


  println("ooxx....up")

  def main(args: Array[String]): Unit = {
    println("hello from ooxx")
    xo.printMsg()
  }

  println("ooxx....down")
}


class ooxx(sex: String) {

  def this(xname: Int) {  //TODO xname?
    //必须调用默认构造
    this("abc")
  }

  var a: Int = 3

  println(s"ooxx....up$a....")

  def printMsg(): Unit = {
    println(s"name: ${ooxx.name}")
    println(s"sex: ${this.sex}")
  }

  println(s"ooxx....up${a + 4}")

}