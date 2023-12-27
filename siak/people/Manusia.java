// Manusia.java
package id.ac.undiksha.siak.people;

public abstract class Manusia {
    private String nama;
    private String alamat;
    private String tanggalLahir;
    private boolean jenisKelamin;

    public Manusia() {
        this.nama = "<Nama>";
        this.alamat = "<Alamat>";
        this.tanggalLahir = "<Tanggal Lahir>";
        this.jenisKelamin = false;
    }

    public Manusia(String nama, String alamat, String tanggalLahir, boolean jenisKelamin) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    private boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public String getJenisKelamin() {
		if (isJenisKelamin()) {
			return "Perempuan";
		} else {
			return "Laki-Laki";
		}
	}

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    public void printAll() {
        System.out.println("Nama \t\t:" + getNama());
        System.out.println("Kelamin \t:" + getJenisKelamin());
        System.out.println("Tanggal Lahir \t:" + getTanggalLahir());
    }
}
