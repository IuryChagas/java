algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 10/01/2020
// Se��o de Declara��es 
var
   cont, s, n, tab: real
inicio

      Escreval("::====================================::")
      Escreval("::         GERADOR DE TABUADA         ::")
      Escreval("::====================================::")
      Escreval()
      
      Escreva("Tabuada de Qual numero voc� precisa: ")
      leia(tab)
      
      Escreval()
      
      repita
        n <- n + 1
        cont <- n * tab
        EscrevaL(tab," x ",n," = ", cont )
      ate (n >= 10)
fimalgoritmo
