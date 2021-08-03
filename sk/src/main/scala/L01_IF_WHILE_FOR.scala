package sk.src.main.scala
import scala.collection.immutable

object L01_IF_WHILE_FOR {

  def main(args: Array[String]): Unit = {
    var a=0
    if(a <= 0){
      println(s"$a<=0")
    }else{
      println(s"$a>=0")
    }

    var  aa=0
    while(aa <10){
      println(aa)
      aa=aa+1
    }

    val seqs = 1 until  10
    println(seqs)

    //循环逻辑，业务逻辑
    for( i <-  seqs if(i%2==0)){
      println(i)
    }

    var num = 0
    for(i <- 1 to 9;j <- 1 to 9 if(j<=i)){
      num+=1
      if(j<=i) print(s"$j * $i = ${i*j}\t")
      if(j == i ) println()
    }
    println(num)

    val seqss: immutable.IndexedSeq[Int] = for ( i <- 1 to 10) yield {
      var x = 8
      i + x
    }
    for(i <-seqss){
      println(i)
    }
    //val ints: immutable.IndexedSeq[Int] = for (j <- 10 to 20) yield j {
    //
    //}
  }

}
