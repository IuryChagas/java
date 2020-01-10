algoritmo "semnome"
// Função :
// Autor :
// Data : 10/01/2020
// Se o contatdor de Divisivel for = 2 é primo
var
   c, n, contDiv: inteiro
inicio
      Escreval("::====================================::")
      Escreval("::      CONTADOR DE N° PRIMOS         ::")
      Escreval("::====================================::")
      Escreval()
      
      Escreva(" Digite o número: ")
      leia(n)
      
      c <- 1
      contDiv <- 0
      repita
         Escreva(c, "")
         Se (n % c = 0) entao
            contDiv <- contDiv +1
         FimSe
         c <- c + 1
      ate(c > n)
      Escreval()
      Escreval(" Ao todo existem: ", contDiv, " valores divisiveis")
      
      Se (contDiv > 2) entao
         Escreval(" Portanto o numero: ", n, " NÃO é PRIMO")
      senao
         Escreval(" Portanto o numero: ", n, " É PRIMO")
      FimSe
      
fimalgoritmo
