
fun main() {
    var d = D()
    d.foo()
    line()
    d.bar()
}
fun main1() {
    var c1 = Circle(100, 100, 50)
    c1.draw()

    line()

    var r1 = Rect(200, 200, 30, 30)
    r1.draw()

    line()

    //var s : Shape = c1
    var s : Shape = r1
    s.draw()
    //s.setRadius()
    if(s is Circle) {
        (s as Circle).setRadius(90)
    }
    if(s is Rect) {
        s.setWidth(40)
    }
    s.draw()
}

fun line() {
    println("--------------------------")
}