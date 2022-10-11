/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author ThuyVT
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        // Chia cho 0
        int number = 10;
        int zero = 0;
        try {
            System.out.println(number / zero);

            System.out.println(number / 5);
        } catch (ArithmeticException er) {
            System.out.println("Khong the chia cho 0");
            System.out.println(number / 2);
        }

        System.out.println("asbdasc");

        String str = "50";
        String str1 = "30";
        String str2 = null;
        int numberStr = Integer.parseInt(str);
        System.out.println(numberStr);
        try {
            int numberStr1 = Integer.parseInt(str1);
            System.out.println(numberStr1);

            System.out.println(str2.length());
        } catch (NumberFormatException ex) {
            System.out.println("Phai dien gia tri la so");
        } catch (NullPointerException er) {
            System.out.println("Phai gan gia tri khac null");
        } catch (Exception ex) {
            
        } finally {
            System.out.println("Cuoi cung cung nhay vao");
        }
    }
}
