
import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HIEU19
 */
public class NewClass {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in, "Cp437"));
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out),true,"Cp437"));
        Scanner sc = new Scanner(System.in);
        String a = "";
        a = in.readLine();
        System.out.println(a);
        a = sc.nextLine();

        System.out.println(a);
    }
}
