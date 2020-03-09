import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        int count = 0;
        int countera = 0;
        int counterb = 0;
        String str;
        try{
            File infile = new File("src.txt");
            File outfile = new File("output.txt");
            long inbf = infile.length();
            long outbf = outfile.length();
            BufferedReader in = new BufferedReader(new FileReader("src.txt"));
            BufferedReader inb = new BufferedReader(new FileReader("src.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
            while (in.readLine() != null){
                ++countera;
            }
            while ((str = inb.readLine()) != null) {
                ++counterb;
                count += str.length() - str.replace(" ", "").length();
                str = str.replaceAll(" ","@");
                out.write(str);
                if(counterb < countera){
                    if(str.contains("")){
                           out.newLine();
                           out.newLine();
                    }
                }
            }
            in.close();
            inb.close();
            out.close();
            System.out.println("The src.txt size before the copy was: " + inbf + " bytes");
            System.out.println("The src.txt size after the copy is: " + infile.length() + " bytes");
            System.out.println("The output.txt size before the copy was: " + outbf + " bytes");
            System.out.println("The output.txt size after the copy was: " + outfile.length() + " bytes");
            System.out.println("Spaces replaced: " + count);
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
            System.out.println("IO Exception");
        }
    }
}