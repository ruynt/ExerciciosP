package main

import (
	"fmt"
)

type ContaBancaria struct {
	titular string
	saldo   float64
}

func (c *ContaBancaria) Depositar(valor float64) {
	if valor > 0 {
		c.saldo += valor
		fmt.Printf("Depósito de R$ %.2f realizado. Novo saldo: R$ %.2f\n", valor, c.saldo)
	} else {
		fmt.Println("Valor de depósito deve ser maior que zero.")
	}
}

func (c *ContaBancaria) Sacar(valor float64) {
	if valor > 0 && valor <= c.saldo {
		c.saldo -= valor
		fmt.Printf("Saque de R$ %.2f realizado. Saldo restante: R$ %.2f\n", valor, c.saldo)
	} else {
		fmt.Println("Saque não realizado. Verifique se o valor é positivo e não ultrapassa o saldo.")
	}
}

func (c ContaBancaria) ExibirSaldo() {
	fmt.Printf("Saldo da conta de %s: R$ %.2f\n", c.titular, c.saldo)
}

func main() {
	conta1 := ContaBancaria{titular: "João", saldo: 1000.0}
	conta1.ExibirSaldo()

	conta1.Depositar(500.0)
	conta1.Sacar(200.0)
	conta1.ExibirSaldo()

	conta1.Sacar(1500.0)
	conta1.Depositar(-100.0)
}
