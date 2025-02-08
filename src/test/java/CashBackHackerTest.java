package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;
import ru.netology.CashBackHacker;

public class CashbackHackerTest {

    CashBackHacker service = new CashBackHacker();

    @Test
    public void testRemainWhenAmountIs900() {
        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals("Amount should be 100 to reach the next thousand.", expected, actual);
    }

    @Test
    public void testRemainWhenAmountIs1000() {
        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals("Amount should be 0 when exactly 1000 is spent.", expected, actual);
    }

    // Добавьте дополнительные тесты по мере необходимости
}

