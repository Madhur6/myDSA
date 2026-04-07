----------------------------------------⭐⭐ ✨ INDEX ✨ ⭐⭐----------------------------------------

💡 CHAPTER I   : Time & Space Complexity ✔

💡 CHAPTER II  : 

----------------------------------------⭐⭐ ✨ INDEX ✨ ⭐⭐----------------------------------------
				                      
									  << LET'S START LEARNING 😊 >>


----------------------------------------⭐⭐ CHAPTER I ⭐⭐----------------------------------------
#1 Time & Space Complexity ✔

👉 Time Complexity:
	- This analysis studies how an algorithm's runtime grows as input size approaches infinity, ignoring constants & focusing on the dominant growth rate (Big O, Big omega, Big Theta). 

	- Or, Measures how the execution time grows with input size (n)


👉 Space Complexity:
	- Measures how much memory an algorithm uses as input size increases.
	- Input Space & Auxiliary Space (extra space used by algo.)


_______________________________________________________________________________________

💡: ⭐ ORDER ⭐
		- 1 < logN < root-n(√n) < n < nLogn < n^2 < n^3 < ----------- < 2^n < 3^n < ----------- < n^n

_______________________________________________________________________________________


💡: ⭐ Big - OHHHHHHHHHHHHHHH ⭐

	✨ Big-OH: (upper-bound)
		- The function f(n) = O(g(n)), Iff there exist +ve constants (c & n0) such that f(n) <= C*g(n) for all n >= n0 [n-zero, A fixed starting point]

		- Ex.
			f(n) = 2n + 3
			2n + 3 <= 10 * n;   n >= 1 ........ (1) true:)
			f(n)	   C * g(n)

			[Instead of 10*n, We can write 7*n or 100*n, As long as it is greater then 2n+3]

			f(n) = O(n) ........ By (1)

			🔷 Simple approach,
				- Instead of coming up with value on R.H.S,

				- 2n + 3 <= 2n + 3*n
				- 2n + 3 <= 5*n,     So n >= 1 true:)
				    f(n)    c*g(n)
				
				[So on R.H.S make every term of left as multiple of n]


			🔷 Different Method,
				- Make everything square on R.H.S,
				- 2n+3 <= 2n^2 + 3n^2
				- 2n+3 <= 5n^2, n >= 1 true:)
				  f(n)    c*g(n)

			🔷 So O()/order of, f(n) = 2n+3, Would be Θ(n) [This is my avg/tight/exact bound(theta)]
				- Also, f(n) = O(n) / O(n^2) / O(2^n) are true
				- But, f(n) = O(logn) is not true, Because the logn is on the lower bound

				- When you write Big-OH, Try to write the closest function, But if you write any other higher fn, That is also true...

			🔷 If we look at the order:

				- 1 < logN < root-n(√n) < ⭐ n ⭐ < nLogn < n^2 < n^3 < ----------- < 2^n < 3^n < ----------- < n^n
				  Lower-bound          <--- [Θ] ---> Upper-bound
				  (including n)					     (including n)
	

_______________________________________________________________________________________


💡: ⭐ Big - Ω ⭐
	✨ Big-Omega: (lower-bound)
		- The function f(n) = Ω(g(n)), Iff there exist +ve constants (c & n0) such that f(n) >= C*g(n) for all n >= n0

		- Ex.
			f(n) = 2n+3
			2n + 3 >= 1*n;       for all n >= 1 [we only write 1*n, We can't write similar to upper-bound] true:)
			f(n)	  C * g(n)

			- 2n + 3 >= 1 * logN; for all n >= 1 true:) -> f(n) = Ω(logn)

			🔷 If we look at the order:

				- 1 < logN < root-n(√n) < ⭐ n ⭐ < nLogn < n^2 < n^3 < ----------- < 2^n < 3^n < ----------- < n^n
				  Lower-bound          <--- [Θ] ---> Upper-bound
				  (including n)					     (including n)

			🔷 So all the values, After the avg bound is out of our scope..
			🔷 Although the useful one is still f(n) = O(n) true:)

_______________________________________________________________________________________


