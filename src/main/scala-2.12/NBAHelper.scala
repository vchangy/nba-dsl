class NBAQuery(_action : String, _players: List[String], _stats: List[String], _num: Int,
               _time: String)  {
  def action = _action
  def players = _players
  def stats = _stats
  def time = _time match {
    case m if _time.equals("minutes") => _num * 1
    case g if _time.equals("games") => _num * 48
    case s if _time.equals("seasons") => _num * 48 * 82
  }
}

class NBAResult(_p1 : Player, _p2 : Player, _winner : Player, _stat : String, _num : Double, _time : Int) {
  def p1 = _p1
  def p2 = _p2
  def winner = _winner
  def stat = _stat
  def num = _num
  def time = _time
}