 //1.
 public class workshop3 {

     public static void main(String[] args) {
         int[] numbers = {1, 2, 3, 4, 5};
         System.out.println("\nReversed Array:");
         printReverseArray(numbers);
     }

     public static void printReverseArray(int[] arr) {
         for (int i = arr.length - 1; i >= 0; i--) {
             System.out.print(arr[i] + " ");
         }
    }
 }

// //2.
// public class workshop3 {

//     public static void main(String[] args) {
//         int[] numbers = {1.5, 2.5, 3.5, 4.5, 5.5};

//         int sum = 0;
//         for (int num : numbers) {
//             sum += num;
//         }
//         int average = sum / numbers.length;

//         System.out.println("Sum : " + sum);
//         System.out.println("Average : " + average);
//     }
// }




// //3.
// public class workshop3 {

//     public static void main(String[] args) {
//         String[] array = {"ishwor", "bhim", "lam", "vision", "jenish", "bibek"};

//         String elementToFind = "lam";

//         boolean found = false;

//         for (int i = 0; i < array.length; i++) {
//             if (array[i].equals(elementToFind)) {
//                 System.out.println("Element '" + elementToFind + "' found at index " + i);
//                 found = true;
//             }
//         }

//         if (!found) {
//             System.out.println("Element '" + elementToFind + "' not found in the array.");
//         }
//     }
// }





// //4.
// public class workshop3 {
//     public static void main(String[] args) {
//         int[] array = {1, 5, 4, 5, 8, 6, 3, 9};

//         System.out.println("Array before sorting:");
//         printArray(array);

//         bubbleSort(array);

//         System.out.println("\nArray after sorting:");
//         printArray(array);
//     }

//     public static void bubbleSort(int[] array) {
//         int n = array.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (array[j] > array[j + 1]) {
//                     int temp = array[j];
//                     array[j] = array[j + 1];
//                     array[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void printArray(int[] array) {
//         for (int i = 0; i < array.length; i++) {
//             System.out.print(array[i] + " ");
//         }
//         System.out.println();
//     }
// }





// //5.
// public class workshop3 {
//     public static void main(String[] args) {
//         // Creating bank account
//         BankAccount account = new BankAccount("123456789", 1000.0, "Ishwor","kapan");
//         account.deposit(500.0);
//         account.withdraw(200.0);
//         account.withdraw(1500.0); 

//         account.display();
//     }
// }
// class BankAccount {
//     private String accountNumber;
//     private int balance;
//     private String accountHolderName;
//     private String accountHolderAddress;

//     public BankAccount(String accountNumber, int balance, String accountHolderName, String accountHolderAddress) {
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//         this.accountHolderName = accountHolderName;
//         this.accountHolderAddress = accountHolderAddress;
//     }
//     public void deposit(int amount) {
//         balance += amount;
//         System.out.println("Deposit of " + amount + " New balance: " + balance);
//     }

//     public void withdraw(int amount) {
//         if (amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawal of " + amount + " New balance: " + balance);
//         } else {
//             System.out.println("Insufficient funds!");
//         }
//     }
//     public void display() {
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Acc Holder Name: " + accountHolderName);
//         System.out.println("Acc Holder Address: " + accountHolderAddress);
//         System.out.println("Balance: " + balance);
//     }
// }




// //6.
// public class workshop3 {
//     public static void main(String[] args) {
//         BankAccount account = new BankAccount("123456789", 1000.0, "Ishwor", "kapan");
        
//         System.out.println("Account Number: " + account.getAccountNumber());
//         System.out.println("Account Holder Name: " + account.getAccountHolderName());
//         System.out.println("Account Holder Address: " + account.getAccountHolderAddress());
//         System.out.println("Balance: " + account.getBalance());
//     }
// }

// class BankAccount {
//     private String accountNumber;
//     private int balance;
//     private String accountHolderName;
//     private String accountHolderAddress;

//     public BankAccount(String accountNumber, int balance, String accountHolderName, String accountHolderAddress) {
//         this.accountNumber = accountNumber;//this assingn value 
//         this.balance = balance;
//         this.accountHolderName = accountHolderName;
//         this.accountHolderAddress = accountHolderAddress;
//     }

//     public String getAccountNumber() {
//         return accountNumber;
//     }

//     public int getBalance() {
//         return balance;
//     }

//     public String getAccountHolderName() {
//         return accountHolderName;
//     }

//     public String getAccountHolderAddress() {
//         return accountHolderAddress;
//     }
// }





