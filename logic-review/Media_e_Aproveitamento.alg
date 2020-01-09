algoritmo "semnome"
// Função :
// Autor :
// Data : 08/01/2020
// Conforme a pontuação do aluno, o script retorna retorna a classificação:
// que pode variar de A à F

var
    n1, n2, media: real
inicio
      Escreva("1°  Nota: ")
      leia(n1)
      
      Escreva("2°  Nota: ")
      leia(n2)
      
      media <- (n1 + n2) / 2
      
      Se(media <= 10) e (media >= 9) entao
        Escreval()
        Escreval("Média do Aluno: ", media)
        Escreval("Aproveitamento: [A]")
      senao
         Se(media <= 8.9) e (media >= 8)entao
           Escreval()
           Escreval("Média do Aluno: ", media)
           Escreval("Aproveitamento: [B]")
         senao
           Se(media <= 7.9) e (media >= 7) entao
              Escreva()
              Escreval("Média do Aluno: ", media)
              Escreval("Aproveitamento: [C]")
           senao
              Se(media <= 6.9) e(media >= 6) entao
                 Escreva()
                 Escreval("Média do Aluno: ", media)
                 Escreval("Aproveitamento: [D]")
              senao
                 Se(media <= 5.9) e (media >= 5) entao
                    Escreva()
                    Escreval("Média do Aluno: ", media)
                    Escreval("Aproveitamento: [E]")
                 senao
                   se(media < 5) entao
                      Escreva()
                      Escreval("Média do Aluno: ", media)
                      Escreval("Aproveitamento: [F]")
                   FimSe
                 FimSe
              FimSe
           FimSe
         FimSe
      FimSe
      

fimalgoritmo
