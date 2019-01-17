import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AufgabeZwei
{
    public static void main(String[] args) throws Konstrukt
    {
        Lese();
        CheckEmail("adam@b.com");
    }
    public static void Lese()
    {
        int g=0;
        boolean b;
        while(true)
        {
            try
            {
                g = Integer.parseInt(JOptionPane.showInputDialog("Bitte Zahl reingem"));
                b=true;
            }
            catch (NumberFormatException e)
            {
                System.err.println("MEIN GOTT ICH HAB DOCH ZAHL GESAGT!!!!!! Kannnst du nicht lesen ???????");
                b=false;
            }
            if(b)
            {
                break;
            }
        }
    }

    public static void CheckEmail(String email) throws Konstrukt
    {
        Pattern pattern = Pattern.compile( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );
        Matcher m = pattern.matcher(email);
            boolean a= m.find();
        System.out.println(a);
            if (!a)
            {
                throw new Konstrukt();
            }


    }

}
/* Checked wird während der Kompilierung geprüft: z.B int i={1,2,23,3}
uncheckede wird nicht während der Kompilierung geprüft z.B. x/0 */
