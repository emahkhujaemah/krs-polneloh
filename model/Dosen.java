package model;

 import java.util.*;

 import model.Matakuliah;

public class Dosen extends Person{
    private String nidn;
    // private static List<Matakuliah> listMatakuliahPengampu = new ArrayList<Matakuliah>();
    private List<Matakuliah> listMatakuliahPengampu;
    private Matakuliah matakuliahPengampu;

    public Dosen(String nidn, String nama){
        this.nidn = nidn;
        this.setNama(nama);
    }

    @Override
    public void showProfil(){
        lihatListMatakuliahPengampu();
        
    }

    public void lihatListMatakuliahPengampu(){ 
        System.out.println("\n==============================");       
        System.out.println("Nama Dosen : "+nama);
        System.out.println("NIDN       : "+nidn);
              
    }

    public void tambahMatakuliahPengampu(List<Matakuliah> listMatakuliahPengampu){
        System.out.println("Tambah Matakuliah Pengampu");
        this.listMatakuliahPengampu =  listMatakuliahPengampu;

    }
    
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
    
    public String getNidn() {
        return nidn;
    }
}