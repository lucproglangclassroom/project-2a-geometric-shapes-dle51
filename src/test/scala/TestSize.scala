package edu.luc.cs.laufer.cs371.shapes

import org.scalatest.funsuite.AnyFunSuite
import org.slf4j.LoggerFactory
import TestFixtures.*
import Shape.*

class TestSize extends AnyFunSuite:
  
  private val logger = LoggerFactory.getLogger(getClass)

  test("simple ellipse"):
    logger.info("Testing size for: simple ellipse")
    val shape = simpleEllipse
    logger.debug(s"Shape: $shape")
    val result = size(shape)
    logger.info(s"Expected: 1, Actual: $result")
    assert(result == 1)

  test("simple rectangle"):
    logger.info("Testing size for: simple rectangle")
    val shape = simpleRectangle
    logger.debug(s"Shape: $shape")
    val result = size(shape)
    logger.info(s"Expected: 1, Actual: $result")
    assert(result == 1)

  test("simple location"):
    logger.info("Testing size for: simple location")
    val shape = simpleLocation
    logger.debug(s"Shape: $shape")
    val result = size(shape)
    logger.info(s"Expected: 1, Actual: $result")
    assert(result == 1)

  test("basic group"):
    logger.info("Testing size for: basic group")
    val shape = basicGroup
    logger.debug(s"Shape: $shape")
    val result = size(shape)
    logger.info(s"Expected: 2, Actual: $result")
    assert(result == 2)

  test("simple group"):
    logger.info("Testing size for: simple group")
    val shape = simpleGroup
    logger.debug(s"Shape: $shape")
    val result = size(shape)
    logger.info(s"Expected: 2, Actual: $result")
    assert(result == 2)

  test("complex group"):
    logger.info("Testing size for: complex group")
    val shape = complexGroup
    logger.debug(s"Shape: $shape")
    val result = size(shape)
    logger.info(s"Expected: 5, Actual: $result")
    assert(result == 5) 

end TestSize