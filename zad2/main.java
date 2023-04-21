package zad2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.addProduct(new Product("espresso", 50, 70, 120))
        .addProduct(new Product("americano", 150, 85, 180))
        .addProduct(new Product("cappuccino", 200, 60, 200))
        .addProduct(new Product("latte", 200, 60, 220));
        System.out.println("Выберите действие: ");
        
        boolean a = true;
        while(a) { 
            System.out.println();
            System.out.println("1 - показать весь асортимент \n2 - выбрать напиток \n3 - Выход ");
            
            String n = scanner.nextLine();
            switch(n){
            case "1":
            for (Product coffee : coffeeMachine.getList()) {
                System.out.println(coffee);
            }
            break;
            case "2":
            System.out.println("Введите название напитка: ");
                try {
                Product found = coffeeMachine.sellProduct(coffeeMachine.findProduct(scanner.nextLine()));
                System.out.println("Вы выбрали: " + found);
                System.out.println("Спасибо за покупку!");
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            break;
            case "3":
            System.out.println("Досвидания!");
                    a = false;
                    break;

        }

        
    }
    
}

}
