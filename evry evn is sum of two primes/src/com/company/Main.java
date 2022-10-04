package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {

    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("spit");
        for(long i = 2; true; i++){
            logic(2*i,writer);
        }
    }

    private static void logic(long input,Writer writer) throws IOException {
        int count=0;
        writer.append("For input :" + input + "{ \n");
        for(long i=2;i<input;i++){
            if((checkIfPrime(i)) && (checkIfPrime(input-i))){
                count++;
                //System.out.println(i + (input - i));
                String te = Long.toString(i);
                te += ",";
                te += Long.toString(input-i);
                te += "\n";
                writer.append("\t" + te);
            }
        }
        if(count == 0){
            System.out.println("For" + input + "not satisfied");
            writer.close();
        }
        writer.append("}");
    }

    private static boolean checkIfPrime(long n){
        for(long i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
