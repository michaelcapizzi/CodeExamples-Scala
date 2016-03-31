//https://www.codeeval.com/open_challenges/62/

object Main {

import scala.io.Source
//find unique elements in list
	//def main allows for arguments to be called from command line
	def main(args:Array[String]) = {
			def modulo(n:Int, m:Int): Int = {
				val result = n/m
				n - (result*m)
			}
	//test line
	//	for(line <- Source.fromFile("/home/mcapizzi/Google_Drive_Arizona/Programming/Codeeval/mod62/mod62.txt").getLines()){
    	for(line <- Source.fromFile(args(0)).getLines()){
			val arguments = line.split(",")
			val arg1 = arguments(0)
			var arg2 = arguments(1)
			println(modulo(arg1.toInt,arg2.toInt))      
		}                     
  	}
 }					
              
