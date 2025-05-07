from Nodo import Nodo
from Pila import Pila
from Cola import Cola
class ListaEnlazada:
  def __init__(self):
    self.cabeza = None
    self.size = 0
    self.cola = Cola()
    self.pila = Pila()
    #def push
  def agregarCita(self,nombrePaciente,nombreDoctor,horaCita,estadoCita):
    nuevoNodo = Nodo(nombrePaciente,nombreDoctor,horaCita,estadoCita)

    if self.cabeza is None:
      self.cabeza = nuevoNodo
    else:
      nodoActual = self.cabeza
      while nodoActual.siguiente is not None:
        nodoActual = nodoActual.siguiente
      nodoActual.siguiente = nuevoNodo
    self.size += 1
    self.pila.push(f"[Se creo la cita con ID: {nuevoNodo.idCita}]")
    nuevoNodo.setEstadoCita("PENDIENTE")
    self.cola.enqueue(nuevoNodo)
########################################################################################################3
  def modificarCita(self,idBuscar):
    nodoActual = self.cabeza
    while nodoActual!= None:
      if nodoActual.idCita == idBuscar:
       
        opcion = int(input("1.MODIFICAR PACIENTE\n 2.MODIFICAR DOCTOR\n 3.MODIFICAR HORARIO : "))
        if opcion == 1:

          paciente = str(input("INGRESE NUEVO NOMBRE DEL PACIENTE: "))
          original = nodoActual.getNombrePaciente()
          nodoActual.setNombrePaciente(paciente)
          self.pila.push(f" SE MODIFICO EL PACIENTE DE LA CITA:[{nodoActual.idCita}]")
        elif opcion == 2:
          doctor = str(input("INSERTE EL NUEVO NOMBRE DEL DOCTOR: "))
          original = nodoActual.getNombreDoctor()
          nodoActual.setNombreDoctor(doctor)
          self.pila.push(f"SE MODIFICO EL DOCTOR DE LA CITA: [{nodoActual.idCita}]")
        elif opcion == 3:
          horario = str(input("INSERTE EL NUEVO HORARIO: "))
          original = nodoActual.getHorario()
          nodoActual.setHorario(horario)
          self.pila.push(f"SE MODIFICO EL HORARIO DE LA CITA:[{nodoActual.idCita}]")

      nodoActual = nodoActual.siguiente
#############################################################################################  {}
  def pop(self):
    if self.cabeza == None:
      return
    elif self.cabeza.siguiente is None:
      valorEliminado = self.cabeza.valor
      self.cabeza = None
      self.size -= 1
      return valorEliminado
    else:
      nodoActual = self.cabeza
      previo = None
      while nodoActual.siguiente != None:
        previo = nodoActual
        nodoActual = nodoActual.siguiente
      previo.siguiente = None
      self.size -= 1
      #############################################################################################
  def visualizarLista(self):
    nodoActual = self.cabeza
    while nodoActual:
      print(f"DOCTOR A CARGO : [{nodoActual.nombreDoctor}] PACIENTE :[{nodoActual.nombrePaciente}] ID CITA :[{nodoActual.idCita}]  HORARIO :[{nodoActual.horaCita}] ESTADO CITA :[{nodoActual.estadoCita}] " )
      nodoActual = nodoActual.siguiente
    print('None')
    #############################################################################################
  def visualizarPendientes(self):
    nodoActual = self.cabeza
    while nodoActual!= None:
      if nodoActual.estadoCita == "PENDIENTE":
        print(f"DOCTOR A CARGO : [{nodoActual.nombreDoctor}] PACIENTE :[{nodoActual.nombrePaciente}] ID CITA :[{nodoActual.idCita}]  HORARIO :[{nodoActual.horaCita}] ESTADO CITA :[{nodoActual.estadoCita}] " )
      nodoActual = nodoActual.siguiente
    print("None")
#############################################################################################
  def eliminarCita(self):
    cita = self.cola.front()
    #self.pila.push(f"SE CANCELO LA CITA :[{self.cola.front()}]")
    nodoActual = self.cabeza
    while nodoActual is not None:
        if nodoActual.idCita == cita.idCita:
            nodoActual.setEstadoCita("CANCELADA")  
            break  
        nodoActual = nodoActual.siguiente
    self.cola.dequeue()
    self.pila.push(f"SE CANCELO LA CITA CON ID:[{cita.idCita}]")
  #############################################################################################################  
  def procesarCita(self):
    if self.cola.size() == 0:
        print("No hay citas pendientes para procesar.")
        return
    #pos 1
    cita = self.cola.front()  
    # Eliminar de la cola
    self.cola.dequeue()
    
    # Actualizar estado 
    nodoActual = self.cabeza
    while nodoActual is not None:
        if nodoActual.idCita == cita.idCita:
            nodoActual.setEstadoCita("COMPLETADA")
            break
        nodoActual = nodoActual.siguiente
    
    # Registrar en la pila
    self.pila.push(f"SE PROCESÓ LA CITA CON ID: [{cita.idCita}]")
 #####################################################################################################################   
  def showCola(self):
    self.cola.show()

  def tam(self):
    print(self.size)
 ########################################################################################### 
  def showHistorial(self):
    self.pila.show()

  def peek(self):
    if self.cabeza is None:
      return
    else:
      nodoActual = self.cabeza
      while nodoActual.siguiente is not None:
        nodoActual = nodoActual.siguiente
      return nodoActual.valor
    
'''lista = ListaEnlazada()
lista.agregarCita("sebas","albeiro","8:23","programada")
lista.agregarCita("natalia","albeiro","8:23","programada")
lista.visualizarLista()'''