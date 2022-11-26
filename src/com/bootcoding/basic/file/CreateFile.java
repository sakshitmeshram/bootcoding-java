package com.bootcoding.basic.file;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class CreateFile {

   public void fileCreate(){

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter path");
       String filePath = scanner.nextLine();

       File file = new File(filePath);

       Runtime runtime = Runtime.getRuntime();
       try {
           runtime.exec(filePath);
           BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
           if(file.exists()){
               while (scanner.hasNext()){
                   System.out.println(bufferedReader.readLine());
               }
           }
           else {
               file.createNewFile();
           }

       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
}
