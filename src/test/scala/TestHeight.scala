package edu.luc.cs.laufer.cs371.shapes

import org.scalatest.funsuite.AnyFunSuite
import org.slf4j.LoggerFactory
import TestFixtures.*
import Shape.*

class TestHeight extends AnyFunSuite:
  
  private val logger = LoggerFactory.getLogger(getClass)

  test("simple ellipse"):
    logger.info("Testing height for: simple ellipse")
    val shape = simpleEllipse
    logger.debug(s"Shape: $shape")
    val result = height(shape)
    logger.info(s"Expected: 1, Actual: $result")
    assert(result == 1)

  test("simple rectangle"):
    logger.info("Testing height for: simple rectangle")
    val shape = simpleRectangle
    logger.debug(s"Shape: $shape")
    val result = height(shape)
    logger.info(s"Expected: 1, Actual: $result")
    assert(result == 1)

  test("simple location"):
    logger.info("Testing height for: simple location")
    val shape = simpleLocation
    logger.debug(s"Shape: $shape")
    val result = height(shape)
    logger.info(s"Expected: 2, Actual: $result")
    assert(result == 2)

  test("basic group"):
    logger.info("Testing height for: basic group")
    val shape = basicGroup
    logger.debug(s"Shape: $shape")
    val result = height(shape)
    logger.info(s"Expected: 2, Actual: $result")
    assert(result == 2)

  test("simple group"):
    logger.info("Testing height for: simple group")
    val shape = simpleGroup
    logger.debug(s"Shape: $shape")
    val result = height(shape)
    logger.info(s"Expected: 3, Actual: $result")
    assert(result == 3)

  test("complex group"):
    logger.info("Testing height for: complex group")
    val shape = complexGroup
    logger.debug(s"Shape: $shape")
    val result = height(shape)
    logger.info(s"Expected: 6, Actual: $result")
    assert(result == 6)

end TestHeight