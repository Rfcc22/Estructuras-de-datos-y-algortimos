import numpy as np

Postres = np.array(["Pie", "Flan", "Cupcake", "Galleta"])
Ingredientes = []

listaIngredientes = []

def printPostres():
    for i in range(len(Postres)):
        print(f"{Postres[i]} Ingredientes: {listaIngredientes[i]}")

def anadirIngredientes():
    for postre in range(len(Postres)):
        over = True
        listaingredienteActual = []
        while over == True:
            try:
                print(f"Para terminar de escribir ingredintes precione Q\n{Postres[postre]}")
                nombreIngrediente = str(input("Cual es el nombre del ingrediente?  ").rstrip().capitalize())
                if (nombreIngrediente == "Q"):
                    over = False;
                    break;
                listaingredienteActual.append(nombreIngrediente)
            except: 
                print("Caracter invalido")
        listaIngredientes.append(listaingredienteActual)

def buscarIngredientes():
    found = False
    while found == False:
        try:
            postreSeleccionado = str(input("Que postre quieres ver?  ").rstrip().capitalize())
            for postre in range(len(Postres)):
                if (Postres[postre] == postreSeleccionado):
                    print(f"{Postres[postre]}: Ingredientes {listaIngredientes[postre]}")
                    found == True;
            break;
        except:
            print("Escribe un nombre de un postre") 


def eliminarIngredientes():
    found = False
    while found == False:
        try:
            postreSeleccionado = str(input("Presiona Q para salir\nQue postre quieres ver?  ").rstrip().capitalize())
            printPostres()
            if (postreSeleccionado == 'Q'):
                break
            for postre in range(len(Postres)):
                if (Postres[postre] == postreSeleccionado):
                    choice = int(input("Que desea hacer?\n1.- Borrar todos los ingredientes\n2.- Eliminar un ingrediente\n").strip())
                    match choice:
                        case 1:
                            listaIngredientes[postre] = []
                        case 2: 
                            ingredienteSeleecionado = str(input("Cual es el nombre del ingrediente? ").rstrip().capitalize())
                            if ingredienteSeleecionado in listaIngredientes[postre]:
                                listaIngredientes[postre].remove(ingredienteSeleecionado)
                    print(f"{Postres[postre]}: Ingredientes {listaIngredientes[postre]}")
                    found == True;
            break;
        except:
            print("Escribe un nombre de un postre") 

while True:
    choice = int(input("Que es lo que quieres hacer? \n1.- Ver Postres\n2.- Anadir ingredientes\n3.- Buscar Ingredientes\n4.- Eliminar Ingredientes\n5.- Salir\n").rstrip()) 
    match choice:
        case 1: printPostres()
        case 2: anadirIngredientes()
        case 3: buscarIngredientes()
        case 4: eliminarIngredientes()
        case 5: break








    




        

    












































