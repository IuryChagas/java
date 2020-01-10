algoritmo "semnome"
// Função :
// Autor :
// Data : 10/01/2020
// Fatorial de números
var
    n, f, c: inteiro
inicio
      Escreval("::====================================::")
      Escreval("::      FATORAÇÃO DE NUMEROS          ::")
      Escreval("::====================================::")
      Escreval()

      Escreva(" Digite n° para fatorar: ")
      leia(n)
      
      c <- n
      f <- 1

      repita

        f <- f * c
        c <- c - 1
      ate(c < 1)
      
      Escreval()
      Escreval(" Fatorial de ", n, " é igual à: ", f)
fimalgoritmo
