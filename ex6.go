package main

import (
	"fmt"
)

type Motor struct {
	Modelo   string
	Potencia int
}

type Carro struct {
	Marca string
	Modelo string
	Ano int
	Motor Motor
}

func (c Carro) ExibirDetalhes() {
	fmt.Printf("Marca: %s, Modelo: %s, Ano: %d, Motor: %s, Potência: %d HP\n",
		c.Marca, c.Modelo, c.Ano, c.Motor.Modelo, c.Motor.Potencia)
}

func main() {
	motor1 := Motor{Modelo: "V8", Potencia: 400}
	carro1 := Carro{Marca: "Ford", Modelo: "Mustang", Ano: 2021, Motor: motor1}

	motor2 := Motor{Modelo: "V6", Potencia: 300}
	carro2 := Carro{Marca: "Chevrolet", Modelo: "Camaro", Ano: 2022, Motor: motor2}

	carro1.ExibirDetalhes()
	carro2.ExibirDetalhes()
}
