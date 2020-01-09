algoritmo "semnome"
// Função :
// Autor :
// Data : 08/01/2020
// Seção de Declarações 
var
  nota, melhor: real
  cont, init: inteiro
  nome, nomeMelhor: caractere
inicio
      Escreval("---------------------------")
      Escreval(" Centro de Treinamento GFT ")
      Escreval("---------------------------")
      
      Escreva("Quanto estagiários: ")
      leia(cont)
      
      Escreval("---------------------------")
      
      enquanto (init < cont) faca
          init <- init + 1
          Escreval("ESTAGIÁRIOS [",init,"°]")
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
