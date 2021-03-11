package model;

public abstract class Person {
    
    protected String nama;

    public abstract void  showProfil();
    
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

}
