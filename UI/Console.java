package UI;

import Domain.Car;
import Domain.Card;
import Domain.Transaction;

import Service.CarService;
import Service.CardService;
import Service.TransactionService;

import java.util.*;

public class Console {
    private CarService carservice;
    private CardService cardservice;
    private TransactionService transactionservice;
    private Scanner scanner;

    public Console(CarService carservice, CardService cardservice, TransactionService transactionservice) {
        this.carservice = carservice;
        this.cardservice = cardservice;
        this.transactionservice = transactionservice;
        this.scanner = new Scanner(System.in);
    }

    private void showMenu() {
        System.out.println("1. Crud Masina");
        System.out.println("2. Crud Card");
        System.out.println("3. Crud Transaction");
        System.out.println("x. Iesire");
    }

    public void run() {

        while (true) {
            showMenu();
            String option = scanner.nextLine();
            switch (option){
                case "1":
                    runCarCrud();
                    break;
                case "2":
                    runCardCrud();
                    break;
                case "3":
                    runTransactionCrud();
                    break;
                case "x":
                    return;
                default:
                    System.out.println("Alegere gresita");
                    break;
            }
        }
    }

    private void runCarCrud() {
        while (true) {
            System.out.println("1. Add or update a car");
            System.out.println("2. Remove a car");
            System.out.println("3. View all cars");
            System.out.println("4. Back");

            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    handleAddUpdateCar();
                    break;
                case "2":
                    handleRemoveCar();
                    break;
                case "3":
                    handleViewCar();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }

    private void handleViewCar() {
        for (Car car : carservice.getAll()) {
            System.out.println(car);
        }
    }
    private void handleAddUpdateCar() {

        try {
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

            carservice.AddAndUpdate(id, date, distance, model, warranty);

            System.out.println("Car added!");
        } catch (Exception ex) {
            System.out.println("Errors:\n" + ex.getMessage());
        }
    }

    private void handleRemoveCar() {
        try {
            System.out.print("Enter the id to remove:");
            String id = scanner.nextLine();
            carservice.Remove(id);

            System.out.println("Cake removed!");
        } catch (Exception ex) {
            System.out.println("Errors:\n" + ex.getMessage());
        }
    }

    private void runCardCrud() {
        while (true) {
            System.out.println("1. Add or update a card");
            System.out.println("2. Remove a card");
            System.out.println("3. View all card");
            System.out.println("4. Back");

            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    handleAddUpdateCard();
                    break;
                case "2":
                    handleRemoveCard();
                    break;
                case "3":
                    handleViewCard();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }

    private void handleViewCard() {
        for (Card card : cardservice.getAll()) {
            System.out.println(card);
        }
    }
    private void handleAddUpdateCard() {

        try {
            System.out.print("Enter id: ");
            String id = scanner.nextLine();
            System.out.print("Enter cnp ");
            String cnp = scanner.nextLine();
            System.out.print("Enter the birthdate: ");
            String bdate = scanner.nextLine();
            System.out.print("Enter the registration date : ");
            String rdate = scanner.nextLine();
            System.out.print("Enter if the car is in warranty (true / false): ");
            boolean warranty = Boolean.parseBoolean(scanner.nextLine());

            cardservice.AddAndUpdate(id, cnp, bdate, rdate);

            System.out.println("Car added!");
        } catch (Exception ex) {
            System.out.println("Errors:\n" + ex.getMessage());
        }
    }

    private void handleRemoveCard() {
        try {
            System.out.print("Enter the id to remove:");
            String id = scanner.nextLine();
            cardservice.Remove(id);

            System.out.println("Card removed!");
        } catch (Exception ex) {
            System.out.println("Errors:\n" + ex.getMessage());
        }
    }

    private void runTransactionCrud() {
        while (true) {
            System.out.println("1. Add or update a transaction");
            System.out.println("2. Remove a transaction");
            System.out.println("3. View all transaction");
            System.out.println("4. Back");

            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    handleAddUpdateTransaction();
                    break;
                case "2":
                    handleRemoveTransaction();
                    break;
                case "3":
                    handleViewTransaction();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }

    private void handleViewTransaction() {
        for (Transaction transaction : transactionservice.getAll()) {
            System.out.println(transaction);
        }
    }
    private void handleAddUpdateTransaction() {

        try {
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

            transactionservice.AddAndUpdate(id, icc, date, hour, cid, piecesum, sumservice, clientcard, warranty);

            System.out.println("Car added!");
        } catch (Exception ex) {
            System.out.println("Errors:\n" + ex.getMessage());
        }
    }

    private void handleRemoveTransaction() {
        try {
            System.out.print("Enter the id to remove:");
            String id = scanner.nextLine();
            transactionservice.Remove(id);

            System.out.println("Transaction removed!");
        } catch (Exception ex) {
            System.out.println("Errors:\n" + ex.getMessage());
        }
    }
}

