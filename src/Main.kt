//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    nameAndGreetings ("kuria")
    modulus(num1 = 9.1, num2 = 4)
    add(a = 50, b = 70, c =30, d=45)
    anInterestingFact("I love food")

}

fun nameAndGreetings(name: String) {
println("Hello $name")
}
fun modulus(num1:Double, num2:Int){
    var result = num1%num2
    println(result)
}
fun add(a:Int, b:Int, c:Int, d:Int){
    var sum = a+b+c+d
    println(sum)
}
fun anInterestingFact(interest:String){
    println(interest)

}
