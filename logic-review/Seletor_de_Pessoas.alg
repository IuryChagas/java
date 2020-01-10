algoritmo "semnome"
// Função :
// Autor :
// Data : 10/01/2020
// Quanto homens (M) maiores de 18 de cabelo Castanho
// Quantas mulheres (F) entre 25 e 30 São Loiras
var
   sex, resp: caractere
   idade, cabelo, mulheres, homens: inteiro

   
inicio

     resp <- "s"
     Enquanto (resp = "s") faca

      Escreval("::====================================::")
      Escreval("::        SELETOR DE PESSOAS          ::")
      Escreval("::====================================::")
      Escreval()
      
      Escreva("Qual Sexo: [M/F] ")
      leia(sex)
      
      Escreva("Qual Idade: ")
      leia(idade)
      
      Escreval("Qual Cor Cabelo: ")
      Escreval("---------------------")
      Escreval("[1] Preto")
      Escreval("[2] Castanho")
      Escreval("[3] Loiro")
      Escreval("[4] Ruivo")
      leia(cabelo)
      
      se (sex = "m") e (idade >= 18) e (cabelo = 2) entao
         homens <- homens +1
      senao se (sex = "f") e (idade >= 25) e (idade <= 30) e (cabelo = 3)
         mulheres <- mulheres +1
         
      FimSe
      
      Escreval("Quer continuar ? [S/N]")
      leia(resp)

      limpaTela
  FimEnquanto
   
      Escreval("::====================================::")
      Escreval("::        SELETOR DE PESSOAS          ::")
      Escreval("::                                    ::")
      Escreval("::#Quantidade de homens               ::")
      Escreval("::> Acima de 18!                      ::")
      Escreval("::> Cabelos Castanhos                 ::")
      Escreval("::       Total:", homens,"            ::")
      Escreval("::                                    ::")
      Escreval("::#Quantidade de mulheres             ::")
      Escreval("::> de 25 à 30!                       ::")
      Escreval("::> Cabelos loiro                     ::")
      Escreval("::       Total:", mulheres,"          ::")
      Escreval("::====================================::")
      Escreval()
      
fimalgoritmo
