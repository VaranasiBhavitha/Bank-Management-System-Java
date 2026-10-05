# Bank Account Management System

A simple Java console-based Bank Account Management System developed to demonstrate **Object-Oriented Programming concepts**, especially **Inheritance**.

## Project Overview

This project allows a user to perform basic banking operations through a menu-driven console application.

The program demonstrates how a parent class can be inherited by different child classes such as Savings Account and Current Account.

## Features

- Create an account
- Enter account holder name
- Enter initial balance
- Deposit money
- Add 5% interest
- Withdraw money
- Check current balance
- Display insufficient balance message
- Exit the application

## OOP Concepts Used

### 1. Inheritance

`SavingsAccount` and `CurrentAccount` inherit properties and methods from the `BankAccount` class.

```text
             BankAccount
              /        \
             /          \
SavingsAccount      CurrentAccount
