package com.chinalife.spark

/**
  * Created by Administrator on 2019/1/8.
  */
object Ts {

  def main(args: Array[String]): Unit = {
    println(matchTest(2))
  }


  def matchTest(x:Int):String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

}
