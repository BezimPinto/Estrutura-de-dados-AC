package contatos

import "fmt"


type Contato struct {
	Nome  string
	Email string
}

func editaEmail(index int, newEmail string, a []Contato) []Contato {
	if index < 0 || index >= len(a) {
		fmt.Println("indice nao aceito")
		return a
	}

	a[index].Email = newEmail
	return a
}


