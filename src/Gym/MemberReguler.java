package Gym;

public class MemberReguler extends Member {

 
    private final double BIAYA = 100000;


    public MemberReguler(String id, String nama, int umur, int lamaMember) {
        super(id, nama, umur, lamaMember);
    }

   
    @Override
    public double hitungBiaya() {
        return getLamaMember() * BIAYA;
    }

   
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Jenis Member : Reguler");
        System.out.println("Biaya        : Rp" + hitungBiaya());
    }
}