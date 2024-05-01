/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan401;

/**
 *
 * @author INSTIKI
 */
public class Pertemuan401 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bukuteman BTeman = new bukuteman();
//        BTeman.Storedata();
//        BTeman.viewdata();
        String ul = "YA";
        do{
            System.out.println("A. View Data");
            System.out.println("B. Add Data");
            System.out.println("C. Edit Data");
            System.out.println("D. Delete Data");
            System.out.println("E. Exit");
            System.out.println("Choose Option (A/B/C/D/E): ");
            String mPIL = BTeman.dtIN.nextLine();
            switch (mPIL) {
            case"A or a" -> BTeman.viewdata();
            case"B or b" -> BTeman.Storedata();
            case"C or c" -> BTeman.Update(0);
            case"D or c" -> BTeman.Destroy(0);
            case"E or e" -> ul = "tidak";
            default -> System.out.println("wwwwww");
            }
        }while(ul.equals("YA"));
    }
    
}