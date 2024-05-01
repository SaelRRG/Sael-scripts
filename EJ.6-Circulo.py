class Circulo:
    
    def __init__(self, color='Blanco', radio=1):
        self.__color = color
        self.__radio = radio
    
    @property
    def color(self):
        return self.__color
    
    @color.setter
    def color(self, color):
        self.__color = color
    
    @property
    def radio(self):
        return self.__radio
    
    @radio.setter
    def radio(self, radio):
        self.__radio = radio
    

    def __perimetro(self):
        return (3.14) * 2 * (self.__radio)
    
    @property
    def perimetro(self):
        return self.__perimetro()
    
    def __area(self):
        return (3.14) * (self.__radio) * (self.__radio)
    
    @property
    def area(self):
        return self.__area()
    

c1 = Circulo()
radio= float(input("Ingresa un valor para el radio de tu Circulo: "))
color= str(input("Ingresa un color de tu Circulo: "))

c1.radio = radio
c1.color = color

print(f"El color del Circulo es: {c1.color}, su radio es de {c1.radio} y su diametro es de: {2*(c1.radio)}")
print(f"Su perimetro es de: {c1.perimetro}")
print(f"Su area es de: {c1.area}")
