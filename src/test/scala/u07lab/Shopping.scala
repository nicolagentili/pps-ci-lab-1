package u07lab

import org.scalatest.{FlatSpec, FunSpec, FunSuite}

class SetSuite extends FunSuite {
  test("An empty cart should have size 0") {
    val cart:BasicCart = new BasicCart
    assert(cart.size == 0)
  }

  test("An empty cart should have totalCost 0") {
    val cart:BasicCart = new BasicCart
    assert(cart.totalCost == 0)
  }

  test("Adding two products to a cart size should be 2") {
    val cart:BasicCart = new BasicCart
    val item1:Item = Item(Product("Product A"), ItemDetails(1, Price(100)))
    val item2:Item = Item(Product("Product B"), ItemDetails(3, Price(50)))
    cart.add(item1)
    cart.add(item2)
    assert(cart.size == 2)
  }

}

class SetSpec extends FlatSpec {
  "An empty cart" should "have size 0 and totalCost 0" in {
    val cart:BasicCart = new BasicCart
    assert((cart.size == 0) && (cart.totalCost == 0))
  }

  "An empty cart" should "have totalCost 0" in {
    val cart:BasicCart = new BasicCart
    assert(cart.totalCost == 0)
  }

  "Adding two products (1x100 and 3x50) the cart " should " have size 2 and totalCost 250" in {
    val cart:BasicCart = new BasicCart
    val item1:Item = Item(Product("Product A"), ItemDetails(1, Price(100)))
    val item2:Item = Item(Product("Product B"), ItemDetails(3, Price(150)))
    cart.add(item1)
    cart.add(item2)
    assert((cart.size == 2) && (cart.totalCost == 250))
  }

}

class SetFunSpec extends FunSpec {
  describe("A cart") {
    describe ("when empty") {
      it("should have size 0") {
        val cart:BasicCart = new BasicCart
        assert(cart.size == 0)
      }
      it("should have totalCost 0") {
        val cart:BasicCart = new BasicCart
        assert(cart.totalCost == 0)
      }
    }
    describe ("adding two times" ) {
      it ("should have size 2") {
        val cart:BasicCart = new BasicCart
        val item1:Item = Item(Product("Product A"), ItemDetails(1, Price(100)))
        val item2:Item = Item(Product("Product B"), ItemDetails(3, Price(50)))
        cart.add(item1)
        cart.add(item2)
        assert(cart.size == 2)
      }
    }
  }
}