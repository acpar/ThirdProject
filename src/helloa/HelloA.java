/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloa;

import java.util.Scanner;

/**
 *
 * @author ABaimaganbetov
 */
public class HelloA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Напишите свое имя");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(hello(s));
    }

    private static String hello(java.lang.String name) {
        kz.acpar.demo.TestDemo_Service service = new kz.acpar.demo.TestDemo_Service();
        kz.acpar.demo.TestDemo port = service.getTestDemoPort();
        return port.hello(name);
    }
    
}
