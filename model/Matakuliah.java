package model;

import model.*;
import java.util.*;

public class Matakuliah {
    private String namaMatakuliah;
    private int sks;
    private int semester;
    private Dosen pengampu;

    public Matakuliah(String namaMatakuliah, int sks){
        this.namaMatakuliah = namaMatakuliah;
        this.sks = sks;
    }

    public void setNamaMatakuliah(String namaMatakuliah){
        this.namaMatakuliah = namaMatakuliah;

    }

    public String getNamaMatakuliah(){
        return namaMatakuliah;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

    public int getSks(){
        return sks;
    }

    public void setSemester(int semester){
        this.semester = semester;
    }

    public int getSemester(){
        return semester;
    }

    public void setPengampu(Dosen Pengampu){
        // this.setPengampu = pengampu;
    }

    public Dosen getPengampu(){
        return pengampu;
    }

    public String showMatakuliah(){
        
      return "Nama Matakuliah "+namaMatakuliah + "\nSKS :" + sks + semester;
    }

    public static void printArray(List<Matakuliah> mList){
        System.out.println("");
        for(Matakuliah mt : mList){        
            System.out.println(mt.showMatakuliah());
        }
    }



}
