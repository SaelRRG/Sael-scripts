#include <stdio.h>
#include <math.h>
#include <stdlib.h>

float suma(float a, float b){
   return (a+b);}

float resta(float a, float b){
   return (a-b);}

float producto(float a, float b){
   return (a*b);}

float division(float a, float b){
   return (a/b);}

float valor_absoluto(float a){
   return fabs(a);}

float potencia(float a, float b){
   return pow(a,b);}

float raiz(float a){
   return sqrt(a);}

float logaritmo(float a){
   return log(a);}

float seno(float a){
   return sin(a);}

float coseno(float a){
   return cos(a);}

void operaciones(int opt);

int main(){
  int opcion;
  float valor1, valor2, resultado;

     while(opcion!=11){

        printf("\n\nElige la opcion que desees:\n\n");
        printf("1. SUMA.\n");
        printf("2. RESTA.\n");
        printf("3. PRODUCTO.\n");
        printf("4. DIVISION.\n");
        printf("5. VALOR ABSOLUTO.\n");
        printf("6. POTENCIA.\n");
        printf("7. RAIZ CUADRADA.\n");
        printf("8. LOGARITMO.\n");
        printf("9. SENO.\n");
        printf("10. COSENO.\n");
        printf("11. SALIR.\n");
        printf("\nTu opcion es:  ");
        scanf("%d",&opcion);
        printf("\n\n");
        operaciones(opcion);
     }
     printf("\nAdios...\n");

return 0;
}

void operaciones(int opt){
  float valor1, valor2, resultado;

        switch(opt){
          case 1: {printf("Ingresa un primer valor: ");
                   scanf("%f",&valor1);
                   printf("\n");
                   printf("Ingresa un segundo valor: ");
                   scanf("%f",&valor2);
                   printf("\n\n");
                   resultado=suma(valor1,valor2);
                   printf("El resultado es: %.4f\n",resultado);
                   }break;

          case 2: {printf("Ingresa un primer valor:  ");
                   scanf("%f",&valor1);
                   printf("\n");
                   printf("Ingresa un segundo valor:  ");
                   scanf("%f",&valor2);
                   printf("\n\n");
                   resultado=resta(valor1,valor2);
                   printf("El resultado es: %.4f\n",resultado);
                   }break;

          case 3: {printf("Ingresa un primer valor:  ");
                   scanf("%f",&valor1);
                   printf("\n");
                   printf("Ingresa un segundo valor:  ");
                   scanf("%f",&valor2);
                   printf("\n\n");
                   resultado=producto(valor1,valor2);
                   printf("El resultado es: %.4f\n",resultado);
                   }break;

          case 4: {printf("Ingresa un primer valor:  ");
                   scanf("%f",&valor1);
                   printf("\n");
                   printf("Ingresa un segundo valor:  ");
                   scanf("%f",&valor2);
                   printf("\n\n");
                   resultado=division(valor1,valor2);
                   printf("El resultado es: %.4f\n",resultado);}
                   break;

          case 5: {printf("Ingresa un valor:  ");
                   scanf("%f",&valor1);
                   printf("\n\n");
                   resultado=valor_absoluto(valor1);
                   printf("El resultado es: %.4f\n",resultado);}
                   break;

          case 6: {printf("Ingresa un valor:  ");
                   scanf("%f",&valor1);
                   printf("\n");
                   printf("Ingresa el valor de potencia para el numero previamente ingresado:  ");
                   scanf("%f",&valor2);
                   printf("\n\n");
                   resultado=potencia(valor1,valor2);
                   printf("El resultado es: %.4f\n",resultado);}
                   break;

          case 7: {printf("Ingresa un valor:  ");
                   scanf("%f",&valor1);
                   printf("\n\n");
                   resultado=raiz(valor1);
                   printf("El resultado es: %.4f\n",resultado);}
                   break;

          case 8: {printf("Ingresa un valor:  ");
                   scanf("%f",&valor1);
                   printf("\n\n");
                   resultado=logaritmo(valor1);
                   printf("El resultado es: %.4f\n",resultado);}
                   break;

          case 9: {printf("Ingresa un valor:  ");
                   scanf("%f",&valor1);
                   printf("\n\n");
                   resultado=seno(valor1);
                   printf("El resultado es: %.4f\n",resultado);}
                   break;

          case 10: {printf("Ingresa un valor:  ");
                   scanf("%f",&valor1);
                   printf("\n\n");
                   resultado=coseno(valor1);
                   printf("El resultado es: %.4f\n",resultado);}
                   break;
        }
}
