package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    public CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldReturnRemain() {
        int expected = 900;
        int actual = cashbackHackService.remain(100);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnZeroRemain() {
        int expected = 1000;
        int actual = cashbackHackService.remain(0);

        assertEquals(actual, expected);
    }
}