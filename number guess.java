import javax.swing.*;
import java.util.*;
class num
{
    public static void main(String s[])
    {
        JFrame fr;
        fr=new JFrame();
        fr.setLayout(null);
        fr.setSize(600,600);
        Random random = new Random();
        int r = random.nextInt(20);
        int find = random.nextInt(r);
        System.out.println(find);
        String n = JOptionPane.showInputDialog(fr,"enter the number which is in range 1-100");
        while(!n.equals(String.valueOf(find))) {
            n = JOptionPane.showInputDialog(fr,"enter the number which is in range 1-100");
        }
        JOptionPane.showMessageDialog(fr,"Finally you entered the correct Number"  + n);
}
}
