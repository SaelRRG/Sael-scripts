
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define ELEMENTOS 1001

int *Crear_arreglo();
void mostrar_arreglo(const int numeros[ELEMENTOS]);
int buscar_elemento(int valor, const int arreglo[ELEMENTOS]);
void quicksort(int arreglo[], int n);
void ordena(int arreglo[], int lim_izq, int lim_der);

int main() {
    int *direccion;
    int numero;
    srand(time(NULL));

    direccion = Crear_arreglo();
    printf("El arreglo original es:\n");
    mostrar_arreglo(direccion);
    printf("Ingresa el numero que deseas buscar:\n");
    scanf("%d", &numero);

    clock_t inicio = clock();

    int indice = buscar_elemento(numero, direccion);
    if (indice != -1) {
        printf("Tu numero es: %d, y su posicion en el arreglo es: %d\n", numero, indice);
    } else {
        printf("El numero no se encuentra en el arreglo.\n");
    }

    quicksort(direccion, ELEMENTOS);
    printf("\nEl arreglo ordenado es:\n");
    mostrar_arreglo(direccion);

    indice = buscar_elemento(numero, direccion);
    if (indice != -1) {
        printf("Tu numero es: %d, y su posicion en el arreglo es: %d\n", numero, indice);
    } else {
        printf("El numero no se encuentra en el arreglo.\n");
    }


    clock_t fin = clock();
    double tiempo_total = (double)(fin - inicio) / CLOCKS_PER_SEC;
    printf("Tiempo de ejecucion del programa es: %.4f segundos\n", tiempo_total);

    return 0;
}

int *Crear_arreglo() {
    static int arreglo[ELEMENTOS];
    for (int x = 0; x < ELEMENTOS; x++) {
        arreglo[x] = 1 + (rand() % 1001);
    }
    return arreglo;
}

void mostrar_arreglo(const int numeros[ELEMENTOS]) {
    for (int x = 0; x < ELEMENTOS; x++) {
        printf("Elemento [%d] = %d\n", x, numeros[x]);
    }
}

int buscar_elemento(int valor, const int arreglo[ELEMENTOS]) {
    for (int iterador = 0; iterador < ELEMENTOS; iterador++) {
        if (arreglo[iterador] == valor) {
            return iterador;
        }
    }
    return -1;
}

void quicksort(int arreglo[], int n) {
    ordena(arreglo, 0, n - 1);
}

void ordena(int arreglo[], int lim_izq, int lim_der) {
    int izq = lim_izq;
    int der = lim_der;
    int pivote = arreglo[(izq + der) / 2];

    while (izq <= der) {
        while (arreglo[izq] < pivote) {
            izq++;
        }
        while (arreglo[der] > pivote) {
            der--;
        }
        if (izq <= der) {
            int temp = arreglo[izq];
            arreglo[izq] = arreglo[der];
            arreglo[der] = temp;
            izq++;
            der--;
        }
    }

    if (lim_izq < der) {
        ordena(arreglo, lim_izq, der);
    }
    if (izq < lim_der) {
        ordena(arreglo, izq, lim_der);
    }
}
