algoritmo "somador"
// Fun��o :
// Autor :
// Data : 10/01/2020
// Se��o de Declara��es 
var
//    cont, n, somador: real
 n, s, cont: inteiro
 resp: caractere
inicio
//      n <- 5
//      Enquanto (cont <= 5) faca
//       EscrevaL(" ", cont,"� n�mero: ", cont)
//        somador <- somador + cont
//        cont <- cont +1
//
//      FimEnquanto
//      EscrevaL()
//      EscrevaL(" A soma total dos n�meros �: ", somador)
//      EscrevaL()
        resp <- "s"
        n <- 0
        
        Enquanto (resp = "s") faca
          cont <- cont+1
          
          Escreva("Digite o ", cont,"� n�mero: ")
          leia(n)
          Escreva("Quer continuar: [s/n] ")
          leia(resp)
          
          s <- s + n
        FimEnquanto
        
        Escreval()
        Escreval(" Som total: ", s)
        Escreval()
fimalgoritmo
