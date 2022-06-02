open class Shape(var x : Int, var y : Int) {

    constructor() : this(0, 0)

    open fun draw() = println("x = $x y = $y")

}

class Circle(x : Int, y : Int, var r : Int) : Shape(x, y) {

    override fun draw() {
        super.draw()
        println("r = $r")
    }

    fun setRadius(r : Int) {
        this.r = r
    }

    fun getRadius() = this.r

}

class Rect(x : Int, y : Int, var w : Int, var h : Int) : Shape(x, y) {

    override fun draw() {
        super.draw()
        println("w = $w h = $h")
    }

    fun setWidth(w : Int) {
        this.w = w
    }
}



interface A {
    fun foo() = println("A.foo")
    fun bar() = println("A.bar")
}

interface B {
    fun foo() = println("B.foo")
    fun bar() = println("B.bar")
}


class D : A , B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
        println("D.foo")
    }

    override fun bar() {
        super<A>.bar()
        super<B>.bar()
        println("D.bar")
    }
}





