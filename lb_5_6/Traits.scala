package ua.nure.msit.lb_5_6

trait ActionResult

case object KeepGoing extends ActionResult
case object GotGold extends ActionResult
case object AgentDied extends ActionResult

trait Direction

case object Up extends Direction
case object Down extends Direction
case object Left extends Direction
case object Right extends Direction

trait SpeleologistAction

case object Climb extends SpeleologistAction
case object Forward extends SpeleologistAction
case object TurnLeft extends SpeleologistAction
case object TurnRight extends SpeleologistAction
case object Grab extends SpeleologistAction
case object Shoot extends SpeleologistAction

trait Look
case object LookUp extends Look
case object LookDown extends Look
case object LookLeft extends Look
case object LookRight extends Look

