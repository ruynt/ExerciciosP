package main

import (
	"fmt"
)

type Professor struct {
	Nome string
}

type Escola struct {
	Nome      string
	Professores []*Professor
}

func (e *Escola) AdicionarProfessor(p *Professor) {
	e.Professores = append(e.Professores, p)
}

func (e Escola) ExibirProfessores() {
	fmt.Printf("Professores da escola %s:\n", e.Nome)
	for _, professor := range e.Professores {
		fmt.Printf("- %s\n", professor.Nome)
	}
}

func main() {
	escola1 := Escola{Nome: "Escola A"}
	escola2 := Escola{Nome: "Escola B"}

	professor1 := &Professor{Nome: "Carlos"}
	professor2 := &Professor{Nome: "Maria"}
	professor3 := &Professor{Nome: "João"}

	escola1.AdicionarProfessor(professor1)
	escola1.AdicionarProfessor(professor2)
	escola2.AdicionarProfessor(professor2)
	escola2.AdicionarProfessor(professor3)

	escola1.ExibirProfessores()
	escola2.ExibirProfessores()
}
