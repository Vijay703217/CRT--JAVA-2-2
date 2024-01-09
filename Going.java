import  java.io.*;
class Going
{
public static void main(String args[]) throws Exception
{
FileWriter b1=new FileWriter ("abz.txt");
BufferedWriter f1=new BufferedWriter (b1);
f1.write("d");
f1.newLine();
f1.write(86);
f1.newLine();
f1.write(121);
f1.newLine();
f1.write(122);
f1.newLine();
f1.flush();
b1.close();
f1.close();
}
}
