package AnimalPark;

public class Animal {

	public static void main(String[] args) {
		
		Kopek kopek = new Kopek();
		kopek.egitimVer();
		kopek.temizle();
		kopek.asiYap();
		
		Koyun koyun = new Koyun();
		koyun.kırp();
		koyun.asiYap();
		koyun.yemekVer("ot");
		
		At at = new At();
		at.egitimVer();
		at.yemekVer("yulaf");
		at.bBoy = 1.15;
		

	}

}
