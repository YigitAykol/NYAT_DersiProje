import java.util.Random;
public class sicaklikAlgilayici implements ISicaklikAlgilayici{
	public int sicaklikOku()
	{
		Random rand = new Random();
		int sicaklik = rand.nextInt(1000);
		return sicaklik;
	}
}
