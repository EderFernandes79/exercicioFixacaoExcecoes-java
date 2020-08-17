
package model.entities;

import model.exceptions.Domain_Execption;

public class Account {
    
        private Integer number;
        private String holder;  //titularConta;
        private Double balance; //saldo
        private Double withdrawLimit;   //limite de Saque

   
        //construtor
        public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
            this.number = number;
            this.holder = holder;
            this.balance = balance;
            this.withdrawLimit = withdrawLimit;
        }
        
        //modificadores de acesso
        public Integer getNumber() {
            return number;
        }
        public String getHolder() {
            return holder;
        }
        public void setHolder(String holder) {
            this.holder = holder;
        }
        public Double getBalance() {
            return balance;
        }
        public Double getWithdrawLimit() {
            return withdrawLimit;
        }
        public void setWithdrawLimit(Double withdrawLimit) {
            this.withdrawLimit = withdrawLimit;
        }

        //metodo de deposito e saque
        public void deposit( double amount ){
            balance += amount; 
       //   saldo    += quantia      
        }

        public void withdraw( double amount){

            if ( amount > withdrawLimit ) {
                throw new Domain_Execption ("The amount exceeds withdraw limit");
            }
            if ( amount > balance ) {
                throw new Domain_Execption ("Not enough balance");
            }
            balance -= amount;
        }
        
    }//fim class
