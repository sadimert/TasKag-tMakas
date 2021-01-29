import java.util.Scanner;
public class TasKagıtMakas{
public static void main(String args []){
Scanner s = new Scanner(System.in);
int kullan_puan =0;
int pc_puan=0;
System.out.println("Taş kağıt makas oyununa hoş geldiniz!");
System.out.println("1-Taş 2-Kağıt 3-Makas");
while(true) {
System.out.println("Seçiminiz: ");
int secim = s.nextInt();
int pc_secim = (int)(Math.random()*3);
    switch (secim) {
        case 1:
 switch (pc_secim) {
    case 1:
        System.out.println("Bilgisayarın seçimi: TaşnSonuç: Berabere");
        System.out.println("Puanınız: "+kullan_puan+" Bilgisayarın puanı:"+pc_puan);
        break;
    case 2:
        System.out.println("Bilgisayarın seçimi: KağıtnSonuç: Kaybettiniz");
        pc_puan++;
        System.out.println("Puanınız: "+kullan_puan+" Bilgisayarın puanı:"+pc_puan);
        break;
    default:
        System.out.println("Bilgisayarın seçimi: MakasnSonuç: Kazandınız");
        kullan_puan++;
        System.out.println("Puanınız: " + kullan_puan + " Bilgisayarın puanı:" +pc_puan);
        break;
}
break;
        case 2:
switch (pc_secim) {
    case 1:
        System.out.println("Bilgisayarın seçimi: TaşnSonuç: Kazandınız");
        kullan_puan++;
        System.out.println("Puanınız: "+kullan_puan+" Bilgisayarın puanı:"+pc_puan);
        break;
    case 2:
        System.out.println("Bilgisayarın seçimi: KağıtnSonuç: Berabere");
        System.out.println("Puanınız: "+kullan_puan+" Bilgisayarın puanı:"+pc_puan);
        break;
    default:
        System.out.println("Bilgisayarın seçimi: MakasnSonuç: Kaybettiniz");
        pc_puan++;
        System.out.println("Puanınız: " + kullan_puan + " Bilgisayarın puanı:" + pc_puan);
        break;
}
            break;
        case 3:
 switch (pc_secim) {
    case 1:
        System.out.println("Bilgisayarın seçimi: TaşnSonuç: Kaybettiniz");
        pc_puan++;
        System.out.println("Puanınız: "+kullan_puan+" Bilgisayarın puanı:"+pc_puan);
        break;
    case 2:
        System.out.println("Bilgisayarın seçimi: KağıtnSonuç: Kazandınız");
        kullan_puan++;
        System.out.println("Puanınız: "+kullan_puan+" Bilgisayarın puanı:"+pc_puan);
        break;
    default:
        System.out.println("Bilgisayarın seçimi: MakasnSonuç: Berabere");
        System.out.println("Puanınız: " + kullan_puan + " Bilgisayarın puanı:" +pc_puan);
        break;
}
break;
        default:
            System.out.println("Hatalı giriş yaptınız tekrar deneyin");
            continue;
    }
if(kullan_puan==3){
System.out.println("Oyunu "+kullan_puan+"-"+pc_puan+" kazandınız");
break; }
else if(pc_puan==3){
System.out.println("Oyunu "+pc_puan+"-"+kullan_puan+" kaybettiniz");
break; }
}
}
}