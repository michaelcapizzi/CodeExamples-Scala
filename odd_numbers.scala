//https://www.codeeval.com/open_challenges/25/

object Main {
//easy 25 print odd numbers from 1 to 99
//function definition
	//def main allows for arguments to be called from command line
	def main(args:Array[String]) = {
		val list = 1 to 99 by 1
		val oddList = for {l <- list
			if l % 2 != 0} yield println(l)
	}		
}                                     
