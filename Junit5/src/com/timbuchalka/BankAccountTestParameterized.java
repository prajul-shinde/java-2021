package com.timbuchalka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankAccountTestParameterized {
    private BankAccount bankAccount;


    public static Collection<Arguments> testConditions() {
        return Arrays.asList(
                Arguments.of(100.00, true, 1100.00),
                Arguments.of(200.00, true, 1200.00)
        );

    }

    @BeforeEach
    public void setup() {
        bankAccount = new BankAccount("tim", "buchalka", 1000.00, BankAccount.CHECKING);
        System.out.println("running a test...");
    }

    @ParameterizedTest
    @MethodSource("testConditions")
    void deposit(double amount, boolean branch, double expected) {
        bankAccount.deposit(amount, branch);
        assertEquals(expected, bankAccount.getBalance(), 0);
    }
}
