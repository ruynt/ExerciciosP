package main

import (
	"fmt"
	"sync"
)

type Configuracao struct {
	Parametro string
}

var instancia *Configuracao
var once sync.Once

func GetConfiguracao() *Configuracao {
	once.Do(func() {
		instancia = &Configuracao{}
	})
	return instancia
}

func main() {
	config1 := GetConfiguracao()
	config1.Parametro = "Valor 1"

	config2 := GetConfiguracao()
	fmt.Println("Parametro de config2:", config2.Parametro) // Deve imprimir "Valor 1"

	config2.Parametro = "Valor 2"
	fmt.Println("Parametro de config1:", config1.Parametro) // Deve imprimir "Valor 2"
}
