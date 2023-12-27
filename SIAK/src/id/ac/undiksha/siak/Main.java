// Main.java
package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;


public class Main {
    public static void main(String[] args) {
        Mahasiswa ani = new Mahasiswa();

        ani.setNim("2001");
        ani.setNama("Ani");
        ani.setJenisKelamin(true);
        ani.setAlamat("Singaraja");
        ani.setTanggalLahir("1 Januari 2000");
        //ani.setProdi("Ilmu Komputer");
        ani.getProdi().setKodeProdi("10");
        ani.getProdi().setNamaProdi("ILKOM");


        ani.printAll();
        
        Mahasiswa budi = new Mahasiswa();
        budi.printAll();

        
        Mahasiswa caca = new Mahasiswa("Caca", "1 Feb 2000", "Gianyar", true, "2003","");
        caca.getProdi().setKodeProdi("10");
        caca.getProdi().setNamaProdi("ILKOM");
        caca.printAll();
        
        
        Dosen test = new Dosen("Caca", "1 Feb 2000", "Gianyar", true, "203","Geografi");
        test.printAll();

        
    }
}
