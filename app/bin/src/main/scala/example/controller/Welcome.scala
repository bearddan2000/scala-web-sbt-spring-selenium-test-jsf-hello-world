package example.controller;

import javax.enterprise.context.RequestScoped
import javax.inject.Named
import scala.beans.BeanProperty

@Named
@RequestScoped
class Welcome {

 @BeanProperty
  var firstName: String = ""

 @BeanProperty
  var lastName: String = ""

  def showGreeting(): String = "Hello " + firstName + " " + lastName + "!"
}
