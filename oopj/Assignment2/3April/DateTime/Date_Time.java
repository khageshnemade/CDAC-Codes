
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class a{
    public static void main(String[] args) {
        System.out.println("Eter date and time in format (DDMMYYYY hhmmss)");
        Scanner sc=new Scanner(System.in);
        //Accept date from user 
        String s=sc.nextLine();
        //make format for user input
       // String s="21071997 121212";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy HHmmss");
        LocalDateTime date = LocalDateTime.parse(s,formatter);//passed date and format
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
DateTimeFormatter format2= DateTimeFormatter.ofPattern("MM?dd?yyyy");
DateTimeFormatter format3=DateTimeFormatter.ofPattern("yyyy&MM&dd");
DateTimeFormatter format4=DateTimeFormatter.ofPattern("HH:mm:ss");
DateTimeFormatter format5 = DateTimeFormatter.ofPattern("hh:mm:ss a");
DateTimeFormatter format6 = DateTimeFormatter.ofPattern("HH:mm");
DateTimeFormatter format7 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
DateTimeFormatter format8 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
DateTimeFormatter format9 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
 String text = date.format(format1);
 String tex2 = date.format(format2);
  String tex3 = date.format(format3);
  String tex4 = date.format(format4);
  String tex5 = date.format(format5);
  String tex6 = date.format(format6);
  String tex7 = date.format(format7);
  String tex8 = date.format(format8);
  String tex9 = date.format(format9);
         
System.out.println(text);
 System.out.println(tex2);
 System.out.println(tex3);
 System.out.println(tex4);
 System.out.println(tex5);
 System.out.println(tex6);
 System.out.println(tex7);
 System.out.println(tex8);
 System.out.println(tex9);
         
     
     sc.close();
    }
}