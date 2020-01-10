algoritmo "somador"
// Função :
// Autor :
// Data : 10/01/2020
// Seção de Declarações 
var
//    cont, n, somador: real
 n, s, cont: inteiro
 resp: caractere
inicio
//      n <- 5
//      Enquanto (cont <= 5) faca
//       EscrevaL(" ", cont,"° número: ", cont)
//        somador <- somador + cont
//        cont <- cont +1
//
//      FimEnquanto
//      EscrevaL()
//      EscrevaL(" A soma total dos números é: ", somador)
//      EscrevaL()
        resp <- "s"
        n <- 0
        
        Enquanto (resp = "s") faca
          cont <- cont+1
          
          Escreva("Digite o ", cont,"° número: ")
          leia(n)
          Escreva("Quer continuar: [s/n] ")
          leia(resp)
          
          s <- s + n
        FimEnquanto
        
        Escreval()
        Escreval(" Som total: ", s)
        Escreval()
fimalgoritmo
