algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 10/01/2020
// Se��o de Declara��es 
var
   n, s: real
   cont: inteiro
   resp: caractere
inicio
   resp <- "s"
   
      repita
         cont <- cont +1
         escreva("Digite o ", cont,"� n�mero: ")
         leia(n)

         Escreva("Continuar [s/n]: ")
         leia(resp)
         
         s <- s + n
      ate (resp = "n")
      
      Escreval()
      EscrevaL("    ### Soma total: ", s, " ###")
fimalgoritmo
