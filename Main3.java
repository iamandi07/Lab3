import Domain.CarValidator;
import Domain.CardValidator;
import Domain.TransactionValidator;
import Repository.*;
import Service.*;
import UI.Console3;

public class Main3 {
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

        Console3 console = new Console3(carService, cardService, transactionService);
        console.run();
    }
}
