algoritmo "Conversor de Moedas"
// Função :
// Autor :
// Data : 08/01/2020
// Aula 06
var
   reais, dolar, opcao: real
inicio

      Escreval("[1] para Reais")
      Escreval("[2] para Dolares")
      Escreva("Qual moeda deseja converter: ")
      leia(opcao)
      
      se(opcao = 1) entao
         Escreva("Quanto deseja converter: U$")
         leia(dolar)

         reais <- dolar / 2.2

         Escreva("Conversão ficou em: R$", reais:4:2)
      senao
         Se(opcao = 2) entao
            Escreva("Quanto deseja converter: R$")
            leia(reais)
            
            dolar <- reais / 2.2
            
            Escreva("Conversão ficou em: U$", dolar:4:2)
         senao
            Escreval()
            Escreval("----------------------------------")
            Escreval("Dados inválidos, tente novamente!")
            Escreval("----------------------------------")
         FimSe
      FimSe
      


fimalgoritmo
