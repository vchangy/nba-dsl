class NBAQuery(_action : String, _players: List[String], _stats: List[String], _num: Int,
               _time: String)  {
  def action = _action
  def players = _players
  def stats = _stats
  def num = _num
  def time = _time
}