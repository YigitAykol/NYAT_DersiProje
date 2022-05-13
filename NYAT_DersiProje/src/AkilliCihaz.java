
abstract public class AkilliCihaz {
	private boolean kapali;
	private boolean bekleme;
	private boolean algilama;
	private boolean islemYapiliyor;
	
	public AkilliCihaz(boolean kapali, boolean bekleme)
	{
		this.kapali = kapali;
		this.bekleme = bekleme;
	}
	public void setKapali(boolean kapali)
	{
		this.kapali = true;
	}
	public void setIslem(boolean islemYapiliyor)
	{
		this.islemYapiliyor = true;
	}
	public void setAlgilama(boolean algilama)
	{
		this.algilama = true;
	}
	public void setBekleme(boolean bekleme)
	{
		this.bekleme = true;
	}
	public boolean getKapali()
	{
		return kapali;
	}
	public boolean getBekleme()
	{
		return bekleme;
	}
	public boolean getAlgilama()
	{
		return algilama;
	}
	public boolean getIslme()
	{
		return islemYapiliyor;
	}
	
}
