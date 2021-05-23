import jdk.jfr.Unsigned;

import java.io.*;
import java.lang.*;
import java.util.*;

public class OS1Assignment {
//    public static String unsignedToString(long lng){
//        char[] buffer = new char[20];
//        int i = buffer.length - 1;
//
//        // Do first iteration specially
//        long temp = (lng >>> 1) / 5;  // Unsigned divide by 10
//        buffer[i] = (char)(lng - temp * 10 + '0');
//        lng = temp;
//
//        // Do rest of iterations the normal way
//        for (i--; i >= 0; i--) {
//            buffer[i] = (char)(lng % 10 + '0');
//            lng /= 10;
//        }
//
//        return new String(buffer);
//    }
    public static void main(String [] args){
        String input_file=args[0];
        if(args.length==0){
            System.out.println("Put input file as parameter");
        }
        //page_table[0]=Page Table
        //page_table[1]=Physical Frames
        int[][] page_table={{2,4,1,7,3,5,6},{0,1,2,3,4,5,6,7}};

        try (
            InputStream inputStream=new FileInputStream(input_file);
            OutputStream outputStream=new FileOutputStream("output-OS1");
        ){
            long line;
            long unsigned_long;
            String long_toString="";
            String long_toBinary="";
            // append an 'L' so that the
            while((line=inputStream.read())!=-1){
                long_toString=Long.toString(line);
                unsigned_long=Long.parseUnsignedLong(long_toString);
//               unsigned_long=unsignedToString(line);
                long_toBinary=Long.toBinaryString(unsigned_long);

            }
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
