algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 08/01/2020
// Se��o de Declara��es 
var
      option: inteiro
      outrosValores: real
inicio

Escreval("---------------------------")
Escreval("     CRIAN�A ESPERAN�A     ")
Escreval("---------------------------")
Escreval(" Muito obrigado por ajudar ")
Escreval(" [1] para doar R$10,00 ")
Escreval(" [2] para doar R$25,00 ")
Escreval(" [3] para doar R$50,00 ")
Escreval(" [4] para doar outros valores ")
Escreval(" [5] para cancelar ")
leia(option)

            Escolha (option)
              caso 1
                   option <- 10
              caso 2
                   option <- 25
              caso 3
                   option <- 50
              caso 4
                   Escreva("Qual valor da doa��o? R$")
                   leia(option)
              caso 5
                   option <- 0
              
            FimEscolha
            Escreval("---------------------------")
            Se(option <> 0) entao
               Escreval(" Doa��o realizada com sucesso: Valor R$",option)
            senao
               Escreval(" Fim da Execu��o! ")
            Fimse
            Escreval(" Muito Obrigado! ")
            Escreval("---------------------------")

fimalgoritmo
