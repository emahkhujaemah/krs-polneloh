package model;
// import model.KRS;

public class Mahasiswa extends Person{
    private String nim;
    private KRS krs;

    public Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.setNama(nama);
    }

    @Override
    public void showProfil(){
        
    }

    public void cetakKRS(){
        System.out.println("Cetak KRS");
    }

    public void setNim(String nim){        
        
        this.nim = nim;
    }
    
    public String setNim1(String nim){
        boolean adaHuruf;
        try {
            int angka = Integer.parseInt(nim);
            adaHuruf = false;
        } catch (Exception e) {
            adaHuruf = true;
        }
        
        //1. Kasus ketika nim tidak boleh kosong
        if(nim.equals("") || nim.isEmpty()){
            return "NIM tidak boleh kosong!";   
        }

        //2. kasus ketika NIM harus 7 karakter
        if(nim.length() != 7 ){
            return "Panjang Karakter NIM harus 7!";
        }

        //3. Kasus ketika NIM tidak boleh huruf
        if(adaHuruf){
            return "NIDN harus berisi angka";
        }
        
        //1. Kasus ketika inputan harus angka
        // if (nim.matches("[0-9]*")) {
        //     return "Inputan NIM Harus Angka";
        // }

        return this.nim = nim;
    }

    public String getNim(){
        return this.nim;
    }

    public void pilihPaketKRS(KRS krs){

    }

    public KRS getKRS(){
        return krs;
        // krs.toString;
    }

}
