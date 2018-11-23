object ScalaObjectDemo extends App {
  print("Hello world")
  def say(name:String){print(name)}
  def say3():Int={
    print("这里是scala方法")
    var tem = JavaDemo.javaSay("4")
    print(tem)
    tem
  }

  override def main(args: Array[String]): Unit = {
    say3()
  }
}
