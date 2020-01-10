algoritmo "semnome"
// Função :
// Autor :
// Data : 10/01/2020
// Seção de Declarações 
var
   n, s: real
   cont: inteiro
   resp: caractere
inicio
   resp <- "s"
   
      repita
         cont <- cont +1
         escreva("Digite o ", cont,"° número: ")
         leia(n)

         Escreva("Continuar [s/n]: ")
         leia(resp)
         
         s <- s + n
      ate (resp = "n")
      
      Escreval()
      EscrevaL("    ### Soma total: ", s, " ###")
fimalgoritmo
