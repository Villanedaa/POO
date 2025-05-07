'''se importan las clases a usar.

Clase para la presentacion.'''

from Cola import Cola
from ListaEnlazada import ListaEnlazada
from Pila import Pila
from Cola import Cola


class Menu:
    def __init__(self):
     self.lista = ListaEnlazada()
     self.cola = Cola()
     self.pila = Pila()
      
    def mostrar(self):
       opcion = -1
       
       while opcion!= 0:
          print("MENU\n 1.REGISTRAR CITA\n 2.LISTAR CITAS\n 3.MODIFICAR CITA\n 4.CANCELAR CITA\n 5.PROCESAR CITAS \n 6. DESHACER CAMBIO\n 7.MOSTRAR HISTORIAL\n 8.VER COLA\n 0.SALIR" )
          opcion = int(input("INGRESE UNA OPCION: "))
          
          if opcion == 1:
             nombrePaciente = str(input("Ingrese el nombre del paciente : "))
             nombreDoctor = str(input("Ingrese el nombre del doctor: "))
             horaCita = str(input("INGRESE LA HORA DE LA CITA: "))
             estadoCita = "PROGRAMADA"
             self.lista.agregarCita(nombrePaciente,nombreDoctor,horaCita,estadoCita)
             print("\n LA CITA FUE AGREGADA CORRECTAMENTE")

          elif opcion == 2:
             opcion2 = int(input("\n 1.LISTAR TODAS LAS CITAS\n 2.LISTAR SOLO LISTAS PENDIENTES: "))
             if opcion2 == 1:
                print("CITAS EN LA LISTA:")
                self.lista.visualizarLista()
             elif opcion2 == 2:
                print("CITAS PENDIENTES")
                self.lista.visualizarPendientes()
          elif opcion == 3:
            idBuscar = int(input("INGRESE EL ID DE LA CITA A BUSCAR : "))
            self.lista.modificarCita(idBuscar)
          elif opcion == 4:
               #id = int(input("INSERTE ID DE LA CITA A CANCELAR : "))
               self.lista.eliminarCita()
          elif opcion == 5:
            

            self.lista.procesarCita()
            ''' o Mediante la cola, el sistema procesará las citas en orden de llegada. Al
                procesar una cita, se actualizará su estado a &quot;Completada&quot; y se eliminará de
                la cola de pendientes.
                o Este proceso se registra en el historial para poder deshacer el procesamiento
                si es necesario.'''
          elif opcion == 6:
             '''o Implementar una funcionalidad para revertir la última operación registrada
                (ya sea creación, modificación, cancelación o procesamiento de una cita)
                utilizando la pila de historial.'''
          elif opcion == 7:
             self.lista.showHistorial()
          elif opcion == 8:
             self.lista.showCola()
          elif opcion == 0:
             print("Saliendo")
             opcion = 0
             

             
             


             




menu = Menu()
menu.mostrar()            