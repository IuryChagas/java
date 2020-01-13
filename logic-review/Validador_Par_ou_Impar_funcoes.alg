algoritmo "Validar de n° Par ou Impar"
// Função :
// Autor :
// Data : 13/01/2020
// Finalidade: entender como são funções!
var
   n1 : inteiro
   stotal: caractere
funcao ParOuImpar(v : inteiro) : caractere
   inicio
      se (v % 2 = 0) entao
         EscrevaL()
          Escreval(" Valor digitado é: PAR")
         EscrevaL()
      senao
        EscrevaL()
         Escreval(" Valor digitado é: IMPAR")
        EscrevaL()
      fimSe
fimfuncao
inicio
      Escreva("Digite 1° valor: ")
      leia(n1)
      
      stotal <- ParOuImpar(n1)
      

fimalgoritmo
