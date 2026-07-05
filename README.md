# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi **Sistem Manajemen Gym (FitLife Gym)** menggunakan bahasa pemrograman Java sebagai tugas akhir mata kuliah **Pemrograman Berbasis Objek 1**.

## Deskripsi

Aplikasi ini digunakan untuk membantu admin gym dalam mengelola data member. Program menerima input berupa data member seperti ID, nama, umur, jenis member, dan lama berlangganan. Selanjutnya program dapat menampilkan data member, mencari data berdasarkan ID, mengubah data, menghapus data, menghitung biaya membership sesuai jenis member, menyimpan data ke dalam file, serta membaca kembali data yang telah disimpan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam Pemrograman Berorientasi Objek (Object Oriented Programming/OOP) seperti **Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism (Overriding), Seleksi, Perulangan, Input Output Sederhana, Array, dan Error Handling.**

---

# Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep-konsep OOP yang digunakan pada program.

## 1. Class

Class merupakan cetakan atau blueprint yang digunakan untuk membuat object.

Pada program ini terdapat beberapa class yaitu **Member**, **MemberReguler**, **MemberPremium**, **DataGym**, **FileManager**, dan **Main**.

```java
public class Member {

}

public class MemberReguler extends Member {

}

public class MemberPremium extends Member {

}
```

Class `Member` berfungsi sebagai parent class, sedangkan `MemberReguler` dan `MemberPremium` merupakan turunan dari class `Member`. Class `DataGym` digunakan untuk mengelola data member, `FileManager` digunakan untuk proses penyimpanan dan pembacaan file, sedangkan `Main` berfungsi sebagai class utama untuk menjalankan program.

---

## 2. Object

Object merupakan hasil instansiasi dari sebuah class.

Pada program ini object dibuat ketika program dijalankan.

```java
DataGym dataGym = new DataGym();

FileManager fileManager = new FileManager();

Member member =
new MemberPremium(id, nama, umur, lama);
```

Object tersebut kemudian digunakan untuk menyimpan data member dan menjalankan seluruh fungsi yang tersedia pada aplikasi.

---

## 3. Atribut

Atribut merupakan variabel yang dimiliki oleh suatu class.

Pada class `Member` terdapat beberapa atribut yaitu:

```java
private String id;
private String nama;
private int umur;
private int lamaMember;
```

Atribut tersebut digunakan untuk menyimpan identitas setiap member gym.

---

## 4. Constructor

Constructor merupakan method yang pertama kali dipanggil ketika object dibuat.

Pada program ini constructor terdapat pada class `Member`, `MemberReguler`, dan `MemberPremium`.

```java
public Member(String id, String nama,
int umur, int lamaMember){

    this.id = id;
    this.nama = nama;
    this.umur = umur;
    this.lamaMember = lamaMember;

}
```

Sedangkan pada class turunan digunakan constructor berikut.

```java
public MemberPremium(String id,
String nama,
int umur,
int lamaMember){

    super(id, nama, umur, lamaMember);

}
```

---

## 5. Mutator

Mutator atau Setter digunakan untuk mengubah nilai dari suatu atribut.

Pada program ini terdapat beberapa method setter.

```java
public void setNama(String nama){
    this.nama = nama;
}

public void setUmur(int umur){
    this.umur = umur;
}

public void setLamaMember(int lamaMember){
    this.lamaMember = lamaMember;
}
```

Method tersebut digunakan ketika admin melakukan proses edit data member.

---

## 6. Accessor

Accessor atau Getter digunakan untuk mengambil nilai dari suatu atribut.

Pada program ini digunakan beberapa method getter seperti berikut.

```java
public String getId(){
    return id;
}

public String getNama(){
    return nama;
}

public int getUmur(){
    return umur;
}

public int getLamaMember(){
    return lamaMember;
}
```

Method getter digunakan ketika menampilkan data, menghitung biaya membership, serta menyimpan data ke file.

---

## 7. Encapsulation

Encapsulation merupakan konsep menyembunyikan data dengan membuat atribut menjadi private sehingga tidak dapat diakses secara langsung dari luar class.

