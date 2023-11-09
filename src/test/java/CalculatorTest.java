import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    @Test
    public void testAddTwoNumber() {
        // Tworzenie obiektu klasy Calculator
        Calculator calculator = new Calculator();

        // Przygotowanie danych wejściowych
        int x = 5;
        int y = 10;

        // Oczekiwany wynik
        int expectedSum = 15;

        // Wywołanie metody, którą testujemy
        int actualSum = calculator.addTwoNumber(x, y);

        // Sprawdzenie, czy wynik jest zgodny z oczekiwaniami
        assertEquals(expectedSum, actualSum);
    }
}
