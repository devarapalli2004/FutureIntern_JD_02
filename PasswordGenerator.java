package cscorner;
import java.util.Random;
public class PasswordGenerator {
    public static void main(String[] ards){
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";
        String specialChars="<>,.?/}][{+-=_()!@#$%^&*";
        String Combination=upper+lower+num+specialChars;
        int len=7;
        char[] password=new char[len];
        Random r=new Random();
        for(int i=0;i<len;i++){
            password[i]=Combination.charAt(r.nextInt(Combination.length()));
        }
        System.out.println("Generated password is:"+new String(password));


    }
}
