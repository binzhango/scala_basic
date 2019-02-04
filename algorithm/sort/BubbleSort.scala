
object BubbleSort{
   /**
    *
    * @param input   - a sequence of unsorted integers
    * @return - sequence of sorted integers @array
    */  

    def bubbleSort(input:Array[Int]):Array[Int] = {
        if(input == null || input.length <2){
            return Array.empty[Int]
        }

        for(i <- 0 until input.length){
            for(j <- 0 until input.length - i-1){
                if(input(j) > input(j+1)){
                    var temp = input(j+1)
                    input(j+1) = input(j)
                    input(j) = temp
                }
            }
        }
        input
    } 

    def main(args:Array[String]):Unit={
      val arr = Array(28, 16, 32, 12, 60, 2, 5, 72)
      val result = bubbleSort(arr)
      result.foreach(println)
    }
}