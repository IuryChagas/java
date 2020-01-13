algoritmo "semnome"
// Função :
// Autor :
// Data : 12/01/2020
// Seção de Declarações 
var
   UserA, UserB: real
Procedimento somador(a, b: real)
inicio
EscrevaL()
   Escreval("Recebi o valor: ", a)
   Escreval("Recebi o valor: ", b)
EscrevaL()
   Escreval("A Soma total é: ", a+b)
FimProcedimento
inicio
      Escreva("Digite o 1° valor à somar: ")
      leia(UserA)
      
      Escreva("Digite o 2° valor à somar: ")
      leia(UserB)

      somador(UserA, UserB)

fimalgoritmo
