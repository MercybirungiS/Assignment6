fun main() {
var description=Car ("Honda","Accord","Blue",5)
    description .carry(6)
    description .carry(3)
    description .identity()
    println( description .calculateParkingFees(4))
      var type=Bus("Toyota","coach","White",50)
    println(type.maxTripFare(500.toDouble()))
    println(type.calculateParkingFees(9))


}
open class Car(var make:String , var model:String , var color:String , var capacity:Int ){
    fun carry(people:Int){
        var x =people-capacity
        if(people <=capacity ){
            println("Carrying $people passengers")
        }
        else{
            println("over capacity by $x people")
        }
    }
    fun identity(){
        println(" I am a $color $make $model.")
    }
    open fun calculateParkingFees (hours:Int):Int{
        return hours*20
    }
}

class Bus(make: String,model: String,color: String,capacity: Int):Car(make, model, color, capacity){
    fun maxTripFare(fare:Double):Double {
        return capacity *fare

    }

    override fun calculateParkingFees(hours: Int): Int {
        return hours*capacity
    }
    }













