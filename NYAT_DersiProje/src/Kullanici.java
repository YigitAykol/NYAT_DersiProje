
public class Kullanici {
	private String kullaniciadi;
	//private int sifre;
	
	public Kullanici(String kullaniciad)
	{
		this.kullaniciadi = kullaniciad;
		//this.sifre = sifre;
	}
	
	public String getIsim()
	{
		return kullaniciadi;
	}
	public void setIsim(String kullaniciadi)
	{
		this.kullaniciadi = kullaniciadi;
	}
	/*
	public int getSifre(int sifre)
	{
		return sifre;
	}*/
	
}
