algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 08/01/2020
// Se��o de Declara��es 
var
    cont, n, s, m: inteiro
inicio
      cont <- 1
      s <- 0

      Enquanto (cont <= 5) faca
        Escreva("Digite o ", cont, "� valor: ")
        leia(n)
        
        se(n > m) entao
          m <- n
        FimSe
        s <- s + n
        cont <- cont + 1
      FimEnquanto
      Escreval()
      Escreval("A soma dos valores �: ", s)
      Escreval("E o mario n�mero foi: ", m)
fimalgoritmo
