package main

import (
	"fmt"
)

type Empregado struct {
	Nome  string
	Cargo string
	Salario float64
}

type Empresa struct {
	Nome      string
	Empregados []*Empregado
}

func (e *Empresa) AdicionarEmpregado(emp *Empregado) {
	e.Empregados = append(e.Empregados, emp)
}

func (e Empresa) ExibirEmpregados() {
	fmt.Printf("Empregados da empresa %s:\n", e.Nome)
	for _, empregado := range e.Empregados {
		fmt.Printf("- Nome: %s, Cargo: %s, Salário: R$ %.2f\n", empregado.Nome, empregado.Cargo, empregado.Salario)
	}
}

func main() {
	empresa := Empresa{Nome: "Tech Solutions"}

	empregado1 := &Empregado{Nome: "Alice", Cargo: "Desenvolvedora", Salario: 8000.00}
	empregado2 := &Empregado{Nome: "Bob", Cargo: "Gerente de Projetos", Salario: 12000.00}
	empregado3 := &Empregado{Nome: "Carlos", Cargo: "Analista de Sistemas", Salario: 7000.00}

	empresa.AdicionarEmpregado(empregado1)
	empresa.AdicionarEmpregado(empregado2)
	empresa.AdicionarEmpregado(empregado3)

	empresa.ExibirEmpregados()
}
