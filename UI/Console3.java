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

    public void line(int option) {
        if(option == 1) System.out.print("\n=================================================================================\n");
        if(option == 2) System.out.print("=================================================================================");
    }

    private void showMenu() {

        line(1);System.out.print(new Formatter().format("%-20s|%-25s|%-20s","Car","Cards","Transactions"));line(1);
        System.out.print(new Formatter().format("%-20s|%-25s|%-20s","1. Add car.","4. Add card.","7. Add transaction.\n"));
        System.out.print(new Formatter().format("%-20s|%-25s|%-20s","2. Remove car.","5. Remove card.","8. Remove transaction.\n"));
        System.out.print(new Formatter().format("%-20s|%-25s|%-20s","3. Show all cars.","6. Show all cards.","9. Show all transactions.\n"));
        line(2);
        System.out.print(new Formatter().format("\n%-20s|%-25s|%-20s","141. Search car.","142. Search cards.","142. Search transactions.\n"));
        System.out.print(new Formatter().format("%-20s|%-25s|%-20s","16. Drugs by sales.","17. Clients by discounts.","15. Transactions by date.\n"));
        System.out.print(new Formatter().format("%-20s|%-25s|%-20s","","","18. Remove Transactions.\n"));
        System.out.print(new Formatter().format("%-20s|%-25s|%-20s","3. Show all cars.","6. Show cards.","9. Show all transactions.\n"));
        line(2);
        System.out.println("\n19 - Increase prices");
        System.out.println("20 - Undo");
        System.out.println("21 - Redo");
        line(2);
        System.out.println("\n0. Exit.");
        line(2);
        System.out.print("\nYour option: ");
    }

    public void run()  {

        while (true) {
            showMenu();

            int option = new Scanner(System.in).nextInt();
            switch (option) {
                case 1:
                    AddCar();
                    break;

                case 2:
                    RemoveCar();
                    break;

                case 3:
                    carService.showCars();
                    break;

                case 4:
                    AddCard();
                    break;

                case 5:
                    RemoveCard();
                    break;

                case 6:
                    cardService.showCards();
                    break;

                case 7:
                    AddTransaction();
                    break;

                case 8:
                    RemoveTransaction();
                    break;

                case 9:
                    transactionService.showTransactions();
                    break;

                case 141:
                    CarSearch();
                    break;

                case 142:
                    CardSearch();
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }

        }
    }

    private void AddCar() {
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        System.out.print("Enter date : ");
        String date = scanner.nextLine();
        System.out.print("Enter the distance: ");
        int distance = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the model: ");
        String model = scanner.nextLine();
        System.out.print("Enter if the car is in warranty (true / false): ");
        boolean warranty = Boolean.parseBoolean(scanner.nextLine());

        try {
            carService.AddAndUpdate(id, date,model, distance, warranty);
            System.out.println("\nCar added successfully!\n");
        } catch (RuntimeException rex) {
            System.out.println("\nWe have errors:");
            System.out.println(rex.getMessage());
        }
    }

    private void RemoveCar() {
        System.out.print("Car id: ");
        String id = scanner.nextLine();

        try {
            carService.Remove(id);
            System.out.println("\nCar removed successfully!\n");
        } catch (RuntimeException rex) {
            System.out.println("\nWe have errors:");
            System.out.println(rex.getMessage());
        }
    }

    private void CarSearch() {
        System.out.println("What to look for: ");
        String text = new Scanner(System.in).nextLine();
        System.out.println("\nSearch results: ");
        for (Car c : carService.fullTextSearch(text))
            System.out.println(c);
    }

    private void AddCard() {
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        System.out.print("Enter cnp ");
        String cnp = scanner.nextLine();
        System.out.print("Enter the birthdate: ");
        String bdate = scanner.nextLine();
        System.out.print("Enter the registration date : ");
        String rdate = scanner.nextLine();

        try {
            cardService.AddAndUpdate(id ,cnp, bdate, rdate);
            System.out.println("\nClient Card added successfully!\n");
        } catch (RuntimeException rex) {
            System.out.println("\nWe have errors:");
            System.out.println(rex.getMessage());
        }
    }

    private void RemoveCard() {
        System.out.print(" Card ID: ");
        String id = scanner.nextLine();

        try {
            cardService.Remove(id);
            System.out.println("\nCard removed successfully!\n");
        } catch (RuntimeException rex) {
            System.out.println("\nWe have errors:");
            System.out.println(rex.getMessage());
        }
    }

    private void CardSearch() {
        System.out.println("What to look for: ");
        String text = new Scanner(System.in).nextLine();
        System.out.println("\nSearch results: ");
        for (Card c : cardService.fullTextSearch(text)) {
            System.out.println(c);
        }
    }

    private void AddTransaction() {
        System.out.print("Enter id: ");
        String id = scanner.nextLine();
        System.out.print("Enter card id: ");
        String icc = scanner.nextLine();
        System.out.print("Enter the registration date : ");
        String date = scanner.nextLine();
        System.out.print("Enter the registration hour : ");
        String hour = scanner.nextLine();
        System.out.print("Enter the car id : ");
        String cid = scanner.nextLine();
        System.out.print("Enter the price of the piece: ");
        int piecesum = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the price of the service: ");
        double sumservice = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter if the car is in warranty (true / false): ");
        boolean clientcard = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Enter if the car is in warranty (true / false): ");
        boolean warranty = Boolean.parseBoolean(scanner.nextLine());

        try {
            transactionService.AddAndUpdate(id, icc, date, hour, cid, piecesum, sumservice, clientcard, warranty);
            System.out.println("\nTransaction added successfully!\n");
        } catch (RuntimeException rex) {
            System.out.println("\nWe have errors:");
            System.out.println(rex.getMessage());
        }
    }

    private void RemoveTransaction() {
        System.out.print("Transaction id: ");
        String id = scanner.nextLine();;

        try {
            transactionService.Remove(id);
            System.out.println("\nTransaction removed successfully!\n");
        } catch (RuntimeException rex) {
            System.out.println("\nWe have errors:");
            System.out.println(rex.getMessage());
        }
    }



    /**
     * Console using all in one input
     */
    public void allInOneInput() {
        while (true) {
            System.out.println("Add operation: ");
            String input = new Scanner(System.in).nextLine();
            String[] parts = input.split(",");
            switch (parts[0]) {
                case "addCar":
                    carService.AddAndUpdate(parts[1], parts[2], parts[3], Integer.parseInt(parts[4]), Boolean.parseBoolean(parts[5]));
                    break;
                case "addClient":
                    cardService.AddAndUpdate(parts[1], parts[2], parts[3], parts[4]);
                    break;
                case "addTransaction":
                    transactionService.AddAndUpdate(parts[1], parts[2], parts[3], parts[4], parts[5], Integer.parseInt(parts[6]), Double.parseDouble(parts[7]), Boolean.parseBoolean(parts[8]), Boolean.parseBoolean(parts[9]));
                    break;
                case "removeDrug":
                    carService.Remove(parts[1]);
                    break;
                case "removeClientCard":
                    cardService.Remove(parts[1]);
                    break;
                case "removeTransaction":
                    transactionService.Remove((parts[1]));
                    break;
                case "showDrugs":
                    carService.showCars();
                    break;
                case "showClientCards":
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


    }}