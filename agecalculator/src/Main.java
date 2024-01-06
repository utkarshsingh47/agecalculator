import javax.swing.*;
import java.util.GregorianCalendar;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//       declare variable
        int bY,cY,ageY;
//        get born year from user as input
        bY= Integer.parseInt(JOptionPane.showInputDialog(null,"enter birth year"));
        System.out.println(bY);
        //      to get current year from calender called  GregorianCalendar
        GregorianCalendar calendar=new GregorianCalendar();
        cY=calendar.get(GregorianCalendar.YEAR);
//    to find age
        ageY=cY-bY;
        JOptionPane.showMessageDialog(null,"ur age is " +ageY);
    }
}