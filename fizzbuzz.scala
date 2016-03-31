import scala.io.Source

//https://www.codeeval.com/open_challenges/1/

object easy1 {
//function definition
	//def main allows for arguments to be called from command line
	def main(args:Array[String]) = {
		def fizzbuzz(x:Int, y:Int, z:Int) = {
			for (a <- 1 to z) {
				if (a % x == 0 && a % y == 0) {
					print("FB ")
				} else if (a % x == 0) {
					print("F ")
				} else if (a % y == 0) {
					print("B ")
				} else {print(a + " ")
				}
			}
		}                                         
//inputting arguments
//reads in file as args(0)
	//test in "/home/mcapizzi/Google_Drive_Arizona/Programming/Codeeval/easy1/easy_1.txt").getLines.toArray
//take each line in, splits into an array of arguments for fizzbuzz
		for(line <- Source.fromFile(args(0))getLines()) {
			val arguments = line.split("\\s")
			val arg1 = arguments(0).toInt
			val arg2 = arguments(1).toInt
			val arg3 = arguments(2).toInt
			fizzbuzz(arg1, arg2, arg3);print("\n")
		}                                          
  	}
}                                              
