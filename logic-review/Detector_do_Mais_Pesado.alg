algoritmo "semnome"
// Função :
// Autor :
// Data : 11/01/2020
// Seção de Declarações 
var
   Mpeso, peso, cont: real
   name, Mname: caractere
Procedimento Header()
Inicio
    LimpaTela
    EscrevaL(":----------------------------------------:")
    EscrevaL(":           D E T E  C T O R             :")
    EscrevaL(":                 D E                    :")
    EscrevaL(":             P E S A D O                :")
    EscrevaL(":----------------------------------------:")
    EscrevaL()
       
FimProcedimento

inicio

  Enquanto (cont < 3) faca
       Header()
       EscrevaL("     >> Maior peso detectador: ", Mpeso,"Kg")
       EscrevaL()
       EscrevaL(":----------------------------------------:")


       Escreval()
       Escreva("Digite o nome: ")
       leia(name)

       Escreva("Digite o peso de ", name,": ")
       leia(peso)

       Se (peso > Mpeso) entao
          Mpeso <- peso
          Mname <- name
       FimSe
       
       cont  <- cont +1
       LimpaTela
  FimEnquanto
       
   Header()
   Escreval(" >> Nome: ", name)
   Escreval(" >> Peso:", Mpeso,"Kg")
   EscrevaL()
   EscrevaL(":----------------------------------------:")
       

fimalgoritmo
