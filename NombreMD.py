class Datos:
    def __init__(self, Nombre, b, c,d):
        self.Nombre= Nombre
        self.Apellido = b
        self.Edad = c
        self.Profesion = d
    
    def mostrar(self):
        print(f"Nombres: {self.Nombre}")
        print(f"Apellidos: {self.Apellido}")
        print(f"Edad: {self.Edad}")
        print(f"Profesion: {self.Profesion}")
