package main

import "fmt"

type Funcionario interface {
	calcularSalario() float64
}

type FuncionarioHorista struct {
	horasTrabalhadas float64
	valorPorHora     float64
}

func (f FuncionarioHorista) calcularSalario() float64 {
	return f.horasTrabalhadas * f.valorPorHora
}

type FuncionarioAssalariado struct {
	salarioMensal float64
}

func (f FuncionarioAssalariado) calcularSalario() float64 {
	return f.salarioMensal
}

func main() {
	horista := FuncionarioHorista{horasTrabalhadas: 40, valorPorHora: 15}
	assalariado := FuncionarioAssalariado{salarioMensal: 3000}

	fmt.Printf("Salário Horista: %.2f\n", hori
