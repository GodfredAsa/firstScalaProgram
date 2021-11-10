import org.scalatest.matchers.must.Matchers
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

import scala.language.postfixOps

class TradeTest extends  AnyFlatSpec with Matchers{

  "Trade" should "total cost of the item" in{
    val t =  Trade(1, "AAPL", 10, 20.0)
    t.value() should be (200.0)
  }


  "Trade symbol" should "AAPL" in{
    val t =  Trade(1, "AAPL", 10, 20.0)
    t.symbol should be ("AAPL")
  }



}