💡: ⭐ Big - Θ ⭐
	✨ Big-Theta: (Average/Tight-bound)
		- The function f(n) = Θ(g(n)), Iff there exist +ve constants (c1, c2 & n0) such that [c1*g(n) <= f(n) <= c2*g(n)]

		- Ex.
			f(n) = 2n+3
			- 1 * n   <= 2*n + 3   <=   5*n
			  c1*g(n)       f(n)        c2*g(n)
	
			- f(n) = Θ(n) [Here i can't use ❌ f(n) = Θ(n^2), Only f(n) = Θ(n) is allowed]


			🔷 If we look at the order:

				- 1 < logN < root-n(√n) < ⭐ n ⭐ < nLogn < n^2 < n^3 < ----------- < 2^n < 3^n < ----------- < n^n
				  Lower-bound          <--- [Θ] ---> Upper-bound
				  (including n)					     (including n)


_______________________________________________________________________________________


💡: ⭐ Examples ⭐
	✨ 1. f(n) = 2n^2 + 3n + 4

		- ✨ Big-OH: (upper-bound):
			- 2n^2 + 3n + 4 <= 2n^2 + 3n^2 + 4n^2
			- 2n^2 + 3n + 4 <= 9 n^2;    n >= 1 true:)
			  		f(n)       C*g(n)
			- f(n) = O(n^2)

		- ✨ Big-Omega: (lower-bound):
			- 2n^2 + 3n + 4 >= 1 * n^2
			  		f(n)       C*g(n)
			- f(n) = Ω(n^2)

		- ✨ Big-Theta: (Average/Tight-bound):
			- 1*n^2 <= 2n^2 + 3n + 4 <= 9*n^2
			- c1*g(n)       f(n)        c2*g(n)
			- f(n) = Θ(n^2)



	✨ 2. f(n) = n^2logn + n

		🔷 If we look at the order:
			- 1 < logN < root-n(√n) < ⭐ n ⭐ < nLogn < n^2 < < ⭐ n^2logn ⭐ < n^3 < ----------- < 2^n < 3^n < ----------- < n^n

		- ✨ Big-OH: (upper-bound):
			- n^2logn + n <=  10 * n^2logn
			  		f(n)       C*g(n)
			- f(n) = O(n^2logn)

		- ✨ Big-Omega: (lower-bound):
			- n^2logn + n  >=  1 * n^2logn
			  		f(n)       C*g(n)
			- f(n) = Ω(n^2logn)

		- ✨ Big-Theta: (Average/Tight-bound):
			- 1*(n^2logn) <= (n^2logn) <= 10*(n^2logn)
			- c1*g(n)         f(n)        c2*g(n)
			- f(n) = Θ(n^2logn)


	
	✨ 3. f(n) = n!

		🔷 [n * (n-1)....3*2*1 ------------ Reverse of which is ------------ 1*2*3....n*(n-1)]

		🔷 If we look at the order:
			- 1 < logN < root-n(√n) < n < nLogn < n^2 < n^3 < ----------- < 2^n < 3^n < -----------< ⭐ n! ⭐ < n^n

		🔷 Lower-Bound	   |		Average-Bound	|		Upper-Bound

		1x1x1x1x1x....x1    |   1X2x3x4x....xn       |  nxnxnxn...xn
			1               <=      n!               <=      n^n
								  undefined

		🔷 
			- n! grows faster than any polynomial (n^k), all constant-base exponentials (2ⁿ, 3ⁿ)
		  	- n! grows slower than nⁿ


		🔷 We can't conclude, n^10 < n! < n^11, So we can't find "theta" for this function, So now upper-lower-bounds are useful.




	✨ 4. f(n) = logn!
		f(n) = logn!
			- log * (n * (n-1)....3*2*1) ------------ Reverse of which is ------------ 1*2*3....n*(n-1)

		🔷 If we look at the order:
			- 1 < logN < root-n(√n) < n < nLogn < n^2 < n^3 < ----------- < 2^n < 3^n < -----------< n! < n^n

		🔷 Lower-Bound		|		Average-Bound		|		Upper-Bound

		log*(1x1x1x1x1x....x1)    |   log*(1X2x3x4x....xn)    |  log*(nxnxnxn...xn)
			log1 ~ 0           <=          logn!            <=      logn^n ~ nlogn
	      [we will use Ω(1)]			 undefined				    O(nlogn)

		🔷 Again no tight-bound (Always provide the theta() bound)


_______________________________________________________________________________________



--------------------------------------⭐⭐ CHAPTER I ENDS ⭐⭐----------------------------------------


