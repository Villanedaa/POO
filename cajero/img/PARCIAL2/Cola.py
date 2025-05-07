from Nodo import Nodo

class Cola:
  def __init__(self):
    self.listaElementos = []
  def enqueue(self, dato):
     self.listaElementos.append(dato)
    #eliminar el primer elemento
  def dequeue(self):
    
     self.listaElementos.pop(0)
  def size(self):
    return len(self.listaElementos)
  #mostrar primer elemento
  
  def front(self):
    return self.listaElementos[0]
  def is_empty(self):
    if len(self.listaElementos ) == 0:
      print("La cola esta vacía")
    else:
      print("Contiene elementos la cola")
  def show(self):
      if len(self.listaElementos ) == 0:
        print("La cola esta vacía")
      else: 
        for i in range (len(self.listaElementos)):
          nodo = self.listaElementos[i]
         
          print(f"ID CITA:[{nodo.idCita}]Estado:[{nodo.estadoCita}]", end="-->")
      print()

'''cola = Cola()

cola.enqueue(1)
cola.enqueue(2)
cola.enqueue(3)
cola.enqueue(4)
print("Elementos en cola:")
cola.show()

print("Cola despues de eliminar el primer elemento : ")
cola.dequeue()
cola.show()'''