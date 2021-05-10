fun main() {

    var meloman: Boolean = false

    while (true) {
        println("________________________________________")
        println("Enter the amount of new Purchase.")
        var newPurchase = readLine()?.toDouble();

        println("Are you a regular customer? y/n")
        val melomanInput = readLine();
        if (melomanInput == "y") {
            meloman = true
        }

        println("Enter the amount of previous Purchase.")
        val previousPurchase = Integer.parseInt(readLine());

        if (1000 < previousPurchase && previousPurchase <= 10000) {
            println("Discount is 100 rubles!")
            if (newPurchase != null) {
                newPurchase = newPurchase - 100
            }

        }
        if (10001 < previousPurchase) {
            println("Discount is 5%  of amount Purchase!")
            if (newPurchase != null) {
                newPurchase = newPurchase - (newPurchase / 100) * 5
            }

        }
        if (meloman == true) {
            println("Discount is 1%  of amount Purchase!")
            if (newPurchase != null) {
                newPurchase = newPurchase - newPurchase / 100
            }

        }

        println("Result amount is $newPurchase")
    }
}

