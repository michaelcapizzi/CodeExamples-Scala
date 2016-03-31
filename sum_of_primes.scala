//https://www.codeeval.com/open_challenges/4/

object Main {
//easy 4 = sum of primes
	def main(args: Array[String]) {
		def sumprimes(n: Int, acc:Int, multiple:Int, prime_count: Int): Int = {
			if (prime_count == 1000) acc
			else if (multiple == n) sumprimes(n + 1, acc + n, 2, prime_count + 1)
			else if (n % multiple != 0) sumprimes(n, acc, multiple + 1, prime_count)
			else sumprimes(n + 1, acc, 2, prime_count)
		}                                 //> sumprimes: (n: Int, acc: Int, multiple: Int, prime_count: Int)Int
		sumprimes(2, 0, 2, 0)             //> res0: Int = 3682913
}
