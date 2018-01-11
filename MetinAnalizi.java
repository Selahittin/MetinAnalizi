import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MetinAnalizi {
    
    public static void main(String[] args) {
        
        String sesliHarfler = "AEIOUaeiou";
        int sesliSayac=0, sessizSayac=0;
        
        try{
            File file = new File("C:\\Users\\USER\\Desktop\\deneme.txt");
            Scanner oku = new Scanner(file,"UTF-8");
            
            while (oku.hasNextLine()){
                String line = oku.nextLine();
                System.out.println("Karakter sayısı: " + line.length());
                System.out.println("Kelime sayısı: " + line.split(" ").length);
                System.out.println("Cümle sayısı: " + line.split("\\.").length);
                
                char []array = line.toCharArray();
                
                for (int i = 0; i < array.length; i++) {
                    char c = array[i];
                    
                    if (sesliHarfler.contains(""+c)){
                        sesliSayac++;
                    }
                    else{
                        if ((c>='a' && c<='z') || (c>='A' && c<='Z')){
                            sessizSayac++;
                        }
                    }
                }
                System.out.println("Sesli harf sayısı: " + sesliSayac);
                System.out.println("Sessiz harf sayısı: " + sessizSayac);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Okuma Hatası: " + e);
        }
    }
}
