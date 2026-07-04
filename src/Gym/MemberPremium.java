package Gym;

public class MemberPremium extends Member {


    private final double BIAYA = 250000;


    public MemberPremium(String id, String nama, int umur, int lamaMember) {
        super(id, nama, umur, lamaMember);
    }


    @Override
    public double hitungBiaya() {
        return getLamaMember() * BIAYA;
    }


    public String getBonus() {
        return "Personal Trainer Gratis";
    }

    
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Jenis Member : Premium");
        System.out.println("Biaya        : Rp" + hitungBiaya());
        System.out.println("Bonus        : " + getBonus());
    }
}