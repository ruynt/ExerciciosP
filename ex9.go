package main

import (
	"fmt"
)

type Imprimivel interface {
	Imprimir()
}

type Relatorio struct {
	Titulo   string
	Conteudo string
}

func (r Relatorio) Imprimir() {
	fmt.Printf("Relatório: %s\nConteúdo: %s\n", r.Titulo, r.Conteudo)
}

type Contrato struct {
	Titulo string
	Valor  float64
}

func (c Contrato) Imprimir() {
	fmt.Printf("Contrato: %s\nValor: R$ %.2f\n", c.Titulo, c.Valor)
}

func ExibirImprimivel(i Imprimivel) {
	i.Imprimir()
}

func main() {
	relatorio := Relatorio{Titulo: "Relatório Anual", Conteudo: "Este é o conteúdo do relatório."}
	contrato := Contrato{Titulo: "Contrato de Prestação de Serviços", Valor: 5000.00}

	ExibirImprimivel(relatorio)
	ExibirImprimivel(contrato)
}
