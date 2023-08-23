package main

import (
	"bufio"
	"fmt"
	"os"
	"pacotes/contatos"
	"pacotes/array"	
)

func main() {
	var contatos [5]Contato
	var nome, email, opcao string

	leitor := bufio.NewReader(os.Stdin)

	fmt.Println("Lista de contatos!")
	for {
		fmt.Print("Digite (1) para adicionar, (2) para remover ou qualquer outra coisa para sair: ")
		fmt.Scanln(&opcao)

		switch opcao {
		case "1":
			fmt.Print("Informe o seu nome: ")
			nome, _ = leitor.ReadString('\n')

			fmt.Print("Informe o seu email: ")
			fmt.Scanln(&email)

			contatos = adicionaContato(Contato{Nome: nome, Email: email}, contatos)
		case "2":
			contatos = excluiContato(contatos)
		default:
			return
		}

		fmt.Println(contatos)
	}

}
