algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 12/01/2020
// Se��o de Declara��es 
var
   UserA, UserB: real
Procedimento somador(a, b: real)
inicio
EscrevaL()
   Escreval("Recebi o valor: ", a)
   Escreval("Recebi o valor: ", b)
EscrevaL()
   Escreval("A Soma total �: ", a+b)
FimProcedimento
inicio
      Escreva("Digite o 1� valor � somar: ")
      leia(UserA)
      
      Escreva("Digite o 2� valor � somar: ")
      leia(UserB)

      somador(UserA, UserB)

fimalgoritmo
