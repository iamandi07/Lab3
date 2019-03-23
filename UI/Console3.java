package UI;

import Domain.Card;
import Domain.Car;
import Domain.Transaction;
import Service.CarService;
import Service.CardService;
import Service.TransactionService;

import java.util.*;

public class Console3 {

    private CarService carService;
    private CardService cardService;
    private TransactionService transactionService;
    private Scanner scanner;

    public Console3(CarService carService, CardService cardService,TransactionService transactionService)
    {
        this.carService = carService;
        this.cardService = cardService;
        this.transactionService = transactionService;
        this.scanner = new Scanner(System.in);
    }

    public void allInOneInput() {
        while (true) {
            System.out.println("Add operation: ");
            String input = new Scanner(System.in).nextLine();
            String[] parts = input.split(",");
            switch (parts[0]) {
                case "addCar":
                    carService.AddAndUpdate(parts[1], parts[2], parts[3], Integer.parseInt(parts[4]), Boolean.parseBoolean(parts[5]));
                    break;
                case "addCard":
                    cardService.AddAndUpdate(parts[1], parts[2], parts[3], parts[4]);
                    break;
                case "addTransaction":
                    transactionService.AddAndUpdate(parts[1], parts[2], parts[3], parts[4], parts[5], Integer.parseInt(parts[6]), Double.parseDouble(parts[7]), Boolean.parseBoolean(parts[8]), Boolean.parseBoolean(parts[9]));
                    break;
                case "removeCar":
                    carService.Remove(parts[1]);
                    break;
                case "removeCard":
                    cardService.Remove(parts[1]);
                    break;
                case "removeTransaction":
                    transactionService.Remove((parts[1]));
                    break;
                case "showCar":
                    carService.showCars();
                    break;
                case "showCards":
                    cardService.showCards();
                    break;
                case "showTransactions":
                    transactionService.showTransactions();
                    break;
                case "exit":
                    System.exit(0);
                    return;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }


    }
}