```java
private String id;
private String nama;
private int umur;
private int lamaMember;
```

Atribut tersebut hanya dapat diakses melalui method Getter dan Setter sehingga keamanan data menjadi lebih baik.

---

## 8. Inheritance

Inheritance merupakan konsep pewarisan dimana suatu class dapat mewarisi atribut dan method dari class lain.

Pada program ini `MemberReguler` dan `MemberPremium` mewarisi class `Member`.

```java
public class MemberReguler extends Member {

}

public class MemberPremium extends Member {

}
```

Dengan menggunakan inheritance, kedua class tersebut tidak perlu membuat ulang atribut dan method yang sudah dimiliki oleh class `Member`.

---

## 9. Polymorphism

Polymorphism merupakan konsep dimana sebuah method dapat memiliki perilaku yang berbeda sesuai dengan object yang digunakan.

Pada program ini polymorphism diterapkan menggunakan **Method Overriding** pada method `hitungBiaya()`.

```java
@Override
public double hitungBiaya(){

    return getLamaMember()*100000;

}
```

dan

```java
@Override
public double hitungBiaya(){

    return getLamaMember()*250000;

}
```

Walaupun nama method sama, hasil perhitungan biaya berbeda sesuai jenis member yang dipilih.

---

## 10. Seleksi

Seleksi digunakan untuk menentukan keputusan berdasarkan suatu kondisi.

Pada program ini digunakan seleksi `if else`.

```java
if(jenis==1){

    member = new MemberReguler(id,nama,umur,lama);

}else{

    member = new MemberPremium(id,nama,umur,lama);

}
```

Selain itu digunakan juga seleksi `switch-case` pada menu utama.

```java
switch(pilih){

    case 1:
        ...
        break;

    case 2:
        ...
        break;

}
```

---

## 11. Perulangan

Perulangan digunakan untuk menjalankan suatu blok program secara berulang.

Pada program ini digunakan perulangan `for`.

```java
for(int i=0;i<jumlahMember;i++){

    daftarMember[i].tampilData();

}
```

Selain itu juga digunakan perulangan `do while` agar menu terus ditampilkan sampai pengguna memilih keluar.

```java
do{

    // Menu Program

}while(pilih!=8);
```

---

## 12. Input Output Sederhana

Input dilakukan menggunakan class `Scanner`.

```java
Scanner input = new Scanner(System.in);
```

Sedangkan output file menggunakan `FileWriter` dan `BufferedWriter`.

```java
BufferedWriter writer =
new BufferedWriter(
new FileWriter("member.txt"));
```

Untuk membaca file digunakan `BufferedReader`.

```java
BufferedReader reader =
new BufferedReader(
new FileReader("member.txt"));
```

---

## 13. Array

Array digunakan untuk menyimpan banyak object member dalam satu variabel.

```java
private Member[] daftarMember =
new Member[100];
```

Array tersebut digunakan untuk menyimpan maksimal 100 data member gym.

---

## 14. Error Handling

Error Handling digunakan untuk menangani kesalahan yang mungkin terjadi ketika program dijalankan.

Pada program ini digunakan `try catch`.

```java
try{

    pilih = input.nextInt();

}catch(Exception e){

    System.out.println("Input tidak valid!");

}
```

Selain itu Error Handling juga digunakan ketika proses membaca maupun menyimpan file.

```java
try{

    BufferedWriter writer = ...

}catch(IOException e){

    System.out.println("Terjadi kesalahan saat menyimpan file.");

}
```

---

# Usulan Nilai

|  No | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |    10   |
|  10 | Seleksi        |    5    |
|  11 | Perulangan     |    5    |
|  12 | IO Sederhana   |    10   |
|  13 | Array          |    15   |
|  14 | Error Handling |    15   |
|     | **TOTAL**      | **100** |

# Pembuat

**Nama :** Muhammad Ryan

**Npm :** 2410010098

**Program Studi :** Teknik Informatika

**Mata Kuliah :** Pemrograman Berbasis Objek 1

**Judul Proyek :** Sistem Manajemen Gym (FitLife Gym)
