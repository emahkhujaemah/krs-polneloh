
import model.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Matakuliah matkul1 = new Matakuliah("PPLOO", 4);
        Matakuliah matkul2 = new Matakuliah("Pemrograman Web 2", 3);   
        Matakuliah matkul3 = new Matakuliah("PPKPL", 4);
        Matakuliah matkul4 = new Matakuliah("Jaringan Komputer", 3);
        Matakuliah matkul5 = new Matakuliah("Metode Numerik", 3);

        Dosen dsn1 = new Dosen("1234567","Harold");
        Dosen dsn2 = new Dosen("1784938", "Hinami");
        Dosen dsn3 = new Dosen("1723556", "Tomozaki");
        Dosen dsn4 = new Dosen("2356982", "Alllen");
        Dosen dsn5 = new Dosen("2355383", "Gareki");

        matkul1.setPengampu(dsn1);
        matkul2.setPengampu(dsn2);
        matkul3.setPengampu(dsn3);
        matkul3.setPengampu(dsn4);
        matkul3.setPengampu(dsn5);

        List<Matakuliah> mList = new ArrayList<Matakuliah>();
        mList.add(matkul1);
        mList.add(matkul2);
        mList.add(matkul3);
        mList.add(matkul4);
        mList.add(matkul5);

        Matakuliah.printArray(mList);

        

    }

    
}
