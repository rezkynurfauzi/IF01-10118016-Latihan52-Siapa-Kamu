/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan52.siapa.kamu;

/**
 *
 * @author Rezky
 */
public class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa() {
        System.out.println("Saya "+nama+" umur "+umur+" tahun sedang belajar di kelas "+kelas);
    }

    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }    
}
