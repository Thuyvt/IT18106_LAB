/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThuyVT
 */
public class ThreadDemo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i ++) {
            System.out.print(i + " ");
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {//Exception
                Logger.getLogger(ThreadDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        t1.start();
        ThreadDemo t2 = new ThreadDemo();
        t2.start();
    }
}
