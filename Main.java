
import model.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("1905005","Emah Khujaemah");
        System.out.println(mhs.getNim());
        System.out.println(mhs.getNama());
        

        Dosen dsn1 = new Dosen("1234567","Harold");
        System.out.println(dsn1.getNidn()); 
        System.out.println(dsn1.getNama());

        Matakuliah matkul1 = new Matakuliah("PPLOO", 4);
        matkul1.setSemester(4);
        matkul1.setPengampu(dsn1);

        Matakuliah matkul2 = new Matakuliah("Pemrograman Web 2", 3);
        
        
        Matakuliah matkul3 = new Matakuliah("PPKPL", 4);
        Matakuliah matkul4 = new Matakuliah("Jaringan Komputer", 3);
        Matakuliah matkul5 = new Matakuliah("Metode Numerik", 3);

        List<Matakuliah> mList = new ArrayList<Matakuliah>();
        mList.add(matkul1);
        mList.add(matkul2);
        mList.add(matkul3);
        mList.add(matkul4);
        mList.add(matkul5);

        Matakuliah.printArray(mList);

    }

    
}
