package model;

 import java.util.*;

 import model.Matakuliah;

public class Dosen extends Person{
    private String nidn;
    private List<Matakuliah> listMatakuliahPengampu;
    private Matakuliah matakuliahPengampu;

    public Dosen(String nidn, String nama){
        this.nidn = nidn;
        this.setNama(nama);
    }

    @Override
    public void showProfil(){
        
    }

    public void lihatListMatakuliahPengampu(){
        System.out.println("Lihat List Matakuliah Pengampu");
        
    }

    public void tambahMatakuliahPengampu(Matakuliah matakuliah){
        System.out.println("Tambah Matakuliah Pengampu");
    }
    
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
    
    public String getNidn() {
        return nidn;
    }
}