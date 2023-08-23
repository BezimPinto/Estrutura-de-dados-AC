package array

import (
	"fmt"
	"pacotes/contatos"
)

func adicionaContato(c *Contato, a []Contato) []Contato {
	for ind, contato := range a {
		if contato == (Contato{}) {
			a[ind] = *c
			break
		}
	}

	return a
}

func excluiContato(a []Contato) []Contato {
	if a[0] == (Contato{}) {
		fmt.Println("Lista de contatos vazia!")
		return a
	}

	for ind, contato := range a {
		if contato == (Contato{}) {
			a[ind-1] = Contato{}
		}
	}

	return a
}