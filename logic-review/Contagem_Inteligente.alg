algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 08/01/2020
// Se��o de Declara��es 
var
   init, fim: inteiro
inicio
      Escreval("CONTAGEM INTELIGENTE")
      Escreval("--------------------")

      Escreva("Inicio: ")
      leia(init)
      
      Escreva("Fim: ")
      leia(fim)
      
      Escreval("-------------------")
      Escreval("  C O N T A N D O  ")
      Escreval("-------------------")
      se(init < fim) entao
         Escreva(init,".. ")
        Enquanto (init < fim) faca
         init <- init + 1
         Escreva(init,".. ")
        FimEnquanto
      senao
        se(init > fim)entao
           Escreva(init,".. ")
          Enquanto (init > fim) faca
           init <- init - 1
           Escreva(init,".. ")
          FimEnquanto
        FimSe
      FimSe
fimalgoritmo
