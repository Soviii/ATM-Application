import java.util.Random;


public class Account{

        private Random rand = new Random();
        private int balance = 0;
        private int maxId = 100000000;
        private int id;
        private String user;

        Account(String name){
                id = rand.nextInt(maxId);
                user = name;
        }

        public void deposit(int amount){
                balance =+ amount;
        }

        public void withdraw(int amount){
                balance =- amount;
        }

        public int getBalance(){
                return balance;
        }

        public int getID(){
                return id;
        }
}
