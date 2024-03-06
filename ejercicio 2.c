//*******************************************SRRG******************************************//
#include<stdio.h>
#include<stdlib.h>
#include<time.h>

#define ARREGLO 10

int generar_valoreslista();
int maximo(const int arreglo[ARREGLO]);
int minimo(const int arreglo[ARREGLO]);
int suma_total(const int arreglo1[ARREGLO],const int arreglo2[ARREGLO]);
void suma(const int arreglo1[ARREGLO],const int arreglo2[ARREGLO]);

int main(){
printf("ROMERO GALICIA SAEL RAUL 3CV1\n\n\n\n");
  int lista1[ARREGLO];
  int lista2[ARREGLO];
  int iterador;
  int Maximo1=0;
  int Maximo2=0;
  int Minimo1=0;
  int Minimo2=0;
  srand(time(NULL));

    clock_t inicio = clock();

    printf("Lista 1: { ");
    for(iterador=0;iterador<ARREGLO;iterador++){
        lista1[iterador]=generar_valoreslista();
        printf("%d  ",lista1[iterador]);
    }printf("}\n");

    printf("Lista 2: { ");
    for(iterador=0;iterador<ARREGLO;iterador++){
        lista2[iterador]=generar_valoreslista();
        printf("%d  ",lista2[iterador]);
    }printf("}\n");

    Maximo1=maximo(lista1);
    printf("El maximo de la lista 1, es: %d\n",Maximo1);
    Maximo2=maximo(lista2);
    printf("El maximo de la lista 2, es: %d\n",Maximo2);

    Minimo1=minimo(lista1);
    printf("El minimo de la lista 1, es: %d\n",Minimo1);
    Minimo2=minimo(lista2);
    printf("El maximo de la lista 2, es: %d\n",Minimo2);

    printf("El resultado de la suma de las listas es: %d\n",suma_total(lista1,lista2));
    suma(lista1,lista2);

    clock_t fin=clock();
    double tiempo_total = (double)(fin - inicio) / CLOCKS_PER_SEC;
    printf("Tiempo de ejecucion del programa es: %.4f segundos\n", tiempo_total);

return 0;
}

int generar_valoreslista(){

  int valor;
        valor=(rand()%201-100);

      return valor;
}

int maximo(const int arreglo[ARREGLO]){
  int x;
  int valor=0;

     for(x=0;x<ARREGLO;x++){
        if(valor<arreglo[x]){
            valor=arreglo[x];
        }
     }

return valor;
}

int minimo(const int arreglo[ARREGLO]){
  int x;
  int valor=0;

     for(x=0;x<ARREGLO;x++){
        if(valor>arreglo[x]){
            valor=arreglo[x];
        }
     }

return valor;
}

int suma_total(const int arreglo1[ARREGLO],const int arreglo2[ARREGLO]){
int x;
int valor1=0;
int valor2=0;
int total=0;

     for(x=0;x<ARREGLO;x++){
            valor1+=arreglo1[x];

     }

     for(x=0;x<ARREGLO;x++){
            valor2+=arreglo2[x];
     }
    total=valor1+valor2;
return total;
}

void suma(const int arreglo1[ARREGLO],const int arreglo2[ARREGLO]){
int x;
int valor=0;
     printf("Lista de sumas: { ");
     for(x=0;x<ARREGLO;x++){
            valor=(arreglo1[x])+(arreglo2[x]);
     printf("%d  ",valor);
     }printf("}\n");
}
