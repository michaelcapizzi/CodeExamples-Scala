//https://www.codeeval.com/open_challenges/3/

object Main {
def main(args: Array[String]) {
	val test_list = List.range(2,1001).reverse

	def palprime(list: List[Int], counter: Int): Int = {
		if (counter == 100 && palindrome(convert(list.head), 1, 0) == true) list.head
		else if (list.head != counter && list.head % counter != 0) palprime(list, counter + 1)
		else palprime(list.tail, 2)
	}                                        

		def convert(item: Int): Array[Char] = {
			item.toString.toArray
		}                                
	
//palindrome works
	def palindrome(array: Array[Char], counter: Int, n:Int): Boolean = {
		val array_reverse = array.reverse
		if (counter== array.length && array(n) == array_reverse(n)) true
		else if (array(n) == array_reverse(n)) palindrome(array, counter + 1, n+1)
		else {false}
	}                                         
  println(palprime(test_list, 1))                        
}
}
