algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 08/01/2020
// Se��o de Declara��es 
var
   ano_atual, ano_nasc, idade: inteiro

inicio
      Escreval("-------------------------")
      Escreval("DEPARTAMENTO DE TRANSITO")
      Escreval("-------------------------")
      
      Escreva("Ano atual (yyyy): ")
      leia(ano_atual)
      
      Escreva("Ano de Nascimento (yyyy): ")
      leia(ano_nasc)
      
      idade <- ano_atual - ano_nasc
      Escreval("-------- STATUS ---------")
      Escreval(" IDADE: ", idade, " ANOS")

      Se(idade >= 18) entao
        Escreval(" APTO � TIRAR CARTEIRA")
      senao
        Escreval(" INAPTO � TIRAR CARTEIRA")
      FimSe

      Escreval("-------------------------")
      
fimalgoritmo
