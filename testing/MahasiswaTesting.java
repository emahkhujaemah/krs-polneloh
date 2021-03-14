package testing;

import model.Mahasiswa;

public class MahasiswaTesting {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("","");

        //Kasus 2
        String expectedResult1 = "NIM tidak boleh kosong!";
        if (mhs.setNim1("") == expectedResult1){
            System.out.println(mhs.setNim1(""));
            System.out.println("Test 2 - Berhasil \n");
        }else{
            System.out.println(mhs.setNim1(""));
            System.out.println("Test 2 - Gagal");
        }
        
        //Kasus 1
        String expectedResult2 = "Panjang Karakter NIM harus 7!";
        if (mhs.setNim1("12345678") == expectedResult2) {
            System.out.println(mhs.setNim1("12345678"));
            System.out.println("Test 2 = Berhasil \n");
        }else{
            System.out.println(mhs.setNim1("12345678"));
            System.out.println("Test 2 - Gagal");
        }

        String expectedResult3 = "NIDN harus berisi angka";
        if(mhs.setNim1("efg34j5") == expectedResult3){
            System.out.println(mhs.setNim1("efg34j5"));
            System.out.println("Test 3 - Berhasil");
        }else{
            System.out.println(mhs.setNim1("efg34j5"));
            System.out.println("Test 3 - Gagal");
        }
         
    }
}
