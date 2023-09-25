import java.util.Scanner;

public class Uppgift5 {

public static void main(String[] args) { 
Scanner tangentbord = new Scanner(System.in);

String text = tangentbord.nextLine();

System.out.println(text.length());
System.out.println(text.indexOf("a"));
int g1 = text.indexOf("bannan");
String substring = text.substring(g1);
System.out.println(substring);
boolean bannan = false;
if (text.contains(substring)){

    bannan = true;
    System.out.println(bannan);
}

String text2 = tangentbord.nextLine();

System.out.println(text2.replaceAll("bannan",text));

tangentbord.close();


}

}