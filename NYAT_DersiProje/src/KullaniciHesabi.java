
public class KullaniciHesabi {
	private int sifre;
	private Kullanici kullanici;
	
	public KullaniciHesabi(int sifre, String kullaniciIsmi)
	{
		this.sifre = sifre;
		this.kullanici = new Kullanici(kullaniciIsmi);
	}
	
	public int getSifre()
	{
		return sifre;
	}
	public Kullanici getKullanici()
	{
		return kullanici;
	}
	public void setKullanici(Kullanici kullanici) {
		this.kullanici = kullanici;
	}
	public void setSifre(int sifre)
	{
		this.sifre = sifre;
	}
	@Override
	public String toString() {
		return "KullaniciHesabi{" + "kullanici adi:"+ kullanici.getIsim()+"soyadi:"+
				"sifre=" + sifre +
				'}';
	}
}
