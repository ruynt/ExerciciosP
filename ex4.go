package main

import (
	"fmt"
)

type Animal interface {
	Som() string
}

type Cachorro struct{}

func (c Cachorro) Som() string {
	return "Au Au"
}

type Gato struct{}

func (g Gato) Som() string {
	return "Miau"
}

func ExibirSom(animal Animal) {
	fmt.Printf("O animal faz: %s\n", animal.Som())
}

func main() {
	var animal1 Animal = Cachorro{}
	var animal2 Animal = Gato{}

	ExibirSom(animal1)
	ExibirSom(animal2)
}
