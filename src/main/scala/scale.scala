package edu.luc.cs.laufer.cs371.shapes

import Shape.*

object scale:
  def apply(s: Shape, factor: Double): Shape = s match
    case Rectangle(width, height) =>
      Rectangle((width * factor).toInt, (height * factor).toInt)
    
    case Ellipse(halfWidth, halfHeight) =>
      Ellipse((halfWidth * factor).toInt, (halfHeight * factor).toInt)
    
    case Location(x, y, shape) =>
      Location((x * factor).toInt, (y * factor).toInt, scale(shape, factor))
    
    case Group(shapes*) =>
      Group(shapes.map(shape => scale(shape, factor))*)

end scale
