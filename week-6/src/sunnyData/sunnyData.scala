package sunnyData
import atomicscala.src.com.atomicscala.AtomicTest._

/**
  * Created by sush on 31/03/2016.
  */
object MyForecastTest extends App {
  forecast(100) is "Sunny"
  forecast(80) is "Mostly Sunny"
  forecast(50) is "Partly Sunny"
  forecast(20) is "Mostly Cloudy"
  forecast(0) is "Cloudy"
  forecast(15) is "Unknown"
  def forecast(temp: Int): String ={
    temp match {
      case 100 => "Sunny"
      case 80 => "Mostly Sunny"
      case 50 => "Partly Sunny"
      case 20 => "Mostly Cloudy"
      case 0 => "Cloudy"
      case 15 => "Unknown"
    }
  }


def forecastLoop(data:Vector[Int]):Unit = {
  println("*********************Sunny Data***********************")
  for(s <-data)
  if (s>20){

    println("forecast(" + s + ") is " + forecast(s))
  }

}
  val allData = forecastLoop(Vector(100, 80, 50, 20, 0, 15))



}