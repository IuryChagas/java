algoritmo "semnome"
// Função :
// Autor :
// Data : 08/01/2020
// Seção de Declarações 
var
    cont, n, s, m: inteiro
inicio
      cont <- 1
      s <- 0

      Enquanto (cont <= 5) faca
        Escreva("Digite o ", cont, "° valor: ")
        leia(n)
        
        se(n > m) entao
          m <- n
        FimSe
        s <- s + n
        cont <- cont + 1
      FimEnquanto
      Escreval()
      Escreval("A soma dos valores é: ", s)
      Escreval("E o mario número foi: ", m)
fimalgoritmo
