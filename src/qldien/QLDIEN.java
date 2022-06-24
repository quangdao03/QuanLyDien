
package qldien;

import Views.frmLogin;
import Views.frmMain;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class QLDIEN {

    public static String dbURL = "jdbc:sqlserver://QUANGDAO\\SQLEXPRESS:1433;databaseName=QLDien;user=sa;password=12345";
    public static String UN,PW,FN;
    public static String maNV;
    public static void main(String[] args) {
        new frmLogin().setVisible(true);
    }
    public static void playSound(String soundName){
        try{
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
                    new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }
        catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println(e.toString());
        }
    }
}
