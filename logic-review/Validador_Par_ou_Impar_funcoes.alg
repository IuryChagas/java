algoritmo "Validar de n� Par ou Impar"
// Fun��o :
// Autor :
// Data : 13/01/2020
// Finalidade: entender como s�o fun��es!
var
   n1 : inteiro
   stotal: caractere
funcao ParOuImpar(v : inteiro) : caractere
   inicio
      se (v % 2 = 0) entao
         EscrevaL()
          Escreval(" Valor digitado �: PAR")
         EscrevaL()
      senao
        EscrevaL()
         Escreval(" Valor digitado �: IMPAR")
        EscrevaL()
      fimSe
fimfuncao
inicio
      Escreva("Digite 1� valor: ")
      leia(n1)
      
      stotal <- ParOuImpar(n1)
      

fimalgoritmo
