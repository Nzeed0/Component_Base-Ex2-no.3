package ex2_No3;

import java.util.Scanner;

class MainOb{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String inp = "";

        Person1 ps1 = new Person1();
        Person2 ps2 = new Person2();
        Headquater reg = new Headquater();
        reg.register(ps1);
        reg.register(ps2);

        while(true){
            inp = input.nextLine();
            if(inp.equals("")) {
                input.close(); 
                return; }
            else {
                reg.setSomeData(inp);
            }
        }
    }
}