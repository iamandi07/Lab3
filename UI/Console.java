package UI;

import Domain.Car;
import Domain.Card;
import Domain.Transaction;

import Service.CarService;
import Service.CardService;
import Service.TransactionService;

import java.util.*;

public class Console {
    private CarService service;
    private CardService service1;
    private TransactionService service2;
    private Scanner scanner;

    public Console(CarService service) {
        this.service = service;
        scanner = new Scanner(System.in);
    }

    public Console(CardService service1) {
        this.service1 = service1;
        scanner = new Scanner(System.in);
    }

    public Console(TransactionService service2) {
        this.service2 = service2;
        scanner = new Scanner(System.in);
    }

    private void showMenu() {
        System.out.println("1. Intrare in service a masini");
        System.out.println("2. Intrare in service a cardului de client");
        System.out.println("3. Intrare in service a transactiilor");
        System.out.println("4. Afisare toate");
        System.out.println("x. Iesire");
    }

    public void run() {

        while (true) {
            showMenu();
            String option = scanner.nextLine();
            if (option.equals("1")) {
                handleServiceEntryCar();
            } else if (option.equals(("2"))) {
                handleServiceEntryCard();
            } else if (option.equals(("3"))) {
                handleServiceEntryTransaction();
            } if (option.equals("4")) {
                handleShowAll();
            } else if (option.equals("x")) {
                break;
            }
        }
    }

    private void handleShowAll() {
        for (Car c : service.getAll())
            System.out.println(c);
        for (Card d : service1.getAll())
            System.out.println(d);
        for (Transaction e : service2.getAll())
            System.out.println(e);
    }

    private void handleServiceEntryCar() {

        try {
            System.out.println("Dati id-ul: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Dati data de achizitie: ");
            int date = Integer.parseInt(scanner.nextLine());
            System.out.println("Dati distanta parcursa: ");
            int distance = Integer.parseInt(scanner.nextLine());
            System.out.println("Dati modelul: ");
            String model = scanner.nextLine();
            System.out.println("E in garantie? asteptam ca un raspuns yes sau no: ");
            boolean waranty = Boolean.parseBoolean(scanner.nextLine());

            service.EnterServiceCar(id, date, distance, model, waranty);
        } catch (RuntimeException runtimeException) {
            System.out.println("Avem erori: " + runtimeException.getMessage());
        }
    }

    private void handleServiceEntryCard() {

        try {
            System.out.println("Dati id-ul: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Dati CNP: ");
            int cnp = Integer.parseInt(scanner.nextLine());
            System.out.println("Dati data nasteri: ");
            int bdate = Integer.parseInt(scanner.nextLine());
            System.out.println("Dati data inregistrari: ");
            int rdate = Integer.parseInt(scanner.nextLine());
            System.out.println("Dati modelul: ");
            String model = scanner.nextLine();
            System.out.println("Dati numele: ");
            String fname = scanner.nextLine();
            System.out.println("Dati prenumele: ");
            String lname = scanner.nextLine();

            service1.EnterServiceCard(id, cnp, bdate, rdate, model, fname, lname);
        } catch (RuntimeException runtimeException) {
            System.out.println("Avem erori: " + runtimeException.getMessage());
        }
    }

    private void handleServiceEntryTransaction() {

        try {
            System.out.println("Dati id-ul: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Dati id-ul masini: ");
            int icc = Integer.parseInt(scanner.nextLine());
            System.out.println("Dati suma pieselor: ");
            int piecesum = Integer.parseInt(scanner.nextLine());
            System.out.println("Dati data cumparari: ");
            int date = Integer.parseInt(scanner.nextLine());
            System.out.println("Dati ora cumparari: ");
            int hour = Integer.parseInt(scanner.nextLine());
            System.out.println("Dati suma manoperei: ");
            double sumservice = Integer.parseInt(scanner.nextLine());
            System.out.println("Dati ID-ul masini: ");
            String cid = scanner.nextLine();
            System.out.println("E in garantie? asteptam ca un raspuns yes sau no: ");
            boolean waranty = Boolean.parseBoolean(scanner.nextLine());
            System.out.println("Aveti card de client? asteptam ca un raspuns yes sau no: ");
            boolean clientcard = Boolean.parseBoolean(scanner.nextLine());


            service2.EnterServiceTransaction(id, icc, piecesum, date, hour, sumservice, cid, waranty, clientcard);
        } catch (RuntimeException runtimeException) {
            System.out.println("Avem erori: " + runtimeException.getMessage());
        }
    }
}

