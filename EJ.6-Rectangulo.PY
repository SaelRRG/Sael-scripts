class Rectangulo:
    
    def __init__(self, color='Blanco', lado=1, base=1):
        self.__color = color
        self.__lado = lado
        self.__base = base
    
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
    
    @property
    def base(self):
        return self.__base
    
    @base.setter
    def base(self, base):
        self.__base = base

    def __perimetro(self):
        return 2 * (self.__lado + self.__base)
    
    @property
    def perimetro(self):
        return self.__perimetro()
    
    def __area(self):
        return (self.__lado) * (self.__base)
    
    @property
    def area(self):
        return self.__area()
    

r1 = Rectangulo()
lado= float(input("Ingresa un valor para el lado de tu Rectangulo: "))
base= float(input("Ingresa un valor para la base de tu Rectangulo: "))
color= str(input("Ingresa un color de tu Rectangulo: "))

r1.lado = lado
r1.color = color
r1.base = base

print(f"El color del Rectangulo es: {r1.color}, su base es de {r1.base} y su lado es de: {r1.lado}")
print(f"Su perimetro es de: {r1.perimetro}")
print(f"Su area es de: {r1.area}")
