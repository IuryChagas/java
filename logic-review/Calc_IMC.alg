algoritmo "semnome"
// Função :
// Autor :
// Data : 08/01/2020
// Seção de Declarações
var
   peso, altura, imc: real
inicio
      Escreva("Qual seu peso (kg): ")
      Leia(peso)
      
      Escreva("Qual sua altura (m): ")
      Leia(altura)

      imc <- peso / (altura ^ 2)

      // Peso ideal entre 18.5 e 25
      Se(imc <= 17) entao
        Escreval("Seu IMC é: ", imc:5:2)
        Escreval("MUITO abaixo do peso!")
      senao
        se(imc >= 17) e (imc <= 18.5)entao
          Escreval("Seu IMC é: ", imc:5:2)
          Escreval("ABAIXO do peso!")
        senao
          se(imc >= 18.5) e (imc <= 25) entao
             Escreval("Seu IMC é: ", imc:5:2)
             Escreval("Peso IDEAL!")
          senao
             se(imc >= 25) e (imc <= 30) entao
                Escreval("Seu IMC é: ", imc:5:2)
                Escreval("SOBREPESO!")
             senao
               se(imc >= 30) e (imc <= 35) entao
                  Escreval("Seu IMC é: ", imc:5:2)
                  Escreval("OBESIDADE")
               senao
                 se(imc >= 35) e (imc <= 40)entao
                    Escreval("Seu IMC é: ", imc:5:2)
                    Escreval("OBESIDADE Severa!")
                 senao
                   se(imc >= 40) entao
                     Escreval("Seu IMC é: ", imc:5:2)
                     Escreval("OBESIDADE Mórbida!")
                   FimSe
                 FimSe
               FimSe
             FimSe
          FimSe
        FimSe
      FimSe
fimalgoritmo
