/*
rule = "Collection213Roughly"
Collection213Roughly = {
  withLazyAppendedAll = true
  withLazyList = true
}
 */
package fix

object RoughlySrc213 {
  val s = Stream(1, 2, 3)
  s.append(List(4, 5, 6))
  1 #:: 2 #:: 3 #:: Stream.Empty
  val isEmpty: Stream[_] => Boolean = {
    case x #:: xs => false
    case _        => true
  }
}
