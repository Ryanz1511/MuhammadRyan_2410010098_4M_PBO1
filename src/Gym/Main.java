
package Gym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DataGym dataGym = new DataGym();
        FileManager fileManager = new FileManager();

        int pilih;

        do {

            System.out.println("\n==============================");
            System.out.println("     FITLIFE GYM");
            System.out.println("==============================");
            System.out.println("1. Tambah Member");
            System.out.println("2. Tampilkan Semua Member");
            System.out.println("3. Cari Member");
            System.out.println("4. Edit Member");
            System.out.println("5. Hapus Member");
            System.out.println("6. Simpan ke File");
            System.out.println("7. Baca File");
            System.out.println("8. Keluar");
            System.out.print("Pilih Menu : ");

            try {

                pilih = input.nextInt();
                input.nextLine();

                switch (pilih) {

                    case 1:

                        System.out.println("\nJenis Member");
                        System.out.println("1. Reguler");
                        System.out.println("2. Premium");
                        System.out.print("Pilih : ");
                        int jenis = input.nextInt();
                        input.nextLine();

                        System.out.print("ID : ");
                        String id = input.nextLine();

                        System.out.print("Nama : ");
                        String nama = input.nextLine();

                        System.out.print("Umur : ");
                        int umur = input.nextInt();

                        System.out.print("Lama Member (bulan): ");
                        int lama = input.nextInt();

                        Member member;

                        if (jenis == 1) {
                            member = new MemberReguler(id, nama, umur, lama);
                        } else {
                            member = new MemberPremium(id, nama, umur, lama);
                        }

                        dataGym.tambahMember(member);

                        break;

                    case 2:

                        dataGym.tampilSemuaMember();

                        break;

                    case 3:

                        System.out.print("Masukkan ID Member : ");
                        String cari = input.nextLine();

                        Member hasil = dataGym.cariMember(cari);

                        if (hasil != null) {
                            hasil.tampilData();
                        } else {
                            System.out.println("Member tidak ditemukan.");
                        }

                        break;

                    case 4:

                        System.out.print("Masukkan ID Member : ");
                        String edit = input.nextLine();

                        System.out.print("Nama Baru : ");
                        String namaBaru = input.nextLine();

                        System.out.print("Umur Baru : ");
                        int umurBaru = input.nextInt();

                        System.out.print("Lama Member Baru : ");
                        int lamaBaru = input.nextInt();
                        input.nextLine();

                        dataGym.editMember(edit, namaBaru, umurBaru, lamaBaru);

                        break;

                    case 5:

                        System.out.print("Masukkan ID Member : ");
                        String hapus = input.nextLine();

                        dataGym.hapusMember(hapus);

                        break;

                    case 6:

                        fileManager.simpanData(dataGym);

                        break;

                    case 7:

                        fileManager.bacaData();

                        break;

                    case 8:

                        System.out.println("Terima kasih telah menggunakan aplikasi FitLife Gym.");

                        break;

                    default:

                        System.out.println("Menu tidak tersedia.");

                }

            } catch (Exception e) {

                System.out.println("Input tidak valid!");

                input.nextLine();

                pilih = 0;

            }

        } while (pilih != 8);

        input.close();

    }

}