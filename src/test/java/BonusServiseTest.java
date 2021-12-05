import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    // домашнее задание
    @Test
    void shouldCalculateForNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        //проверка (ОР и ФР):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        //проверка (ОР и ФР):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForNotRegisteredAndZero() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 0;
        boolean registered = false;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        //проверка (ОР и ФР):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndZero() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 0;
        boolean registered = true;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        //проверка (ОР и ФР):
        assertEquals(expected, actual);
    }

    // тесты из лекции
    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
