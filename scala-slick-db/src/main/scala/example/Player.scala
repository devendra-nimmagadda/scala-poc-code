package example
import java.time.LocalDate

case class Player(id:Long, name:String, country:String, dob:Option[LocalDate])
