algoritmo "n° fibonacci"
// Função :
// Autor :
// Data : 10/01/2020
// algoritmo de fibonacci
var
   n1, n2, n3, x: inteiro
inicio
   EscrevaL("###########################################################################")
   EscrevaL("###                                                                     ###")
   EscrevaL("###                              Seguência                              ###")
   EscrevaL("###                                 de                                  ###")
   EscrevaL("###                          F I B O N A C C I                          ###")
   EscrevaL("###                                                                     ###")
   EscrevaL("###                                                                     ###")
   
   n1 <- 0
   n2 <- 1
   n3 <- 1

   escreva("### >>")
   enquanto (x <= 15) faca
     Escreva(" ", n1)
     
     n3 <- n1 + n2
     n1 <- n2
     n2 <- n3
     
     x <- x +1
   FimEnquanto
   escrevaL("  << ###")
   EscrevaL("###                                                                     ###")
   EscrevaL("###                                                                     ###")
   EscrevaL("###                                                                     ###")
   EscrevaL("###########################################################################")
   escreval()

fimalgoritmo
