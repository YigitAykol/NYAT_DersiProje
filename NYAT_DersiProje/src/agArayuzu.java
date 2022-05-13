
public class agArayuzu implements IAgArayuzu{
	
	private IEyleyici eyleyici1;
	private ISicaklikAlgilayici sicaklikAliglayici1;
	public void sogutucuAc(IEyleyici eyleyici1)
	{
		//System.out.println("Sogutucu Kapatiliyor");
		this.eyleyici1 = eyleyici1;
		eyleyici1.sogutucuAc();
		
	}
	public void sogutucuKapat()
	{
		System.out.println("Sogutucu kapatiliyor");
	}
	/*
	public void sicalikGorutuleme()
	{
		System.out.println("Sicaklik goruntuleniyor");
	}*/
	public int sicaklikOku(ISicaklikAlgilayici sicaklikAliglayici1)
	{
		this.sicaklikAliglayici1 = sicaklikAliglayici1;
		return sicaklikAliglayici1.sicaklikOku();
	}

}
