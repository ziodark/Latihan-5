package bukutamu;
public class BukuTamu {
private static int tamu = 0;
private final String telp;
private final String nama;

public BukuTamu(String x, String y){
    nama = x;
    telp = y;
    tamu++;
}
public static int getTamu(){
    return tamu;
}
public void tampilan(){
    System.out.println("Nama           : " +nama);
    System.out.println("No. Telepon/HP : " +telp);
}
    
}
