algoritmo "Comptometer"
// Função :
// Autor :
// Data : 09/01/2020
// Aula 03
// Comando de entrada e Operadores
var
   name: caractere
   FirstN, SecondN, TotAdi, TotSub, TotMul, TotExp, TotDiv: real
   
inicio
      Escreval("----------------------------------------")
      Escreval("        C O M P T O M E T E R           ")
      Escreval("----------------------------------------")

      Escreva(" What's your name: ")
      leia(name)
      Escreval("----------------------------------------")
      Escreval(" Nice to meet you ", name)

      Escreva(" Type First Number: ")
      leia(FirstN)
      
      Escreva(" Type Second Number: ")
      leia(SecondN)

      TotAdi <- FirstN + SecondN
      TotSub <- FirstN - SecondN
      TotMul <- FirstN * SecondN
      TotDiv <- FirstN / SecondN

      TotExp <- FirstN ^ SecondN

      
      Escreval("----------------------------------------")
      Escreval(" Fisrt Number Typed: ", FirstN)
      Escreval(" Second Number Typed: ", SecondN)
      
      Escreval(" TOTAL Sum: ", TotAdi)
      Escreval(" TOTAL Sub: ", TotSub)
      Escreval(" TOTAL Mult: ", TotMul)
      Escreval(" TOTAL Div: ", TotDiv)
      Escreval(" TOTAL Expone: ", TotExp)
      Escreval("----------------------------------------")
      

fimalgoritmo
