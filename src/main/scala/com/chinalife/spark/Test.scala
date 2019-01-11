package com.chinalife.spark

/**
  * Created by Administrator on 2019/1/3.
  */
object Te {





  def main(args: Array[String]): Unit = {

    //println(Te.addInt(1,2));
   // printMe();
    //delayed(time());//函数传名调用

    //printInt(b=5,a=7)//指定函数参数名
    //printStrings("Runoob", "Scala", "Python");//可变参数
    //println( "muliplier(1) value = " +  multipolier(1) )
    //println( "muliplier(2) value = " +  multipolier(2) )

   // var x = inc(7)-1
    //println("x:"+x)
   // println(mul(1,2));
    println( userDir() )

  }

  def printMe(): Unit ={
    println("Hello Scala !")
  }

  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b

    return sum
  }
  def time()={
    println("获取时间，单位为纳秒")
    System.nanoTime()
  }

  def delayed(t: => Long) ={
    println("在 delayed 方法内")
    println("参数： " + t)
    //t
  }
  def printInt( a:Int, b:Int ) = {
    println("Value of a : " + a );
    println("Value of b : " + b );
  }
  def printStrings( args:String* ) = {
    var i:Int = 0;
    for( arg <- args ){
      println("Arg value[" + i + "] = " + arg );
      i = i + 1;
    }
  }
  var factor = 3;//自由变量 factor
  //这样定义的函数变量 multiplier 成为一个"闭包"，因为它引用到函数外面定义的变量，
  // 定义这个函数的过程是将这个自由变量捕获而构成一个封闭的函数。
  val multipolier = (i:Int ) => i* factor

  var inc = (x:Int ) => x+1;//匿名函数

  var mul = (x:Int,y:Int) => x*y//匿名函数
  var userDir = () => { System.getProperty("user.dir") }

}
