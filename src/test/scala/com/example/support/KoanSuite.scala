package com.example.support

import org.scalatest._
import org.scalatest.events.Event
import org.scalatest.events.TestSucceeded

trait KoanSuite extends FunSuite {
  /*override def runTests(testName: Option[String], reporter: Reporter, stopper: Stopper, filter: Filter,
                        configMap: Map[String, Any], distributor: Option[Distributor], tracker: Tracker) {

    if (testName == null)
      throw new NullPointerException("testName was null")
    if (reporter == null)
      throw new NullPointerException("reporter was null")
    if (stopper == null)
      throw new NullPointerException("stopper was null")
    if (filter == null)
      throw new NullPointerException("filter was null")
    if (configMap == null)
      throw new NullPointerException("configMap was null")
    if (distributor == null)
      throw new NullPointerException("distributor was null")
    if (tracker == null)
      throw new NullPointerException("tracker was null")

    class KoanReporter(wrappedReporter: Reporter) extends Reporter {
      var succeeded = false

      override def apply(event: Event) = {
        event match {
          case e: TestSucceeded => succeeded = true
          case _ =>
        }
        wrappedReporter(event)
      }
    }

    val stopRequested = stopper

    // If a testName is passed to run, just run that, else run the tests returned
    // by testNames.
    testName match {
      case Some(tn) => runTest(tn, Args(reporter,
        stopRequested,
        filter,
        new ConfigMap(configMap),
        None,
        tracker,
        Set.empty))
      case None =>
        val tests = testNames.iterator
        var failed = false
        for (test <- tests) {
          if (failed == false) {
            val koanReporter = new KoanReporter(reporter)
            //runTest(test, koanReporter, stopper, configMap, tracker)
            runTest(test, Args(reporter,
              stopRequested,
              filter,
              new ConfigMap(configMap),
              None,
              tracker,
              Set.empty))
            failed = !koanReporter.succeeded
          }
        }
    }
  }*/

  def koan(name: String)(fun: => Unit) = test(name.stripMargin)(fun)
}
