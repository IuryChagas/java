algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 08/01/2020
// Se��o de Declara��es 
var
  nota, melhor: real
  cont, init: inteiro
  nome, nomeMelhor: caractere
inicio
      Escreval("---------------------------")
      Escreval(" Centro de Treinamento GFT ")
      Escreval("---------------------------")
      
      Escreva("Quanto estagi�rios: ")
      leia(cont)
      
      Escreval("---------------------------")
      
      enquanto (init < cont) faca
          init <- init + 1
          Escreval("ESTAGI�RIOS [",init,"�]")
          Escreva("Nome: ")
          leia(nome)

          Escreva("Nota: ")
          leia(nota)
          
          Se(nota > melhor) entao
            melhor <- nota
            nomeMelhor <- nome
          FimSe
      FimEnquanto

      Escreval()
      Escreval("Melhor aproveitamento foi: ", nomeMelhor, " com a nota: ",melhor)
fimalgoritmo
