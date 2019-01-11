package com.chinalife.spark

/**
  * Created by Administrator on 2019/1/3.
  */
object Str {

  def main(args: Array[String]): Unit = {
    //test1();
    arr();
  }

  def test1(){
    val green = "Hello,World!";
    val buf = new StringBuilder;
    buf +='a';
    buf ++="bcde"
    println("buf is : " + buf.length())
    println(green)
  }

  def arr(): Unit ={
    var z = new Array[String](3)
    var x = Array("Runoob","Baidu","Google");
    z(0)="oracle";z(1)="mysql";z(2)="mongodb";

    for(x <- z){
      println("z:"+x)
    }
    var total = 0.0;
    var myArray = Array(1.2,1.3,1.4,1.9,2.1);
//    for(x <- myArray){
//       total+=x;
//    }
    for(i <- 0 to (myArray.length-1)){
      total +=myArray(i)
    }
    println("总和为 " + total);

  }

}
