package main

import (
	"fmt"
)

type Carro struct {
	Marca     string
	Modelo    string
	Ano       int
	Velocidade int
}

func (c *Carro) Acelerar(quantidade int) {
	c.Velocidade += quantidade
}

func (c *Carro) Frear(quantidade int) {
	c.Velocidade -= quantidade
	if c.Velocidade < 0 {
		c.Velocidade = 0
	}
}

func (c Carro) ExibirDetalhes() {
	fmt.Printf("Marca: %s, Modelo: %s, Ano: %d, Velocidade: %d km/h\n", c.Marca, c.Modelo, c.Ano, c.Velocidade)
}

func main() {
	carro1 := Carro{Marca: "Toyota", Modelo: "Corolla", Ano: 2020}
	carro2 := Carro{Marca: "Honda", Modelo: "Civic", Ano: 2021}
	carro3 := Carro{Marca: "Ford", Modelo: "Focus", Ano: 2019}

	carro1.Acelerar(50)
	carro1.ExibirDetalhes()
	carro1.Frear(20)
	carro1.ExibirDetalhes()

	carro2.Acelerar(60)
	carro2.ExibirDetalhes()
	carro2.Frear(30)
	carro2.ExibirDetalhes()

	carro3.Acelerar(80)
	carro3.ExibirDetalhes()
	carro3.Frear(100)
	carro3.ExibirDetalhes()
}
