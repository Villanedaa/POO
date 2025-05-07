import random

class Nodo:
 id = 0
 def __init__(self,nombrePaciente,nombreDoctor,horaCita,estadoCita):
         # se crea la variable ID de manera aleatoria, La cual corresponde al ID de la cita
         

         
         self.siguiente = None
         self.idCita = Nodo.id
         Nodo.id += 1
         self.nombrePaciente = nombrePaciente
         self.nombreDoctor = nombreDoctor
         self.horaCita = horaCita
         self.estadoCita = estadoCita

#setter para el id de la cita
 def setId(self,id):
     self.id = id

#setter para el nombre del paciente
 def setNombrePaciente(self,nombrePaciente):
     self.nombrePaciente = nombrePaciente

 def getNombrePaciente(self):
     return self.nombrePaciente

#setter para el nombre del doctor
 def setNombreDoctor(self,nombreDoctor):
     self.nombreDoctor = nombreDoctor
 
 def getNombreDoctor(self):
     return self.nombreDoctor

#setter para el estado de la cita
 def setEstadoCita(self,estadoCita):
     self.estadoCita = estadoCita
 
 def getEstado(self):
     return self.estadoCita

#setter para el horario
 def setHorario(self,horaCita):
     self.horaCita = horaCita
 def getHorario(self):
     return self.horaCita
    

 def __str__(self):
    return (self.nombrePaciente,self.nombreDoctor,self.horaCita,self.estadoCita)