// //7.
// public class workshop3 {
//     public static void main(String[] args) {
//         BankAccount account = new BankAccount("123456789", 1000.0, "Ishwor", "kapan");

//         account.depositMoney(500.0);

//         account.withdrawMoney(200.0);

//         account.display();
//     }
// }

// class BankAccount {
//     private String accountNumber;
//     private int balance;
//     private String accountHolderName;
//     private String accountHolderAddress;

//     public BankAccount(String accountNumber, int balance, String accountHolderName, String accountHolderAddress) {
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//         this.accountHolderName = accountHolderName;
//         this.accountHolderAddress = accountHolderAddress;
//     }

//     public void depositMoney(int amount) {
//         balance += amount;
//         System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
//     }

//     public void withdrawMoney(int amount) {
//         if (amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
//         } else {
//             System.out.println("Insufficient funds!");
//         }
//     }

//     public void display() {
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Holder Name: " + accountHolderName);
//         System.out.println("Account Holder Address: " + accountHolderAddress);
//         System.out.println("Balance: " + balance);
//     }

//     public String getAccountNumber() {
//         return accountNumber;
//     }

//     public int getBalance() {
//         return balance;
//     }

//     public String getAccountHolderName() {
//         return accountHolderName;
//     }

//     public String getAccountHolderAddress() {
//         return accountHolderAddress;
//     }
// }





////8.
// public class workshop3 {
//     public static void main(String[] args) {
//         Lamp lamp = new Lamp();

//         lamp.turnOn();
//         lamp.printStatus();

//         lamp.turnOff();
//         lamp.printStatus();
//     }
// }

// class Lamp {
//     private boolean isOn;

//     public Lamp() {
//         this.isOn = false;
//     }

//     public void turnOn() {
//         isOn = true;
//         System.out.println("Lamp turned on.");
//     }

//     public void turnOff() {
//         isOn = false;
//         System.out.println("Lamp turned off.");
//     }

//     public void printStatus() {
//         System.out.println("Lamp is " + (isOn ? "on" : "off") + ".");
//     }
// }





////9.
// public class workshop3 {
//     public static void main(String[] args) {
//         BankAccount account = new BankAccount("123456789", 1000.0, "ishwor", "kapan");

//         account.display();
//     }
// }

// class BankAccount {
//     private String accountNumber;
//     private int balance;
//     private String accountHolderName;
//     private String accountHolderAddress;

//     public BankAccount(String accountNumber, int balance, String accountHolderName, String accountHolderAddress) {
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//         this.accountHolderName = accountHolderName;
//         this.accountHolderAddress = accountHolderAddress;
//     }

//     public void display() {
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Holder Name: " + accountHolderName);
//         System.out.println("Account Holder Address: " + accountHolderAddress);
//         System.out.println("Balance: " + balance);
//     }
// }



// //10.
// public class workshop3 {
//     public static void main(String[] args) {
//         BankAccount account = new BankAccount();
//         account.display();
//     }
// }

// class BankAccount {
//     private String accountNumber;
//     private int balance;
//     private String accountHolderName;
//     private String accountHolderAddress;

//     public BankAccount() {
//         System.out.println("User created!");
//     }

//     public BankAccount(String accountNumber, int balance, String accountHolderName, String accountHolderAddress) {
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//         this.accountHolderName = accountHolderName;
//         this.accountHolderAddress = accountHolderAddress;
//     }

//     public void display() {
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Holder Name: " + accountHolderName);
//         System.out.println("Account Holder Address: " + accountHolderAddress);
//         System.out.println("Balance: " + balance);
//     }
// }




// //11.
// public class workshop3 {
//     public static class Box {
//         private int width;
//         private int height;
//         private int depth;

//         public Box(int length) {
//             this.width = length;
//             this.height = length;
//             this.depth = length;
//         }

//         public Box(int length, int breadth, int height) {
//             this.width = length;
//             this.height = breadth;
//             this.depth = height;
//         }

//         public Box() {
//             this.width = 10;
//             this.height = 8;
//             this.depth = 12;
//         }

//         public void getVolume() {
//             int volume = width * height * depth;
//             System.out.println("Volume of the box: " + volume);
//         }

//         public static void main(String[] args) {
//             Box cube = new Box(5);
//             System.out.println("Cube:");
//             cube.getVolume();

//             Box cuboid = new Box(3, 4, 5);
//             System.out.println("\nCuboid:");
//             cuboid.getVolume();

//             Box defaultBox = new Box();
//             System.out.println("\nDefault Box:");
//             defaultBox.getVolume();
//         }
//     }
// }





