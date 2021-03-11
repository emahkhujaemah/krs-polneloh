package model;

// import model.Dosen;

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

    }

    public int getSemester(){
        return semester;
    }

    public void setPengampu(Dosen Pengampu){
        // this.pengampu = pengampu;
    }

    public Dosen getPengampu(){
        return pengampu;
    }

    public void showMatakuliah(){
        System.out.println("Mahasiswa");
    }



}
