package com.chinalife.spark

/**
  * Created by Administrator on 2019/1/4.
  */
object Iterators {

  def main(args: Array[String]): Unit = {

    //iterators()
    //maxmin();
    itsize();
  }

  def iterators (): Unit = {
    val it = Iterator("Baidu", "Google", "Runoob", "Taobao")
    while (it.hasNext) {
      println("it=" + it.next())
    }
  }
  def  maxmin(): Unit ={
    val ita = Iterator(20,40,2,50,69, 90)
    val itb = Iterator(20,40,2,50,69, 90)

    println("最大元素是：" + ita.max )
    println("最小元素是：" + itb.min )
  }
  def itsize(){
    val ita = Iterator(20,40,2,50,69, 90)
    val itb = Iterator(20,40,2,50,69, 90)

    println("ita.size 的值: " + ita.size )
    println("itb.length 的值: " + itb.length )
  }

  }

