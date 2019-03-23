import Domain.CarValidator;
import Domain.CardValidator;
import Domain.TransactionValidator;
import Repository.*;
import Service.*;
import UI.Console;

public class Main {
    public static void main(String[] args) {

        CarValidator carValidator = new CarValidator();
        CardValidator cardValidator = new CardValidator();
        TransactionValidator transactionValidator = new TransactionValidator();

        CarRepository carRepository = new CarRepository(carValidator);
        CardRepository cardRepository = new CardRepository(cardValidator);
        TransactionRepository transactionRepository = new TransactionRepository(transactionValidator);

        CarService carService = new CarService(carRepository);
        CardService cardService = new CardService(cardRepository);
        TransactionService transactionService = new TransactionService(transactionRepository);

        Console console = new Console(carService, cardService, transactionService);
        console.run();
    }
}
