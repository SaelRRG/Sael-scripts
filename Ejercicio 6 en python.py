class Cuadrado:
    
    def __init__(self, color='Blanco', lado=1):
        self.__color = color
        self.__lado = lado
    
    @property
    def color(self):
        return self.__color
    
    @color.setter
    def color(self, color):
        self.__color = color
    
    @property
    def lado(self):
        return self.__lado
    
    @lado.setter
    def lado(self, lado):
        self.__lado = lado

    def __perimetro(self):
        return 4 * self.__lado
    
    @property
    def perimetro(self):
        return self.__perimetro()
    
    def __area(self):
        return (self.__lado) * (self.__lado)
    
    @property
    def area(self):
        return self.__area()
    

c1 = Cuadrado()
lado= float(input("Ingresa un valor para el lado de tu cuadrado: "))
color= str(input("Ingresa un color de tu cuadrado: "))

c1.lado = lado
c1.color = color

print(f"El color del Cuadrado es: {c1.color} y su lado es de: {c1.lado}")
print(f"Su perimetro es de: {c1.perimetro}")
print(f"Su area es de: {c1.area}")
