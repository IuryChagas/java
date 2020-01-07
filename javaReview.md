<h1 align="center">Exercícios de revisão Java</h1>

- *15 dias de Estudos - Lógica e Java*
- *15 dias de Projetos - Prática e entrega*

## 1°] Imprima todos os números de 200 a 300:
```java
class Main {
 public static void main(String[] args) {
   for(int n1 = 200; n1 <= 300; n1++ ){
     System.out.println(n1);
   }
 }
}
```
- [Executar Código - Test 1:](https://repl.it/@IuryChagas/teste1)

## 2°] Imprima todos os múltiplos de 3, entre 1 e 100:
```java
class Main {
  public static void main(String[] args) {
    int n1 = 3;
    do {
   	  System.out.println(n1);
   	  n1 = n1 +3;
    }while(n1 <= 100);
  }
}
```
- [Executar Código - Test 2:](https://repl.it/@IuryChagas/teste2)

## 3°] Imprima os fatoriais de 1 a 6:
```java

class Main {
 public static void main (String [] args){
 
    for (int n = 1; n <= 6; n++){
     if(n == 0 || n == 1){
       System.out.println("Fatorial de "+n+"! = "+1);
     }else{
       int nf = 1;
       for(int f = 1; f <= n; f++){
           nf *= f;
       }
       System.out.println("Fatorial de "+n+"! = "+nf);
     }
    }
  }
}
```
- [Executar Código - Test 3:](https://repl.it/@IuryChagas/teste3)

## 4°] Escreva um programa que, dada uma variável `x` com algum valor inteiro, temos um novo `x` de acordo com a seguinte regra:
  - a) se x é par, x = x / 2.
  - b) se x é ímpar, x = 3 * x + 1.
  - c) imprime x.
  - _O programa deve parar quando x tiver o valor final de 1. Por exemplo, para x = 13, a saída será:_
>   40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

```java
class Main {
 public static void main(String[] args) {
   int x = 13;
   if( (x % 2) == 0 ){
      x = x / 2;
      System.out.println("Valor informado é PAR: ");
   }else {
      x = 3 * x + 1;
      System.out.println("Valor informado é IMPAR: ");
   }
     while(x >= 1){
       System.out.println(">> "+ x);
       x = x / 2;
     }
 }
}
```
- [Executar Código - Test 4:](https://repl.it/@IuryChagas/teste4)
