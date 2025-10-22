package edu.luc.cs.laufer.cs371.shapes

import Shape.*

object size:
  def apply(s: Shape): Int = s match
    case Rectangle(_, _) =>
      1
    
    case Ellipse(_, _) =>
      1
    
    case Location(_, _, shape) =>
      size(shape)
    
    case Group(shapes*) =>
      shapes.map(shape => size(shape)).sum

end size
