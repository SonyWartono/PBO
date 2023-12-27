// Prodi.java
package id.ac.undiksha.siak.organisasi;
import id.ac.undiksha.siak.organisasi.Jurusan;

public class Prodi implements Jurusan {
	private String kodeProdi;
	private String namaProdi;
	public Prodi() {
		
	}
	public Prodi(String kodeProdi, String namaProdi) {
		super();
		this.kodeProdi = kodeProdi;
		this.namaProdi = namaProdi;
	}
	public String getKodeProdi() {
		return kodeProdi;
	}
	public void setKodeProdi(String kodeProdi) {
		this.kodeProdi = kodeProdi;
	}
	public String getNamaProdi() {
		return namaProdi;
	}
	public void setNamaProdi(String namaProdi) {
		this.namaProdi = namaProdi;
	}
	private String kodeJurusan;
	@Override
	public void setKodeJurusan(String kodeJurusan) {
		this.kodeJurusan = kodeJurusan;
		
	}
	@Override
	public String getKodeJurusan() {
		return this.kodeJurusan;
	}

	}
	@Override
	public void setNamaJurusan(String namaJurusan) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getNamaJurusan() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
