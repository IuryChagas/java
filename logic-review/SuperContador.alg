algoritmo "semnome"
// Função :
// Autor :
// Data : 10/01/2020
// Seção de Declarações 
var
   resp, cont: inteiro
inicio
      Escreval("::====================================::")
      Escreval("::          SUPER CONTADOR            ::")
      Escreval("::====================================::")
      Escreval()

      Escreval("      =========================         ")
      Escreval("      |        M E N U        |")
      Escreval("      =========================         ")
      Escreval("      |     [1] De 1 a 10     |")
      Escreval("      |     [2] De 10 a 1     |")
      Escreval("      |     [3] Sair          |")
      Escreval("      =========================         ")
      
      Escreval()
      leia(resp)
      
      Se (resp = 1) entao
         enquanto (cont < 10) faca
           cont <- cont +1
           Escreval("> ", cont)
         FimEnquanto
      senao
           se (resp = 2) entao
              cont <- 10
              enquanto (cont > 0) faca
                 Escreval("> ", cont)
                 cont <- cont - 1
              FimEnquanto
           senao
                se (resp = 3) entao
                   limpaTela
                FimSe
           FimSe
      FimSe
      
fimalgoritmo
