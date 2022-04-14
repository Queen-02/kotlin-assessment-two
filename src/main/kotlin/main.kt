fun main(){
    //question one
    var salaryAccount = CurrentAccount("126479062", "James Karanja", 55000)
    salaryAccount.deposit(5000.00)
    println(salaryAccount.balance)
    salaryAccount.withdraw(500.00)
    println(salaryAccount.balance)
    salaryAccount.details()

    //question two
    var openAccount = SavingAccount("101247896", "Martha Mutua", 60000, 10)
    openAccount.withdraw()

    //question three
    var commodities = Product("Food Items", "55kg", 5000, listOf("Groceries", "Hygiene"))
    commodities.prod("Veggies")
    //question four
    println(evenIndeces())
}

//create a class current account
open class CurrentAccount(var accountNumber: String, var accountName: String, var balance: Int){
    //deposit function that increments the
    // amount of cash in the account
    fun deposit(amount: Double){
        var total = amount + balance
        println(total)
    }

    //withdraw function decrements the
    //balance by the amount withdrawn
   open fun withdraw(amount: Double){
        var remainingBalance = balance - amount
        println(remainingBalance)
    }

    //function that prints out the account details
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
}

class SavingAccount(accountNumber: String, accountName: String, balance: Int, var withdrawals: Int): CurrentAccount(accountName, accountNumber, balance){
    fun withdraw() {
//        super.withdraw(amount)
        if (withdrawals< 4){
            println("Can withdraw")
        }else{
           println(withdrawals++)
        }
    }
}

data class Product(var name: String, var weight: String, var price: Int, var category: List<String>){
    fun prod (product: String){
        when(product){
            "Veggies" -> println(category[0])
            "Gloves" -> println(category[1])
            else -> println("Not found")
        }
    }

}
fun evenIndeces(): String{
    var fruit  = "Guava"
    if (fruit%2==0){

    }
    return (fruit)
}



















