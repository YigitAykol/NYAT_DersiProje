import java.util.Scanner;
public class AnaIslemPlatformu { // extends AkilliCihaz
	private final IAgArayuzu ag_Arayuzu;
	private final IEyleyici eyleyici1;
	private final ISicaklikAlgilayici sicaklikAliglayici1;
	private final IEkran ekran1;
	private final IKullaniciDogrulama kDogrulama1;
	private final ITusTakimi tusTakimi;
	private boolean kapali1;
	
	
	private static final int AC = 1;
	private static final int SICAKLIK_GORUNTULE = 2;
	private static final int KAPA = 3;
	private static final String NULL = null;
	
	
	public AnaIslemPlatformu(boolean kapali, boolean bekleme)
	{
		//super(kapali, bekleme);
		ag_Arayuzu = new agArayuzu();
		eyleyici1 = new eyleyici();
		sicaklikAliglayici1 = new sicaklikAlgilayici();
		ekran1 = new ekran();
		kDogrulama1 = new KullaniciDogrulama();
		tusTakimi = new TusTakimi();
		kapali1 = false;
		
	}
	public void basla()
	{
		//veritabani a1 = new veritabani();
		//a1.baglanti();
		ekran1.mesajGoruntule("Lütfen kullanici adi ve sifrenizi giriniz\n");
		ekran1.mesajGoruntule("Sistem durumu:Beklemde");
		Araclar.bekle();
		int i = 0;
		boolean y;
		String kullaniciAd2;
		do {
			 kullaniciAd2 = this.kullaniciDogrulama();
			++i;
		}while(i < 3 && kullaniciAd2 == null);
		//String kullaniciAd2 = this.kullaniciDogrulama();
		i = 0;
		if(kullaniciAd2 != NULL)
		{
			int sifre;
			do {
				System.out.println("Sifreni gir: ");
				ekran1.mesajGoruntule("Sistem durumu:Beklemde");
				Araclar.bekle();
				sifre = tusTakimi.veriAl();
				y = kDogrulama1.sifreDogrula(sifre);
				++i;
			}while(i < 3 && y == false);
			//ekran1.mesajGoruntule("Sistem durumu:Beklemde");
			//Araclar.bekle();
			//System.out.println("Sifreni gir: ");
			//sifre = tusTakimi.veriAl();
			//System.out.println(kullaniciAd2 + sifre);
			//IBankaBilgiSistemi bankaBilgiSistemi=new BankaBilgiSistemi(new PostgreSQLSurucu());
			if(i != 3)
			{
				KullaniciHesabi kulaniciHesabi = new KullaniciHesabi(sifre, kullaniciAd2);
				ekran1.mesajGoruntule("Sistem durumu:Beklemde");
				Araclar.bekle();
				ekran1.mesajGoruntule("Kullanýcý doðrulama iþlemi baþarýlý...:"+ kulaniciHesabi);
				islemSecimi(kulaniciHesabi);
			}
			//KullaniciHesabi kulaniciHesabi = new KullaniciHesabi(sifre, kullaniciAd2);
			/*
			if (kulaniciHesabi != null){
				ekran1.mesajGoruntule("Kullanýcý doðrulama iþlemi baþarýlý...:"+ kulaniciHesabi);
				//islemSecimi(bankaBilgiSistemi, musteriHesabi);
				islemSecimi(kulaniciHesabi);*/
			else{
				
				
				ekran1.mesajGoruntule("Sistem durumu:Beklemde");
				Araclar.bekle();
				ekran1.mesajGoruntule("hesabýnýz doðrulanamadý");
				kDogrulama1.oturumuKapat();
			}
		}
		//System.out.println("Sifreni gir: ");
		//int sifre = tusTakimi.veriAl();
		//Scanner input = new Scanner(System.in);
		//int sifre1 = input.nextInt();
		//ekran1.mesajGoruntule(kullaniciAd1);
		//IBankaBilgiSistemi bankaBilgiSistemi=new BankaBilgiSistemi(new PostgreSQLSurucu());
		//System.out.println(kullaniciAd2);
		
		//if()
		
			
	}
	private String kullaniciDogrulama()
	{
		return kDogrulama1.kullaniciAl();
	}
	
	private void setAcik()
	{
		this.kapali1 = true;
	}
	private void setKapali()
	{
		this.kapali1 = false;
	}
	
	private void islemSecimi(KullaniciHesabi kulaniciHesabi)
	{
		int secim;
		int sicaklik;
		do {
			secim = anaMenuyuGoster();
			ekran1.ekranTemizle();
			
			switch (secim) {
			case AC:
				ag_Arayuzu.sogutucuAc(eyleyici1);
				setAcik();//True 
				ekran1.mesajGoruntule("Sistem durumu:Beklemde");
				Araclar.bekle();
				break;
			case SICAKLIK_GORUNTULE:
				if(kapali1 == true)
				{
					ekran1.mesajGoruntule("Sicaklik Okunuyor");
					sicaklik = ag_Arayuzu.sicaklikOku(sicaklikAliglayici1);
					ekran1.mesajGoruntule("Sicaklik " + sicaklik);
					ekran1.mesajGoruntule("Sistem durumu:Beklemde");
					Araclar.bekle();
				}
				else
				{
					ekran1.mesajGoruntule("Sistem Acik Degil");
					ekran1.mesajGoruntule("Sistem durumu:Beklemde");
					Araclar.bekle();
				}
				break;
			case KAPA:
				if(kapali1 != false)
				{
					setKapali();
					ekran1.mesajGoruntule("Sistem Kapaniyor");
					kDogrulama1.oturumuKapat();
				}
				else
					ekran1.mesajGoruntule("Sistem Zaten Kapali");	
				break;
			default:
				ekran1.mesajGoruntule("1-3 arasýnda bir sayý girmelisiniz");
			}
		}while(secim!=4);
		
		
	}
	private int anaMenuyuGoster()
	{
		ekran1.mesajGoruntule("**********************************************");
		ekran1.mesajGoruntule("Ana Menu");
		ekran1.mesajGoruntule("1-Cihazi Ac");
		ekran1.mesajGoruntule("2-Sicaklik Oku");
		//ekran1.mesajGoruntule("3-Para Yatýr");
		ekran1.mesajGoruntule("3-Cihazi Kapa");
		ekran1.mesajGoruntule("Seciminiz:");
		ekran1.mesajGoruntule("**********************************************");
		return tusTakimi.veriAl();
	}
}
