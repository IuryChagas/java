algoritmo "semnome"
// Função :
// Autor :
// Data : 10/01/2020
// Seção de Declarações 
var
   cont, s, n, tab, collect: real
inicio

      Escreval("::====================================::")
      Escreval("::      COLETOR DE N° NEGATIVOS       ::")
      Escreval("::====================================::")
      Escreval()
      
      Escreval()
      
      repita
            n <- n + 1
            
            Escreva("Digite o ", n, "° numero: ")
            leia(tab)
            
            se (tab < 0) entao
               collect <- collect + 1
            FimSe
      ate (n >= 5)

      Escreval()
      Escreval("   Foram coletados [",collect," ] números negativos")
fimalgoritmo
