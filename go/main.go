package main

import (
	"fmt"
)

func main() {
	var n int
	fmt.Print("Enter a number: ")
	fmt.Scan(&n)

	prime := make([]bool, n+1)
	for i := 2; i <= n; i++ {
		prime[i] = true
	}

	for p := 2; p*p <= n; p++ {
		if prime[p] == true {
			for i := p * 2; i <= n; i += p {
				prime[i] = false
			}
		}
	}

	fmt.Println("Prime numbers in range 1 to", n, "are:")
	for p := 2; p <= n; p++ {
		if prime[p] == true {
			fmt.Print(p, " ")
		}
	}
	fmt.Println()
}
