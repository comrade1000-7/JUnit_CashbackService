package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {
    public CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldReturnRemain() {
        int expected = 900;
        int actual = cashbackHackService.remain(100);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroRemain() {
        int expected = 1000;
        int actual = cashbackHackService.remain(0);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReturn1000Remain() {
        int expected = 0;
        int actual = cashbackHackService.remain(1000);

        assertEquals(expected, actual);
    }
}