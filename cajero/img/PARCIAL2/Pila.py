'''peraciones Básicas:

Push: Agregar un elemento a la parte superior de la pila
Pop: Retira el elemento superior de la pila
Peek: Mira el elemento superior sin retirarlo
Size: Analiza la cantidad de elementos de la pila
'''

class Pila:
  def __init__(self):
    self.listaElementos = [] # Listo
  def push(self, dato):
    self.listaElementos.append(dato) # Listo
  def pop(self):
    
    self.listaElementos.pop() # listo
  def size(self):
    return len(self.listaElementos) # Listo
  def peek(self):
    
    print(self.listaElementos[-1]) # Listo}
  def show(self):
    for elemento in self.listaElementos[::-1]:
      print(elemento,end = " ")
    print("\n")


  
'''pila = Pila()
pila.push(1)
pila.push(2)
pila.push(3)
pila.show()
print("\nultimo")
pila.peek()
pila.pop()
print("Lista despues de eliminar el ultimo")
pila.show()
'''