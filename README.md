# 💰 Bank Account Simulation (Java OOP)

## 📌 Objective
This project simulates basic bank operations such as:
- Depositing money
- Withdrawing money
- Checking balance
- Viewing transaction history  

It is implemented using **Java Object-Oriented Programming (OOP)** concepts.

---

## 🛠 Tools & Technologies
- **Java**
- **VS Code** or any Java IDE
- **Terminal / Command Prompt**

---

## 💡 Features
1. **Create an Account**
   - Account holder name
   - Initial deposit amount
2. **Deposit Money**
   - Validates deposit amount
3. **Withdraw Money**
   - Ensures sufficient balance
4. **Check Balance**
5. **View Transaction History**
6. **Exit Program**

---

## 🏗 OOP Concepts Used
- **Classes & Objects** → `Account` class for account details and operations.
- **Encapsulation** → `balance` and `transactionHistory` are private and accessed via public methods.
- **Constructor** → Initializes account holder name and balance.
- **ArrayList** → Stores transaction history.

---

### Sample Output

Enter account holder name: Pradeep
Enter initial deposit amount: $5000

==== Bank Menu ====
1. Deposit Money
2. Withdraw Money
3. Check Balance
4. View Transaction History
5. Exit

Enter choice: 1

Enter deposit amount: $1500

$1500 deposited successfully.

==== Bank Menu ====

3

Current balance: $6500
