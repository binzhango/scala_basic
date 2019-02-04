
object InsertionSort {

  /**
    *
    * @param input   - a sequence of unsorted integers
    * @return - sequence of sorted integers @array
    */

  def insertionSort(input: Array[Int]) : Array[Int] = {
    if(input == null || input.length <2){
            return Array.empty[Int]
    } 

    for(i <- 0 to input.length-1) {
      val temp:Int=input(i)
      var j=i-1
      while(j>=0 && temp < input(j)){
        input(j+1)=input(j)
        j-=1
      }

      input(j+1)=temp
    }
    input
  }

  def main(args: Array[String]):Unit = {
      val arr = Array(28, 16, 32, 12, 60, 2, 5, 72)
      val result = insertionSort(arr)
      result.foreach(println)
  }

}