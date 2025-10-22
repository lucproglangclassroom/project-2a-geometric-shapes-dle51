package edu.luc.cs.laufer.cs371.shapes

import org.scalatest.funsuite.AnyFunSuite
import com.typesafe.scalalogging.LazyLogging
import TestFixtures.*
import Shape.*

class TestScale extends AnyFunSuite with LazyLogging:

  test("simple ellipse scale by 2"):
    logger.info("Testing scale for: simple ellipse by factor 2.0")
    val shape = simpleEllipse
    val factor = 2.0
    logger.debug(s"Original shape: $shape, Factor: $factor")
    val result = scale(shape, factor)
    val expected = Ellipse(100, 60)
    logger.info(s"Expected: $expected, Actual: $result")
    assert(result == expected)

  test("simple rectangle scale by 2"):
    logger.info("Testing scale for: simple rectangle by factor 2.0")
    val shape = simpleRectangle
    val factor = 2.0
    logger.debug(s"Original shape: $shape, Factor: $factor")
    val result = scale(shape, factor)
    val expected = Rectangle(160, 240)
    logger.info(s"Expected: $expected, Actual: $result")
    assert(result == expected)

  test("simple location scale by 2"):
    logger.info("Testing scale for: simple location by factor 2.0")
    val shape = simpleLocation
    val factor = 2.0
    logger.debug(s"Original shape: $shape, Factor: $factor")
    val result = scale(shape, factor)
    val expected = Location(140, 60, Rectangle(160, 240))
    logger.info(s"Expected: $expected, Actual: $result")
    assert(result == expected)

  test("basic group scale by 0.5"):
    logger.info("Testing scale for: basic group by factor 0.5")
    val shape = basicGroup
    val factor = 0.5
    logger.debug(s"Original shape: $shape, Factor: $factor")
    val result = scale(shape, factor)
    val expected = Group(Ellipse(25, 15), Rectangle(10, 20))
    logger.info(s"Expected: $expected, Actual: $result")
    assert(result == expected)

  test("simple group scale by 2"):
    logger.info("Testing scale for: simple group by factor 2.0")
    val shape = simpleGroup
    val factor = 2.0
    logger.debug(s"Original shape: $shape, Factor: $factor")
    val result = scale(shape, factor)
    val expected = Group(
      Location(400, 200, Ellipse(100, 60)),
      Location(800, 600, Rectangle(200, 100))
    )
    logger.info(s"Expected: $expected, Actual: $result")
    assert(result == expected)

  test("complex group scale by 0.5"):
    logger.info("Testing scale for: complex group by factor 0.5")
    val shape = complexGroup
    val factor = 0.5
    logger.debug(s"Original shape: $shape, Factor: $factor")
    val result = scale(shape, factor)
    val expected = Location(25, 50,
      Group(
        Ellipse(10, 20),
        Location(75, 25,
          Group(
            Rectangle(25, 15),
            Rectangle(150, 30),
            Location(50, 100,
              Ellipse(25, 15)
            )
          )),
        Rectangle(50, 100)
      ))
    logger.info(s"Expected: $expected, Actual: $result")
    assert(result == expected)

end TestScale