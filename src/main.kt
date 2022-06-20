fun main(){
    var currentaccount = CurrentAccount("567890234","Julliet Nakayiza",230980.56)
    currentaccount.deposit(50000.00)
    currentaccount.withdraw(2000.00)
    println(currentaccount.details())
}
open class CurrentAccount(var accountNumber: String,var accountName:String, var balance: Double){
    fun deposit(amount: Double){
        balance+=amount
        println(balance)
    }
    open fun withdraw(amount: Double){
        balance-=amount
        println(balance)
    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }

}
class SavingAccount( accountNumber: String,accountName: String,balance: Double, var withdrawals: Int):CurrentAccount(accountNumber,accountName,balance){

    override fun withdraw(amount: Double) {

    }

}

data class Products(var name: String,var weight:Double,var price: Double,var category:String)
fun evenStrings(strings:String):String{
    var output =""
    for (index in strings)
        if (index %2==0){
            output+=""
        }

    return output
}


