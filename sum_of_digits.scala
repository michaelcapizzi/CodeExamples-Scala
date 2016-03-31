//https://www.codeeval.com/open_challenges/21/

object Main {

import scala.io.Source

//object easy1 {
//function definition
	//def main allows for arguments to be called from command line
	def main(args:Array[String]) = {
	//test line
	//	for(line <- Source.fromFile("/home/mcapizzi/Google_Drive_Arizona/Programming/Codeeval/easy21/easy21.txt").getLines().toArray){
    	for(line <- Source.fromFile(args(0)).getLines().toArray){
    		println(line.toString.map(_.asDigit).sum)
     	}                     
  	}
//}    
}              