// //12.
// public class workshop3 {
//     public static class BankAccount {
//         private int balance;
    
//         public BankAccount(int Balance) {
//             this.balance = Balance;
//         }
    
//         public int getBalance() {
//             return balance;
//         }

//         public static void main(String[] args) {
//             BankAccount account = new BankAccount(1000);
//             System.out.println("current Balance is $" + account.getBalance());
//         }
//     }
// }





// //13.
// public class workshop3 {
//     public static class Address {
//         private String street;
//         private String city;
//         private String zipCode;

//         public Address(String street, String city, String zipCode) {
//             this.street = street;
//             this.city = city;
//             this.zipCode = zipCode;
//         }

//         public String getStreet() {
//             return street;
//         }

//         public String getCity() {
//             return city;
//         }

//         public String getZipCode() {
//             return zipCode;
//         }

//         public void setStreet(String street) {
//             this.street = street;
//         }

//         public void setCity(String city) {
//             this.city = city;
//         }

//         public void setZipCode(String zipCode) {
//             this.zipCode = zipCode;
//         }

//         public static void main(String[] args) {
//             Address address = new Address("MC", "kapan", "1234");
//             System.out.println("Street: " + address.getStreet());
//             System.out.println("City: " + address.getCity());
//             System.out.println("Zip Code: " + address.getZipCode());

//             address.setStreet("MC");
//             address.setZipCode("12345");

//             System.out.println("\nUpdated Street: " + address.getStreet());
//             System.out.println("Updated Zip Code: " + address.getZipCode());
//         }
//     }
// }





// //14.
// public class workshop3 {
//     public static class Customer {
//         private int customerId;
//         private String name;
//         private BankAccount bankAccount;

//         public Customer(int customerId, String name, BankAccount bankAccount) {
//             this.customerId = customerId;
//             this.name = name;
//             this.bankAccount = bankAccount;
//         }

//         public int getCustomerId() {
//             return customerId;
//         }

//         public String getName() {
//             return name;
//         }

//         public BankAccount getBankAccount() {
//             return bankAccount;
//         }

//         public static void main(String[] args) {
//             BankAccount account1 = new BankAccount(1001, 5000.0);
//             Customer customer1 = new Customer(1, "Ishwor", account1);

//             BankAccount account2 = new BankAccount(1002, 7500.0);
//             Customer customer2 = new Customer(2, "Chalise", account2);

//             System.out.println("Customer 1 details:");
//             System.out.println("Customer ID: " + customer1.getCustomerId());
//             System.out.println("Name: " + customer1.getName());
//             System.out.println("Balance: $" + customer1.getBankAccount().getBalance());

//             System.out.println("\nCustomer 2 details:");
//             System.out.println("Customer ID: " + customer2.getCustomerId());
//             System.out.println("Name: " + customer2.getName());
//             System.out.println("Balance: $" + customer2.getBankAccount().getBalance());
//         }
//     }
//     public static class BankAccount {
//         private int accountId;
//         private double balance;
    
//         public BankAccount(int accountId, double balance) {
//             this.accountId = accountId;
//             this.balance = balance;
//         }
    
//         public int getAccountId() { 
//             return accountId;
//         }
    
//         public double getBalance() {
//             return balance;
//         }
//     }
    
    
// }





//15.
public class workshop3{
    public static class BankAccount {
        private int accountId;
        private double balance;
        public BankAccount(int accountId, double balance) {
            this.accountId = accountId;
            this.balance = balance;
        }

        public BankAccount(int accountId) {
            this(accountId, 0.0); 
        }
    
        public BankAccount() {
            this(0, 0.0); 
        }

        public int getAccountId() {
            return accountId;
        }
    
        public double getBalance() {
            return balance;
        }
    
        public static void main(String[] args) {
            BankAccount account1 = new BankAccount(1001, 5000.0);
            System.out.println("Account 1 details:");
            System.out.println("Account ID: " + account1.getAccountId());
            System.out.println("Balance: $" + account1.getBalance());
    
            BankAccount account2 = new BankAccount(1002);
            System.out.println("\nAccount 2 details:");
            System.out.println("Account ID: " + account2.getAccountId());
            System.out.println("Balance: $" + account2.getBalance());
    
            BankAccount account3 = new BankAccount();
            System.out.println("\nAccount 3 details:");
            System.out.println("Account ID: " + account3.getAccountId());
            System.out.println("Balance: $" + account3.getBalance());
        }
    }
}

