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
        tambahMatakuliahPengampu(listMatakuliahPengampu);

    }

    public void lihatListMatakuliahPengampu(){ 
        matakuliahPengampu.getPengampu();
        // System.out.println("Lihat Matakuliah");
        // for(Matakuliah mt : listMatakuliahPengampu){        
        //     System.out.println(mt.Dosen();
        // }       
    }

    public void tambahMatakuliahPengampu(List<Matakuliah> listMatakuliahPengampu){
        System.out.println("\n================================");
        System.out.println("Tambah Matakuliah Pengampu");
        System.out.println("Nama Dosen : "+nama);
        System.out.println("NIDN       : "+nidn); 
        
    }
    
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
    
    public String getNidn() {
        return nidn;
    }
}