object SelectionSort{
    /**
    *
    * @param input   - a sequence of unsorted integers
    * @return - sequence of sorted integers @array
    */

    def selectionSort(input:Array[Int]):Array[Int] = {
        if(input == null || input.length <2){
            return Array.empty[Int]
        } 

        for(i <- 0 until input.length){
            var min_index = i
            for(j <- i+1 until input.length){
                if(input(j) < input(min_index)){
                    min_index = j
                    
                }
            }
            
            var temp = input(i)
            input(i) = input(min_index)
            input(min_index) = temp
        }
        input
    }


    def main(args:Array[String]):Unit = {
      val arr = Array(28, 16, 32, 12, 60, 2, 5, 72)
      val result = selectionSort(arr)
      result.foreach(println)
    }
}