package AnimalPark;

public class hayvan {

	public int id;
	public String isim;
	public int yas;
	
	
	public void suVer() {
		System.out.println("Su Verildi.");
	}
	
	public void asiYap() {
		System.out.println("Aşı Yapışdı.");
	}
	
	public void temizle() {
		System.out.println("Temizlendi.");
	}
	
	public void yemekVer(String yemek) {
		System.out.println("Yemek Verildi." + yemek);
	}
	
}
