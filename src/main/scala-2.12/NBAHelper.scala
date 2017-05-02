class NBAQuery(_action : String, _players: List[String], _stats: List[String], _num: Int,
               _time: String)  {
  def action = _action
  def players = _players
  def stats = _stats
  def time = _time match {
    case m if _time.equals("minute") => _num * 1
    case g if _time.equals("game") => _num * 48
    case s if _time.equals("season") => _num * 48 * 82
  }
}