algoritmo "semnome"
// Função :
// Autor :
// Data : 10/01/2020
// Seção de Declarações 
var
   cont, s, n, tab: real
inicio

      Escreval("::====================================::")
      Escreval("::         GERADOR DE TABUADA         ::")
      Escreval("::====================================::")
      Escreval()
      
      Escreva("Tabuada de Qual numero você precisa: ")
      leia(tab)
      
      Escreval()
      
      repita
        n <- n + 1
        cont <- n * tab
        EscrevaL(tab," x ",n," = ", cont )
      ate (n >= 10)
fimalgoritmo
