/**
  * Created by vanessa on 4/23/17.
  */
import scala.util.parsing.combinator.syntactical._


class NBAParser {

  object NBADSL extends StandardTokenParsers {
    lexical.delimiters ++= List("?", ",")
    lexical.reserved += ("who", "is", "better", "at", "versus", "rebounds", "assists", "blocks", "points", "westbrook", "harden", "butler")

    def better_at =
      "who" ~> "is" ~> "better" ~> "at" ~> bball_stat

    def bball_stat = ("rebounds" | "assists" | "points" | "blocks") <~ "," ~> player_comp

    def player_comp =  player_name <~ "versus" ~> player_name

    def player_name = "westbrook" | "harden" | "butler"

    def doMatch() {
      val dsl =
        "who is better at rebounds, westbrook versus harden?"
      better_at(new lexical.Scanner(dsl)) match {
        case Success(ord, _) => println(ord) // ord is a ClientOrder
        case Failure(msg, _) => println(msg)
        case Error(msg, _) => println(msg)
      }
    }
  }

}

object TestDSL {
  def main(args: Array[String]) = {
    val testClass = new NBAParser
    testClass.NBADSL.doMatch()
  }
}