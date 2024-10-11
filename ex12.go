package main

import "fmt"

type Produto struct {
	nome  string
	preco float64
}

func (p Produto) adicionar(outro Produto) Produto {
	return Produto{
		nome:  p.nome + " + " + outro.nome,
		preco: p.preco + outro.preco,
	}
}

func main() {
	produto1 := Produto{nome: "Produto A", preco: 10.50}
	produto2 := Produto{nome: "Produto B", preco: 15.75}

	produtoSoma := produto1.adicionar(produto2)

	fmt.Printf("Produto Resultante: %s, Preço: %.2f\n", produtoSoma.nome, produtoSoma.preco)
}
