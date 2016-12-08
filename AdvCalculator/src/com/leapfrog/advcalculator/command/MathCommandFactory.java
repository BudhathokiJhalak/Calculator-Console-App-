/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.advcalculator.command;

/**
 *
 * @author zak
 */
public class MathCommandFactory {
    public static MathCommand get(int param){
        if(param==1){
            return new AddCommand();
        }else if(param==2){
            return new SubCommand();
        }else if(param ==3){
            return new MulCommand();
        }else if(param==4){
            return new DivCommand();
        }else if(param==5){
            return new PowCommand();
        }else if(param==6){
            return new MaxCommand();
        }else if(param==7){
            return new MinCommand();
        }else if(param==8){
            return new ExitCommand();
        }
        return null;
    }
    
}
