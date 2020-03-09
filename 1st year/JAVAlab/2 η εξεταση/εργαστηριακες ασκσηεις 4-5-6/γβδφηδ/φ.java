
/**
 * Write a description of class φ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class φ
{
   int cancel_code = 0;
    try {
     System.out.println("Give me the booking ID you want to cancel please");
     cancel_code = scan.nextInt();
    } catch (java.util.InputMismatchException ev) {
     System.out.println(e);
     cancel_code = scan.nextInt();
    }
   boolean succces=tokyo.booking_cancellation(cancel_code);
    
    if (succces)) {
     JOptionPane.showMessageDialog(null, "Booking was canceled with success");
     theFrame1.dispose();
    } else {
     JOptionPane.showMessageDialog(null, "Booking was not canceled with success");
     theFrame1.dispose();
    }
}
