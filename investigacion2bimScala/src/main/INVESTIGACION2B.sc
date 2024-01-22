import akka.actor.{Actor, ActorSystem, Props}

// Definimos el mensaje que los actores van a intercambiar
case class Mensaje(mensaje: String)

// Definimos el actor Observador
class Observador extends Actor {
  def receive: Receive = {
    case Mensaje(mensaje) => println(s"Observador recibió: $mensaje")
  }
}

// Definimos el actor Sujeto
class Sujeto extends Actor {
  def receive: Receive = {
    case Mensaje(mensaje) =>
      println(s"Sujeto recibió: $mensaje")
      context.system.actorSelection("/user/observador") ! Mensaje("Hola Observador")
  }
}

// Creamos el sistema de actores
val system = ActorSystem("SistemaDeActores")

// Creamos los actores
val observador = system.actorOf(Props[Observador], "observador")
val sujeto = system.actorOf(Props[Sujeto], "sujeto")

// El sujeto envía un mensaje
sujeto ! Mensaje("HOLAA!!")




