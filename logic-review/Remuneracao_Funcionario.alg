algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 08/01/2020
// Se��o de Declara��es 
var
   nome: caractere
   sal, nsal, aux: real
   deps: inteiro
   
inicio
// Quantidade de dependentes de um funcion�rio


   Escreva(" Nome do funcion�rio: ")
   leia(nome)
   Escreva(" Sal�rio: R$")
   leia(sal)
   Escreva(" Dependentes: ")
   leia(deps)
   
   Escolha deps
           caso 0
             nsal <- sal + (sal * 5/100)
             aux <- sal * (5/100)
           caso 1, 2
             nsal <- sal + (sal * 10/100)
             aux <- sal * (10/100)
           caso 3,4
             nsal <- sal + (sal * 15/100)
             aux <- sal * (15/100)
           OutroCaso
             nsal <- sal + (sal * 18/100)
             aux <- sal * (18/100)
   FimEscolha
   
   Escreval("-------------------------------")
   Escreval()
   Escreval("Sr� ", nome)
   Escreval("Valor de Sal�rio: R$", sal:4:2)
   Escreval("Valor de Auxilio: R$", aux:4:2)
   Escreval("Remunera��o Total: R$", nsal:4:2)
   Escreval()
   Escreval("-------------------------------")
   
fimalgoritmo
