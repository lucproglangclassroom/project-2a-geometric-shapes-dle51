package edu.luc.cs.laufer.cs371.shapes
// main/scala/boundingBox.scala

import Shape.*

object boundingBox:
  def apply(s: Shape): Location = s match
    case Rectangle(width, height) =>
      Location(0, 0, Rectangle(width, height))
    
    case Ellipse(halfWidth, halfHeight) =>
      Location(-halfWidth, -halfHeight, Rectangle(2 * halfWidth, 2 * halfHeight))
    
    case Location(x, y, shape) =>
      boundingBox(shape) match
        case Location(innerX, innerY, Rectangle(width, height)) =>
          Location(x + innerX, y + innerY, Rectangle(width, height))
    
    case Group(shapes*) =>
      if shapes.isEmpty then
        Location(0, 0, Rectangle(0, 0))
      else
        val boxes = shapes.map(shape => boundingBox(shape))
        
        val Location(initX, initY, Rectangle(initW, initH)) = boxes.head
        
        val (minX, minY, maxX, maxY) = boxes.tail.foldLeft((initX, initY, initX + initW, initY + initH)) {
          case ((accMinX, accMinY, accMaxX, accMaxY), Location(x, y, Rectangle(w, h))) =>
            (
              accMinX min x,         
              accMinY min y,     
              accMaxX max (x + w),   
              accMaxY max (y + h)   
            )
        }
        
        Location(minX, minY, Rectangle(maxX - minX, maxY - minY))

end boundingBox
