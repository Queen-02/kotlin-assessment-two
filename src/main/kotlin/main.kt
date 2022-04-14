fun main(){
    var salaryAccount = CurrentAccount("126479062", "James Karanja", 55000)
}
class CurrentAccount(var accountNumber: String, var accountName: String, var balance: Int){
    fun deposit(amount: Double){
        var total = amount + balance
        println(total)
    }
}