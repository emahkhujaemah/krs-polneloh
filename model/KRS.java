package model;
package model.*;
import java.util.*;


public class KRS {
    private String noKRS;
    private List<Matakuliah> listMatakuliahPengampu;

    public KRS(String noKRS){
        this.noKRS = noKRS;
    }

    public void tambahMatakuliahKRS(Matakuliah matakuliah){

    }

    public static void showMatakuliah(List<Matakuliah> mList){
        System.out.println("");
        for(Matakuliah mt : mList){        
            System.out.println(mt.showMatakuliah());
        }
    }
    

    public void setNOKRS(String noKRS){
        this.noKRS = noKRS;
    }

    public String getNOKRS(){
        return noKRS;
    }
}
