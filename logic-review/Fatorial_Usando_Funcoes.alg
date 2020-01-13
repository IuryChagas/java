algoritmo "Fatorial como Funcao"
// Função :
// Autor :
// Data : 13/01/2020
// Seção de Declarações 
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
   Escreva("Digite um valor para Fatoração: ")
   leia(n)
   
   res <- fatorial(n)

   escreval()
     Escreval("O fatorial de ", n, "! é: ", res)
   escreval()
fimalgoritmo
