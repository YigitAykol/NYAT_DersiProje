import java.util.Scanner;
public class KullaniciDogrulama implements IKullaniciDogrulama{
	private String kullaniciAdi1;
	//private int kullaniciSifre1;
	private IVeritabaniRepository veritabani;
	private ISistemDurumu durum;
	//private boolean x;
	public void veritabiniAtama()
	{
		this.veritabani = new VeritabaniRepository();
		
	}
	public String kullaniciAl()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Kullanici adinizi giriniz ...");
        Araclar.bekle(2000);
        String mesaj = input.nextLine();
        this.kullaniciAdi1= mesaj; //Döndürülmesi istenen hesap numarasý buraya yazýlmalý
        return kisiDogrula();
	}
	public String kisiDogrula()
	{
		//this.veritabani = new veritabani();
		veritabiniAtama();
		
		boolean y = false;
        Araclar.bekle();
        
        y = veritabani.kullaniciIsmiDogrulama(kullaniciAdi1);
       
        System.out.println("kisi dogrulaniyor...");
        
        String x;
		this.durum = new bekleme();
		x = durum.durumDon();
		System.out.println("Sistem durumu: " + x);
        if(y == false)
        {
        	System.out.println("KisiAdi dogrulaniyor...");
			Araclar.bekle();
			System.out.println("Sistem durumu:Beklemde");
        	System.out.println("KisiAdi hatali...");
        	kullaniciAdi1 = null;
        }
        else
        	System.out.println("KisiAdi Dogrulandi...");
        
        return kullaniciAdi1;
	}
	public boolean sifreDogrula(int kullaniciSifre)
	{
		veritabiniAtama();
		
		boolean y = false;
        Araclar.bekle();
        String x;
		this.durum = new islemyapiliyor();
		x = durum.durumDon();
        y = veritabani.kullaniciSifreDogrulama(kullaniciSifre);
        
        System.out.println("kisi dogrulaniyor...");
        System.out.println("Sistem durumu: " + x);
        if(y == false)
        {
        	System.out.println("kisi sifre hatali...");
        	kullaniciSifre = 0;
        }
        else
        	System.out.println("Sifre Dogrulandi...");
        
        return y;
	}
	public void oturumuKapat()
	{
		System.out.println("kullanici oturumu kapatiliyor...");
		String x;
		this.durum = new islemyapiliyor();
		x = durum.durumDon();
		System.out.println("sistem durumu " + x);
        Araclar.bekle();
	}
	public boolean girisYapildimi()
	{
		 System.out.println("kullanici alýndý...");
	     Araclar.bekle();
	     return true;
	}
	
	
}
