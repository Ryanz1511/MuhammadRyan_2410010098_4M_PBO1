package Gym;

public class Member {

    
    private String id;
    private String nama;
    private int umur;
    private int lamaMember;

   
    public Member(String id, String nama, int umur, int lamaMember) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.lamaMember = lamaMember;
    }

 
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public int getLamaMember() {
        return lamaMember;
    }

 
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setLamaMember(int lamaMember) {
        this.lamaMember = lamaMember;
    }

   
    public double hitungBiaya() {
        return 0;
    }

    
    public void tampilData() {
        System.out.println("-------------------------");
        System.out.println("ID            : " + id);
        System.out.println("Nama          : " + nama);
        System.out.println("Umur          : " + umur);
        System.out.println("Lama Member   : " + lamaMember + " Bulan");
    }
}