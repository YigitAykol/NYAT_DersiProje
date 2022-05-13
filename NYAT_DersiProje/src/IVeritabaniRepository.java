
public interface IVeritabaniRepository {
	//public KullaniciHesabi kullaniciDogrula(String kullaniciadi, int sifre);
	
	//public void kullaniciGuncelle(Kullanici kullaniciHesabi);
	
	public void baglanti();
	
	public boolean kullaniciIsmiDogrulama(String kullaniciAdi1);
	
	public boolean kullaniciSifreDogrulama(int kullaniciSifre);
}	
