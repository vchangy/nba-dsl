import scala.language.implicitConversions

object NBADSL {
  def main(args: Array[String]) {
    val player = new Player()
    val map = player.readInPlayers()
    val parser = NBAParser
    val nba_text = io.Source.fromFile(args(0)).mkString

    val result = parser.doMatch(nba_text)

    for (query <- result) {
      val comp = new Comparisons
      if (query.action.equals("comparison")) {
        val p1 = map.get(query.players.head)
        val p2 = map.get(query.players.last)
        val winner = comp.compareBasicStat(p1, p2, query.stats.head)
        var loser = p1
        if (p1.equals(winner)) {
          loser = p2
        }
        println(winner.name + " is better at " + query.stats.head + " than " + loser.name)
      }
      if (query.action.equals("getstat")) {
        val p1 = map.get(query.players.head)
        val num = comp.whatIfPoints(p1, query.time, query.stats.head)
        println(p1.name + " would have " + num + " " + query.stats.head + " if he played " + query.time + " minutes")
      }
      if (query.action.equals("mvp")) {
        val p1 = map.get(query.players.head)
        val p2 = map.get(query.players.last)
        var ptsWeight = 1.0
        var rebWeight = 1.0
        var astWeight = 1.0

        val winner = comp.betterPlayer(p1, p2, ptsWeight, rebWeight, astWeight)
        println("of " + p1.name + " and " + p2.name + ", " + winner.name + " should win mvp")
      }
    }

  }
}
