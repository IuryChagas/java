algoritmo "Fatorial como Funcao"
// Fun��o :
// Autor :
// Data : 13/01/2020
// Se��o de Declara��es 
var
   n, res : inteiro

funcao fatorial(x : inteiro) : inteiro
  var
    c, r : inteiro

  inicio
    r <- 1
    para c <- 1 ate x faca
         r <- (r * c)
    fimPara
    
    retorne r
fimfuncao
inicio
   Escreva("Digite um valor para Fatora��o: ")
   leia(n)
   
   res <- fatorial(n)

   escreval()
     Escreval("O fatorial de ", n, "! �: ", res)
   escreval()
fimalgoritmo
