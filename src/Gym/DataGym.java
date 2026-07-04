package Gym;

public class DataGym {


    private Member[] daftarMember = new Member[100];
    private int jumlahMember = 0;

   
    public void tambahMember(Member member) {
        if (jumlahMember < daftarMember.length) {
            daftarMember[jumlahMember] = member;
            jumlahMember++;
            System.out.println("Member berhasil ditambahkan.");
        } else {
            System.out.println("Data penuh!");
        }
    }

   
    public void tampilSemuaMember() {

        if (jumlahMember == 0) {
            System.out.println("Belum ada data member.");
            return;
        }

        System.out.println("\n===== DAFTAR MEMBER =====");

        for (int i = 0; i < jumlahMember; i++) {
            daftarMember[i].tampilData();
            System.out.println("-------------------------");
        }
    }


    public Member cariMember(String id) {

        for (int i = 0; i < jumlahMember; i++) {

            if (daftarMember[i].getId().equalsIgnoreCase(id)) {
                return daftarMember[i];
            }

        }

        return null;
    }

    
    public void hapusMember(String id) {

        boolean ditemukan = false;

        for (int i = 0; i < jumlahMember; i++) {

            if (daftarMember[i].getId().equalsIgnoreCase(id)) {

                for (int j = i; j < jumlahMember - 1; j++) {
                    daftarMember[j] = daftarMember[j + 1];
                }

                daftarMember[jumlahMember - 1] = null;
                jumlahMember--;

                ditemukan = true;

                System.out.println("Member berhasil dihapus.");
                break;
            }

        }

        if (!ditemukan) {
            System.out.println("Member tidak ditemukan.");
        }

    }

    
    public void editMember(String id, String namaBaru, int umurBaru, int lamaBaru) {

        Member member = cariMember(id);

        if (member != null) {

            member.setNama(namaBaru);
            member.setUmur(umurBaru);
            member.setLamaMember(lamaBaru);

            System.out.println("Data berhasil diperbarui.");

        } else {

            System.out.println("Member tidak ditemukan.");

        }

    }

 
    public Member[] getDaftarMember() {
        return daftarMember;
    }

    public int getJumlahMember() {
        return jumlahMember;
    }

}