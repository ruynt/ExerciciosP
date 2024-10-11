package main

import (
	"fmt"
)

type Matematica struct{}

func (m Matematica) calcularFatorial(n int) int {
	if n == 0 {
		return 1
	}
	return n * m.calcularFatorial(n-1)
}

func Fatorial(n int) int {
	if n == 0 {
		return 1
	}
	resultado := 1
	for i := 1; i <= n; i++ {
		resultado *= i
	}
	return resultado
}

func main() {
	matematica := Matematica{}
	numero := 5

	fatorialRecursivo := matematica.calcularFatorial(numero)
	fatorialIterativo := Fatorial(numero)

	fmt.Printf("Fatorial (Recursivo) de %d: %d\n", numero, fatorialRecursivo)
	fmt.Printf("Fatorial (Iterativo) de %d: %d\n", numero, fatorialIterativo)
}
