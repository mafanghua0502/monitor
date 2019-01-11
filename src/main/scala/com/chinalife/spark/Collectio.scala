package com.chinalife.spark

/**
  * Created by Administrator on 2019/1/3.
  */
object Collectio {

  def main(args: Array[String]): Unit = {
    //list();
    //set();
    map();
  }
   def list(): Unit ={
     val site :List[String] = List("Runoob","Google","Baidu");
     val nums :List[Int] = List(1,2,3,4);
     println("nums is max:"+nums.max)
     println("nums is min:"+nums.min)
     val empty:List[Nothing] = List()
     val empty1=Nil
     //    println( "第一网站是 : " + site.head )
     //    println( "最后一个网站是 : " + site.tail )
     //    println( "查看列表 site 是否为空 : " + site.isEmpty )
     //    println( "查看 nums 是否为空 : " + empty1.isEmpty )
     val site1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
     val site2 = "Facebook" :: ("Taobao" :: Nil)
     // 使用 ::: 运算符
     var fruit = site1 ::: site2
     println( "site1 ::: site2 : " + fruit )
     // 使用 List.:::() 方法
     fruit = site1.:::(site2)
     println( "site1.:::(site2) : " + fruit )

     // 使用 concat 方法
     fruit = List.concat(site1, site2)
     println( "List.concat(site1, site2) : " + fruit  )
   }

    def set(): Unit ={
      val num = Set(5,6,9,20,30,45)
      // 查找集合中最大与最小元素
      println( "Set(5,6,9,20,30,45) 集合中的最小元素是 : " + num.min )
      println( "Set(5,6,9,20,30,45) 集合中的最大元素是 : " + num.max )
      val site = Set("Runoob", "Google", "Baidu")
      val nums = Set()
      println( "第一网站是 : " + site.head )
      println( "最后一个网站是 : " + site.tail )
      println( "查看列表 site 是否为空 : " + site.isEmpty )
      println( "查看 nums 是否为空 : " + nums.isEmpty )
    }
    def map(): Unit ={
//        val colors = Map("redis" -> "红","azure" -> "蓝")
//        val map = Map()
//      println( "colors 中的键为 : " + colors.keys )
//      println( "colors 中的值为 : " + colors.values )
//      println( "检测 colors 是否为空 : " + colors.isEmpty )
//      println( "检测 map 是否为空 : " + map.isEmpty )

      /**
        * map合并
        */
      val colors1 = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F");

      val colors2 = Map("blue" -> "#0033FF",
        "yellow" -> "#FFFF00",
        "red" -> "#FF0000");
      var colors  = colors1 ++ colors2;
     // println( "colors1 ++ colors2 : " + colors )

      colors = colors1.++(colors2);
     // println( "colors1 ++ colors2 : " + colors )

      colors.keys.foreach{i =>
        print("key= "+ i +"  ")
        println("value = "+ colors(i))
      }
      if(colors.contains("red1")){
          println("red键存在 对应的值为="+colors("red"))
      }else{
        println("red键不存在")
      }


    }
}
