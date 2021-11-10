 case class Trade private(val Id: Int, val symbol: String,
            val qty: Int ,var price: Double) {

  require(qty>0)

//  override def toString: String = s"Trade ID: $Id,\n" +
//    s"Item Symbol: $symbol\nQuantity: $qty\nUnit Price: $price"

//  calculating the value of the price
  def value(): Double = {
    qty * price
  }


}

//object Trade{
//
////  Companion Object
// def apply( Id: Int,  symbol: String,  qty: Int, price: Double):
// Trade={ new Trade(Id, symbol, qty, price)}
//
//}
