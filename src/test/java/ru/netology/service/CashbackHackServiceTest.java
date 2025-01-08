package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//import org.testng.annotations.Test;

//import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateIfAmountIsLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(600);
        int expected = 400;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmountIsMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1400);
        int expected = 600;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmountIsZero() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateIfAmountIsLessThanBoundaryJupiter() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(600);
        int expected = 400;

        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateIfAmountIsMoreThanBoundaryJupiter() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1400);
        int expected = 600;

        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateIfAmountIsZeroJupiter() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateIfAmountEqualsBoundaryJupiter() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}