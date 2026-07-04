package Gym;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {


    public void simpanData(DataGym dataGym) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("member.txt"));

            Member[] daftar = dataGym.getDaftarMember();

            for (int i = 0; i < dataGym.getJumlahMember(); i++) {

                Member member = daftar[i];

                String jenis;

                if (member instanceof MemberPremium) {
                    jenis = "Premium";
                } else {
                    jenis = "Reguler";
                }

                writer.write(
                        jenis + ";" +
                        member.getId() + ";" +
                        member.getNama() + ";" +
                        member.getUmur() + ";" +
                        member.getLamaMember());

                writer.newLine();

            }

            writer.close();

            System.out.println("Data berhasil disimpan ke member.txt");

        } catch (IOException e) {

            System.out.println("Terjadi kesalahan saat menyimpan file.");

        }

    }

    
    public void bacaData() {

        try {

            BufferedReader reader = new BufferedReader(new FileReader("member.txt"));

            String baris;

            System.out.println("\n===== ISI FILE MEMBER =====");

            while ((baris = reader.readLine()) != null) {

                System.out.println(baris);

            }

            reader.close();

        } catch (IOException e) {

            System.out.println("File belum tersedia.");

        }

    }

}