fun main(){
    println(array("ivonne","mutua","adhiambo","daiana"))
    println(max(66,77,2))
    println(done("character"))


}
fun array(joy:String,mercy:String,stacy:String,cynthia:String){
    var stop :Array<String> = arrayOf(joy,mercy,stacy,cynthia)
    println(stop.contentToString())
}
//Write a Kotlin program to find the maximum and minimum of three numbers.
fun max(num1: Int,num2: Int,num3: Int){

    if (num1>num2 && num1>num3 ){
        println("Num1 is the maximum $num1")
    }else if (num2>num1 && num2>num3){
        println("num2 is the maximum $num2")
    }else if (num3>num1 && num3>num2){
        println("num3 is the maximum $num3")
    }
    else{
        println("minimum")
    }

}
fun done(word:String){

        println(word[0])
        println(word[1])
        println(word[2])
        println(word[3])
        println(word[4])

}