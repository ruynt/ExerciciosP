package main

import (
	"fmt"
)

type SaldoInsuficienteException struct {
	mensagem string
}

func (e *SaldoInsuficienteException) Error() string {
	return e.mensagem
}

type ContaBancaria struct {
	saldo float64
}

func (c *ContaBancaria) Sacar(valor float64) error {
	if valor > c.saldo {
		return &SaldoInsuficienteException{mensagem: "Saldo insuficiente para o saque"}
	}
	c.saldo -= valor
	return nil
}

func (c *ContaBancaria) Depositar(valor float64) {
	c.saldo += valor
}

func main() {
	conta := ContaBancaria{saldo: 100.0}

	err := conta.Sacar(150.0)
	if err != nil {
		fmt.Println("Erro:", err)
	} else {
		fmt.Println("Saque realizado com sucesso!")
	}

	conta.Depositar(50.0)
	fmt.Println("Saldo atual:", conta.saldo)

	err = conta.Sacar(100.0)
	if err != nil {
		fmt.Println("Erro:", err)
	} else {
		fmt.Println("Saque realizado com sucesso!")
	}
}
