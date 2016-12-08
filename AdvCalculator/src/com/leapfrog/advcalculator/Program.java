/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.advcalculator;

import com.leapfrog.advcalculator.command.AddCommand;
import com.leapfrog.advcalculator.command.Calculation;
import com.leapfrog.advcalculator.command.MathCommand;
import com.leapfrog.advcalculator.command.MathCommandFactory;
import com.leapfrog.advcalculator.command.MaxCommand;
import com.leapfrog.advcalculator.command.PowCommand;
import java.util.Scanner;

/**
 *
 * @author zak
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y;
        int choice;
        while (true) {
            System.out.println("Enter First Number:");
            x = input.nextDouble();
            System.out.println("Enter Second Number:");
            y = input.nextDouble();

            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Mul");
            System.out.println("4. Div");
            System.out.println("5. Pow");
            System.out.println("6. Max");
            System.out.println("7. Min");
            System.out.println("8. Exit");
            System.out.println("Enter your Choice[1-8]:");
            choice = input.nextInt();
            Calculation c = new Calculation();
            c.doCalculate(MathCommandFactory.get(choice), x, y);
            
            System.out.println("Do you want to continue?[Y/N]");
            if(input.next().equalsIgnoreCase("n")){
                System.exit(0);
            }
        }
    }

}
