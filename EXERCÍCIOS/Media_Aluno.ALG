Algoritmo "Media"
Var
   P1, E1, E2, API, X, SUB, EXF, M1, nota_parcial, nota_final: real

Inicio

   escreval("Insira a nota da P1:")
   leia(P1)
   escreval("Insira a nota da E1:")
   leia(E1)
   escreval("Insira a nota da E2:")
   leia(E2)
   escreval("Insira a nota de Atividades Extras:")
   leia(X)
   escreval("Insira a nota Substitutiva[digite 0 se nao fez]:")
   leia(SUB)
   escreval("Insira a nota da API:")
   leia(API)
   escreval("Insira a nota do Exame Final[digite 0 se nao fez]:")
   leia(EXF)

   M1 <- (P1 * 0.5) + (E1 * 0.2) + (E2 * 0.3) + X + (SUB * 0.15)

   se (M1 >= 6.0) entao
      nota_parcial <- (M1 * 0.5) + (API * 0.5)
   senao
      nota_parcial <- M1 * 0.5
   fimse

   se (EXF > nota_parcial) entao
      nota_final <- EXF
   senao
      nota_final <- nota_parcial
   fimse

   escreval("--------------------------------")
   escreval("Nota Final do Semestre: ", nota_final)

Fimalgoritmo
