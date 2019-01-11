package com.chinalife.spark
//import java.awt._
//import java.util.List
import scala.collection.JavaConversions._
/**
  * Hello world!
  *
  */
object App {




  def  test(): Unit={
    println("my scala first method!")//djfdsjdjfidj
    val foo = """菜鸟教程
www.runoob.com
www.w3cschool.cc
www.runnoob.com
以上三个地址都能访问"""
    //println(foo)
  }
  def main(args: Array[String]){
    var v = "声明变量"
    val l = "声明常量"
    var ii:Integer =0
    val pa =(40,"Foo")

   // println(v +l );
    //test()



  }





}

/**
  * 用 private 关键字修饰，带有此标记的成员仅在包含了成员定义的类或对象内部可见，同样的规则还适用内部类。
  * Scala 中的 private 限定符，比 Java 更严格，在嵌套类情况下，外层类甚至不能访问被嵌套类的私有成员。
  * Java中允许这两种访问，因为它允许外部类访问内部类的私有成员。
  *
  * Scala中，如果没有指定任何的修饰符，则默认为 public。这样的成员在任何地方都可以被访问。
  */
class Outer{

    class inner{

        def f (){println("f")}
      class  InnerMost{
        f();
      }
    }
     (new inner).f();
}

/**
  * 在 scala 中，对保护（Protected）成员的访问比 java 更严格一些。因为它只允许保护成员在定义了该成员的的类的子类中被访问。
  * 而在java中，用protected关键字修饰的成员，除了定义了该成员的类的子类可以访问，同一个包里的其他类也可以进行访问。
  */
package  p{
  class  Super{

      protected def f(){println("f")}
  }
  class  Sub extends Super{

      f()
  }
  class  Other {
   // (new Super).f()
  }
}

/**
  *算术运算符
  */

object Test{

  def main(args: Array[String]): Unit = {

      var a = 10;
      var b = 20;
      println("a+b = "+(a+b));
      println("a-b ="+(a-b));
      println("a*b = "+a*b);
      println("b/a = "+b/a);
      println("b%a = "+b%a);
  }
}

/**
  * 关系运算符
  */
object Test1{
  def main(args: Array[String]){

    var a = 10;
    var b = 20;
    println("a == b = " + (a == b) );
    println("a != b = " + (a != b) );
    println("a > b = " + (a > b) );
    println("a < b = " + (a < b) );
    println("b >= a = " + (b >= a) );
    println("b <= a = " + (b <= a) );
  }
}

/**
  * 逻辑运算符
  */
object  Test2{
  def main(args: Array[String]) {
    var a = true;
    var b = false;
    println("a && b = " + (a&&b) );
    println("a || b = " + (a||b) );
    println("!(a && b) = " + !(a && b) );
  }
}
/**
  * 赋值运算符
  */
object  Test3{
  def main(args: Array[String]){

    var a = 10;
    var b = 20;
    var c = 0;
    c = a + b;
    println("c = a + b  = " + c );

    c += a ;
    println("c += a  = " + c );

    c -= a ;
    println("c -= a = " + c );

    c *= a ;
    println("c *= a = " + c );

    a = 10;
    c = 15;
    c /= a ;
    println("c /= a  = " + c );

    a = 10;
    c = 15;
    c %= a ;
    println("c %= a  = " + c );
    c <<= 2 ;
    println("c <<= 2  = " + c );

    c >>= 2 ;
    println("c >>= 2  = " + c );

    c >>= 2 ;
    println("c >>= a  = " + c );

    c &= a ;
    println("c &= 2  = " + c );

    c ^= a ;
    println("c ^= a  = " + c );

    c |= a ;
    println("c |= a  = " + c );
  }
}

/**
  * if else
  */
object Test4{
  def main(args: Array[String]){

      var x =30;
      if(x<10){
          println("x < 10")
      }else{
          println("x大于 10")
      }
  }
}

/**
  * 循环
  */
object  Test5{

  def main(args: Array[String]){

     // var a =10;
     /* while (a<20){
        println("Value of a: " + a)
        a+=1;
      }*/
     /* do {
        println("Value of a: " + a)
        a+=1
      }while(a<20)*/

  /*  var a1 = 0;
    // for 循环
    for( a1 <- 1 until 10){//to
      println( "Value of a1: " + a1 );
    }*/

 /*   var a = 0;
    var b = 0;
    // for 循环
    for( a <- 1 to 3; b <- 1 to 3){
      println( "Value of a: " + a );
      println( "Value of b: " + b );
    }*/

    var a :Int = 0;
   /* val numList = List(1,2,3,4,5);
    for( a <- numList ){
      println( "Value of a: " + a );
    }*/

 /*   val numList = List(1,2,3,4,5,6,7,8,9,10);
    var retval =for{ a <- numList  if a != 3 ; if a < 5 }yield a
    println("retval size:"+retval.size)
    for(a <- retval){
        println("retval a:"+a)
    }*/

    val strList = List("a","b","c","d");
    for(a <- strList){
      println("a:"+a)
    }

  }

}