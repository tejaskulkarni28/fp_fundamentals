package PatternMatching
import scala.util.Random
object Lab1 extends App {
  // 1. Composition PM
  // 2. Sealed PM

  // 1. Composition PM
  val random = new Random()
  val randomNumber = random.nextInt(3)

  println(randomNumber)

  private val matchRandomNumber = randomNumber match{
    case 1 => "Number 1"
    case 2 => "Number 2"
    case 3 => "Number 3"
    case _ => "Something else" // <- wildcard underscore
  }
  println(matchRandomNumber)

  // 2. Sealed PM // sender: String, title: String, body: String
  sealed trait Notification
  case class SMS(sender: String , title: String, body: String) extends Notification
  case class Mail(sender: String, title: String, body: String) extends Notification
  case class VoiceRecording(contactName: String, link: String) extends Notification

  def showNotification(notification: Notification):String={
    notification match {
      case SMS(sender, _, _) => s"You have got an SMS from $sender"
      case Mail(sender, _, _) => s"You have got an MAIL from $sender"
      case VoiceRecording(sender, _) => s"You have got an VR from $sender"
      case _ => "Be cautious!!! something different!" // wildcard default if no match
    }
  }
  val returnOutput = showNotification(new SMS("Shantanu", "Job", "---"))
  println(returnOutput)

  val impPeople:Seq[String] = Seq("Tejas", "Shantanu")

  // Pattern Guards
  def showSelectedNotifications(notification: Notification, impPeopleInfo:Seq[String]):String={
    notification match {
      case SMS(sender, _, body) if(impPeopleInfo.contains(sender)) => s"$body"
      case Mail(sender, _, body) if(impPeopleInfo.contains(sender)) => s"$sender"
      case VoiceRecording(contactName, _) if(impPeopleInfo.contains(contactName)) => s"$contactName"
      case _ => s"Something different!!! Be cautious!!"
    }
  }

  val returnSelectedOutput = showSelectedNotifications(new Mail("Tushar", "Message", "Body"), impPeople)
  println(returnSelectedOutput)
  val returnSelectedOutput1 = showSelectedNotifications(new Mail("Tejas", "Message", "Body"), impPeople)
  println(returnSelectedOutput1)


  // Matching type only
  sealed class Device
  sealed case class Apple(model: String) extends Device
  sealed case class Android(model: String) extends Device

  def matchType(device: Device):String = {
    device match {
      case apple: Apple => s" This is type apple"
      case android: Android => s"This is type android"
      case _ => s"Maybe some another type!!!"
    }
  }
  println(matchType(new Apple("Iphone11")))
}
