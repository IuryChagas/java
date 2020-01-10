algoritmo "semnome"
// Função :
// Autor :
// Data : 10/01/2020
// Fatorial de números
var
    resp: caractere
    n, f, c: inteiro
inicio
      Escreval("::====================================::")
      Escreval("::      FATORAÇÃO DE NUMEROS  2.0     ::")
      Escreval("::====================================::")
      Escreval()

  Repita
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
      
      Escreva(" Deseja Fatorar outro número [s/n]: ? ")
      leia(resp)
      
      Escreval()
  ate(resp = "n")
 FimRepita
          LimpaTela

fimalgoritmo
