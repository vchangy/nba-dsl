/**
  * Created by vanessa on 4/23/17.
  */
import scala.language.implicitConversions
import scala.util.parsing.combinator.syntactical.StandardTokenParsers


class NBAParser {

  object NBADSL extends StandardTokenParsers {
    lexical.delimiters ++= List("?", ",")
    lexical.reserved += ("who", "is", "better", "at", "or", "how", "many", "does", "average", "per",
      "rebounds", "assists", "blocks", "points", "westbrook", "harden", "butler", "minute", "game", "season")

    def query : Parser[List[NBAQuery]] = repsep(query_opts, "?")

    def query_opts : Parser[NBAQuery] = how_many | better_at

    def how_many : Parser[NBAQuery] =
      "how" ~ "many" ~ bball_stat ~ "does" ~ player_name ~ "average" ~ "per" ~ numericLit ~ time_unit ^^ {
        case h ~ m ~ stat ~ d ~ p1 ~ a ~ p ~ x ~ time => new NBAQuery("getstat", List(p1), List(stat), x.toInt, time)
      }

    def better_at : Parser[NBAQuery] =
      "who" ~ "is" ~ "better" ~ "at" ~ bball_stat ~ "," ~ player_name ~ "or" ~ player_name ^^ {
        case w ~ i ~ b ~ a ~ stat ~ c ~ p1 ~ o ~ p2 => new NBAQuery("comparison", List(p1, p2), List(stat), -1, "")
      }

    def bball_stat : Parser[String] = "rebounds" | "assists" | "points" | "blocks"

    def player_name : Parser[String] = "westbrook" | "harden" | "butler"

    def time_unit : Parser[String]= "minute" | "game" | "season"

    def doMatch() {
      val dsl =
        "who is better at rebounds, westbrook or harden? how many points does butler average per 1 game?"
      query(new lexical.Scanner(dsl)) match {
        case Success(ord, _) => println(ord)
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