package bukutamu;
import java.util.Scanner;
public class MainBT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Banyak Tamu : ");
        int b = in.nextInt();
        BukuTamu buku[] = new BukuTamu[b];
        int t=0;
        do{
            System.out.print("Masukan nama          : ");
            String p = in.next();
            System.out.print("Masukan No Telepon/HP : ");
            String q = in.next();
            buku[t]=new BukuTamu(p,q);
            t++;
            System.out.println("ID anda : "+BukuTamu.getTamu());
        }
        while(t<b);{
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        for(int i=0;i<b;i++){
            buku[i].tampilan();
        }
        System.out.println("");
    }
        }
    }