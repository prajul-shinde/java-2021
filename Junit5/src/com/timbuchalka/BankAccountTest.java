package com.timbuchalka;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount bankAccount;
    private static int count;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("this executes only once before class.count= "+count++);
    }
    @BeforeEach
    public void setup() {
        bankAccount = new BankAccount("tim", "buchalka", 1000.00, BankAccount.CHECKING);
        System.out.println("running a test...");
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        double balance = bankAccount.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }


    @org.junit.jupiter.api.Test
    void withdraw_branch() {
        double balance=bankAccount.withdraw(600.00,true);
        assertEquals(400.00,balance,0);
    }
    @Test
    public void withdraw_notFromBranch(){
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(600.00, false));
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        bankAccount.deposit(200.00, true);
        assertEquals(1200.00, bankAccount.getBalance());
    }

    @Test
    void getBalance_withdraw() {
        bankAccount.withdraw(200.00, true);
        assertEquals(800.00, bankAccount.getBalance());
    }

    @Test
    public void isChecking_true() {
        assertTrue(bankAccount.isChecking());
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("this runs only once after a class.count= "+count++);
    }
    @AfterEach
    public void tearDown(){
        System.out.println("count= "+count++);
    }

}