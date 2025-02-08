package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.CashBackHacker;

public class CashbackHackerTest {

    CashBackHacker service = new CashBackHacker();

    @Test
    public void testRemainWhenAmountIs900() {
        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals(actual, expected, "Amount should be 100 to reach the next thousand.");
    }

    @Test
    public void testRemainWhenAmountIs1000() {
        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(actual, expected, "Amount should be 0 when exactly 1000 is spent.");
    }

    // Добавьте дополнительные тесты по мере необходимости
}
