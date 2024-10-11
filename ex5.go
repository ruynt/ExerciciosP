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

func ExibirSons(animais []Animal) {
	for _, animal := range animais {
		fmt.Printf("O animal faz: %s\n", animal.Som())
	}
}

func main() {
	animais := []Animal{
		Cachorro{},
		Gato{},
		Cachorro{},
		Gato{},
	}

	ExibirSons(animais)
}
