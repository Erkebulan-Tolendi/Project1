import java.io.File;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

class pt13_4{
	public static void main(String[] args) throws Exception{
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    	Date date = new Date();
		Scanner tema = new Scanner (new File("13_3.txt"));
        Scanner tema2 = new Scanner (new File("13_32.txt"));
        Scanner sc = new Scanner (System.in);
        String kod = sc.nextLine();

            while (tema.hasNextLine() && tema2.hasNextLine()) {
				String line = tema.nextLine();
				String line1 = tema2.nextLine();


				if(line.equals(kod)){
					System.out.print(line+ " "+line1+" ");
					System.out.println(formatter.format(date));
				}
			}

	}
}
/*import java.text.SimpleDateFormat;
import java.util.Date;
public class MainF {
public static void main(String[] args) {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    System.out.println(formatter.format(date));
}
} */