
#Romero Galicia Sael Raul

class Persona():
    def __init__(self, nombre, apellidoP, apellidoM, edad, sexo, altura, peso):
        self.nombre = nombre
        self.apellidoP = apellidoP
        self.apellidoM = apellidoM
        self.edad = edad
        self.sexo = sexo
        self.altura = altura
        self.peso = peso
    
    def set_Nombre(self, nombre):
        self.nombre = nombre
    
    def set_Paterno(self, apellidoP):
        self.apellidoP = apellidoP

    def set_Materno(self, apellidoM):
        self.apellidoM = apellidoM

    def set_edad(self, edad):
        self.edad = edad

    def set_sexo(self, sexo):
        self.sexo = sexo

    def set_altura(self, altura):
        self.altura = altura

    def set_peso(self, peso):
        self.peso = peso
    
    def get_Nombre(self):
        return self.nombre
    
    def get_Paterno(self):
        return self.apellidoP
    
    def get_Materno(self):
        return self.apellidoM
    
    def get_edad(self):
        return self.edad
    
    def get_sexo(self):
        return self.sexo
    
    def get_altura(self):
        return self.altura
    
    def get_peso(self):
        return self.peso

P1 = Persona(0, 0, 0, 0, 0, 0, 0)
P1.set_Nombre("Sergio")
P1.set_Paterno("Perez")
P1.set_Materno("Lopez")
P1.set_edad(34)
P1.set_sexo("Masculino")  # Corregido el valor de sexo
P1.set_altura(1.80)
P1.set_peso(88.2)
print(P1.get_Nombre())
print(P1.get_Paterno())
print(P1.get_Materno())
print(P1.get_edad())
print(P1.get_sexo())
print(P1.get_altura())
print(P1.get_peso())
