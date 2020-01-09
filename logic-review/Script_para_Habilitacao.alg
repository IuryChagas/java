algoritmo "semnome"
// Função :
// Autor :
// Data : 08/01/2020
// Seção de Declarações 
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
        Escreval(" APTO À TIRAR CARTEIRA")
      senao
        Escreval(" INAPTO À TIRAR CARTEIRA")
      FimSe

      Escreval("-------------------------")
      
fimalgoritmo
