#Author: your.email@your.domain.com

@Regresion

Feature: Contactenos Universidad EAFIT

  Como estudiante

       Quiero enviar un comentario a la Universidad EAFIT

       A través de la pagina de Contáctenos

 

  @Comentario

  Scenario: Envio comentario Universidad EAFIT

    Given que Yeison quiere escribir un comentario a la Universidad EAFIT

    When el diligencia el comentario

             |nombre        |correo           |telefono     |ciudad      |comentario  |
             |Yeison Arias  |yarias@correo.com|2222222      |Medellin    |Excelente universidad|

    Then el visualiza el pantalla el mensaje Muchas gracias por su comentario.
