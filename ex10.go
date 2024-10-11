package main

import (
	"fmt"
)

type Calculadora struct{}

func (c Calculadora) SomarDoisNumeros(a float64, b float64) float64 {
	return a + b
}

func (c Calculadora) SomarTresNumeros(a float64, b float64, c float64) float64 {
	return a + b + c
}

func main() {
	calculadora := Calculadora{}

	resultado1 := calculadora.SomarDoisNumeros(5, 10)
	fmt.Printf("Soma de dois números: %.2f\n", resultado1)

	resultado2 := calculadora.SomarTresNumeros(5, 10, 15)
	fmt.Printf("Soma de três números: %.2f\n", resultado2)
}
