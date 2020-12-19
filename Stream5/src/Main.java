
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Java 7 ile birlikte gelen try With Resource kullanarak projeleri clear code tanımını uygun formata getiriyoruz.
        try(FileWriter fileWriter = new FileWriter("dosya.txt");
            FileWriter fileWriter2 = new FileWriter("dosya2.txt",true);
            FileWriter diller = new FileWriter("diller.txt")){//bu yapı sayesinde otomatik oalrak doyaları kapatabiliyoruz.Zamandan ve Enerjiden Tasarruf 
        
            fileWriter.write("Deneme 1 2 3");
            fileWriter2.write("ikinci dosya yazma işlemi yapılıyor ...");
            
            Scanner scn = new Scanner(System.in);
            String dil ;
            while (true) {                
                System.out.println("Lütfen bir dil giriniz :");
                dil = scn.nextLine();
                //diller.write(dil+"\n");//BURADA YAZARSAK -1 DE YAZILMIŞ OLUR
                if(dil.equals("-1")){
                    System.out.println("Program Sonlandırılıyor.");
                    
                    Thread.sleep(2000);
                    
                    System.out.println("İşleminiz Başarı ile Sonlandırıldı.Dosyanızı Kontrol Ediniz");
                    
                    break;
                }
                
                diller.write(dil+"\n");
            }
            
            
        }catch(IOException ex){
            System.out.println("Dosya Oluşturulurken bir hata meydana geldi");
            
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
