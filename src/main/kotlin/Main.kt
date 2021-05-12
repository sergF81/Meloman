fun main() {

    while (true) {
        println("________________________________________")
        println("Enter the amount of new Purchase.")
        var newPurchase = readLine()?.toDouble();

        println("Are you a regular customer? y/n")
        var melomanInput = readLine();

        println("Enter the amount of previous Purchase.")
        val previousPurchase = Integer.parseInt(readLine());

        newPurchase = when {
            1000 < previousPurchase && previousPurchase <= 10000 -> {
                println("Discount is 100 rubles!")
                newPurchase?.minus(100)
            }
            10001 < previousPurchase -> {
                println("Discount is 5%  of amount Purchase!")
                newPurchase?.minus((newPurchase / 100) * 5)
            }
            else -> newPurchase
        }
        if (melomanInput == "y") {
            println("Discount is 1%  of amount Purchase!")
            newPurchase = newPurchase?.minus(newPurchase / 100)
        }
        println("Result amount is $newPurchase")
    }
}

