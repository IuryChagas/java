algoritmo "semnome"
// Função :
// Autor :
// Data : 12/01/2020
// Seção de Declarações 
var
   v1, v2, resp : real

Funcao soma(x1, x2 : real ) : real

var
  rest : real
inicio

 rest  <- x1 + x2
 
 retorne rest
FimFuncao

inicio

     escreva("Digite o primeiro valor: ")
     leia(v1)
     
     escreva("Digite o segundo valor: ")
     leia(v2)
     
     resp <- soma(v1, v2)
     
     escreva("Valor total: ", resp)
fimalgoritmo
