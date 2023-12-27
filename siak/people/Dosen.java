// Dosen.java
package id.ac.undiksha.siak.people;

public class Dosen extends Manusia {

	private String nip;
	private String mataKuliahDiajar;
	
	public Dosen() {
		super();
        this.nip = "<NIP>";
        this.mataKuliahDiajar = "<Prodi>";
    }
	
	 public Dosen(
			String nama, 
			String alamat, 
			String tanggalLahir, 
			boolean jenisKelamin, 
			String nip,
			String mataKuliahDiajar
	) {
		super(nama, alamat, tanggalLahir, jenisKelamin);
		this.nip = nip;
		this.mataKuliahDiajar = mataKuliahDiajar;
	}


	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	
	public String getMataKuliahDiajar() {
		return mataKuliahDiajar;
	}
	public void setMataKuliahDiajar(String mataKuliahDiajar) {
		this.mataKuliahDiajar = mataKuliahDiajar;
	}
	
	public void printAll() {
        System.out.println("Dosen");
        System.out.println("NIP \t\t:" + getNip());
        super.printAll();
        System.out.println("Mengajar \t:" + getMataKuliahDiajar());
        System.out.println("------------------------------");
    }

}
