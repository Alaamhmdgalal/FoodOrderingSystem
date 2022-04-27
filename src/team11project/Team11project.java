/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team11project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Copy Center
 */
public class Team11project {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Data d = new Data();
        Client p=new Client();
        Order O = new Order();
        p.Predefinedperson();
        d.predefined();            
        System.out.println("Choose and operation.");
                System.out.println("1) Login \n 2)Register");
                int e = scan.nextInt();
        if (e == 2)
        p.register();
               e=1;
        if (e==1)
            if(p.login() == 2){
            System.out.println("Adding a new Restaurant.");
            d.add_restaurant();
            System.out.println("Loggin out...");
        }
        
        if (p.login()==1)

        for (int w=1 ; w!=0; ){
            
            System.out.println("Choose the Operation");
            System.out.println("1) Display all resturaunts");
            System.out.println("2) Search for a specific Resturaunt");
            System.out.println("3) Add a product");
            System.out.println("4) Remove a Product");
            System.out.println("5) Check out.");

        int x = scan.nextInt();
        if (x==1){
        d.display();}
        if (x==2){
        System.out.println("Type the Restaurant name.");
        String name = scan.next();
        d.search(name);}
        if (x==3){       
        System.out.println("Write the item you want to add");
        String name = scan.next();
        O.add_product(name,d);}
        if(x==4){
        System.out.println("Write the item you want to remove.");
        String name = scan.next();
        O.remove_product(name);}
        if (x==5){
        O.calc_price(d);
        System.out.println("Thank you for ordering.");
        break;}
        System.out.println("Enter 0 to log out and exit \n , otherwise for another operation.");
        w = scan.nextInt();
        
        }  
}
}
