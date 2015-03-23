//https://www.codeeval.com/open_challenges/8/

object Main {

import scala.io.Source

object easy8 {
//easy8 reverse words
	def main(args: Array[String]) {
		def reverse(sentence:String): String = {
			val array = sentence.split("\\s")
			val reverse_array = array.reverse
			val new_sentence = reverse_array.mkString(" ")
			new_sentence
		} 
//inputting arguments
//reads in file as args(0)
	for(line <- Source.fromFile(args(0))getLines()) {
	//for(line <- Source.fromFile("/home/mcapizzi/Google_Drive_Arizona/Programming/Codeeval/easy8/easy8.txt")getLines()) {
			if (line.isEmpty) print("")
			else println(reverse(line))
    }                               
  }
}
}
