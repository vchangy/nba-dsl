/**
  * Created by vanessa on 4/23/17.
  */
import scala.language.implicitConversions
import scala.util.parsing.combinator.syntactical._



object NBAParser extends StandardTokenParsers {
  lexical.delimiters ++= List("?", ",")
  lexical.reserved += ("who", "is", "better", "at", "or", "how", "many", "does", "average", "per", "should", "win", "mvp",
    "rebounds", "assists", "blocks", "points", "steals", "turnovers", "westbrook", "harden", "butler", "leonard",
    "james", "minute", "game", "season")

  def query : Parser[List[NBAQuery]] = repsep(query_opts, "?")

  def query_opts : Parser[NBAQuery] = how_many | better_at | overall_comp

  def how_many : Parser[NBAQuery] =
    "how" ~ "many" ~ bball_stat ~ "does" ~ player_name ~ "average" ~ "per" ~ numericLit ~ time_unit ^^ {
      case h ~ m ~ stat ~ d ~ p1 ~ a ~ p ~ x ~ time => new NBAQuery("getstat", List(p1), List(stat), x.toInt, time)
    }

  def better_at : Parser[NBAQuery] =
    "who" ~ "is" ~ "better" ~ "at" ~ bball_stat ~ "," ~ player_name ~ "or" ~ player_name ^^ {
      case w ~ i ~ b ~ a ~ stat ~ c ~ p1 ~ o ~ p2 => new NBAQuery("comparison", List(p1, p2), List(stat), -1, "")
    }

  def overall_comp : Parser[NBAQuery] =
    "who" ~ "should" ~ "win" ~ "mvp" ~ "," ~ player_name ~ "or" ~ player_name ^^ {
      case w ~ s ~ wi ~ m ~ c ~ p1 ~ o ~ p2 => new NBAQuery("mvp", List(p1, p2), List(), -1, "")
    }
  def bball_stat : Parser[String] = "rebounds" | "assists" | "points" | "blocks" | "steals" | "turnovers"

  def player_name : Parser[String] = "westbrook" | "harden" | "butler" | "leonard" | "james"

  def time_unit : Parser[String]= "minute" | "game" | "season"

  def doMatch(in: String) : List[NBAQuery] = query(new lexical.Scanner(in)).get
}

