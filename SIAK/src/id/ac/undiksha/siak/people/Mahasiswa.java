// Mahasiswa.java
package id.ac.undiksha.siak.people;

public class Mahasiswa extends Manusia {
    private String nim;
    private String prodi;

    public Mahasiswa() {
    	super();
        this.nim = "<NIM>";
        this.prodi = "<Prodi>";
    }

    public Mahasiswa(
    		String nama,
    		String alamat, 
    		String tanggalLahir, 
    		boolean jenisKelamin, 
    		String nim, 
    		String prodi
    ) {
		super(nama, alamat, tanggalLahir, jenisKelamin);
		this.nim = nim;
		this.prodi = prodi;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void printAll() {
        System.out.println("Mahasiswa");
        System.out.println("NIM \t\t:" + getNim());
        super.printAll();
        System.out.println("Program Studi \t:" + getProdi());
        System.out.println("------------------------------");
    }
}

