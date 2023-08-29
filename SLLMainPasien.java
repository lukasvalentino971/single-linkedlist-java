import java.util.Scanner;
public class SLLMainPasien {
    public static void main(String[] args){
        SLLPasien sllPs = new SLLPasien();
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        char pilih;
        int menu, jmlh;
        int i = 0;
        //System.out.print("Masukkan Jumlah Mahasiswa: ");
        //jmlh = sc.nextInt();
        //jika menggunakan clear maka harus menggunakan jmlh
        System.out.println("");
        do{
            System.out.println("Pilih Menu:");
            System.out.println("1. Tambah Data(Enqueue) dibelakang");

            System.out.print("Pilihanmu: ");
            menu = sc.nextInt();
            System.out.println("");
            switch (menu){
                case 1:
                    //do{
                        /*if (i == jmlh){
                            System.out.println("Data Anda Sudah Penuh, Pilih Menu Yang Lain!");
                            continue;
                        }*/
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        System.out.print("Nama: ");
                        String nama = sc.next();
                        sc.nextLine();
                        System.out.print("No.Kamar: ");
                        int no_kamar = sc.nextInt();

                        Pasien nPasien = new Pasien(id, nama, no_kamar);
                        sllPs.addLast(nPasien);
                        System.out.println("");
                    break;
                case 2: 
                sllPs.Dequeue();
                    System.out.println("");
                    break;
                case 3: 
                sllPs.peek();
                    System.out.println("");
                    break;
                case 4: 
                sllPs.peekRear();
                    System.out.println("");
                    break;
                case 5:
                    System.out.print("Masukkan Index Pada Data Yang Dicari: ");
                    int idx = sc.nextInt();
                    sllPs.peekAt(idx);
                    System.out.println("");
                
                    break;
                case 6: 
                    System.out.println("Masukkan NIM Mahasiswa Yang Ingin Dicari: ");
                    String no = in.nextLine();
                    sllPs.peekPosition(no);
                    System.out.println("");
                
                    break;
                case 7: 
                sllPs.print();
                    System.out.println("");
                
                    break;
                case 8:

                    System.out.println("Masukkan index ke- ");
                    int indexInput = sc.nextInt();
                    System.out.print("NIM: ");
                    String nim3 = sc.next();
                    System.out.print("Nama: ");
                    String nama3 = sc.next();
                    sc.nextLine();
                    System.out.print("Absen: ");
                    int absen3 = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk3 = sc.nextDouble();

                    Mahasiswa nb3 = new Mahasiswa(nim3, nama3, absen3, ipk3);

                    sllPs.insertAt(indexInput, nb3);
                    System.out.println("");
                
                    break;
                case 9:
                    System.out.print("NIM: ");
                    String nim2 = sc.next();
                    System.out.print("Nama: ");
                    String nama2 = sc.next();
                    sc.nextLine();
                    System.out.print("Absen: ");
                    int absen2 = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk2 = sc.nextDouble();

                    Mahasiswa nb2 = new Mahasiswa(nim2, nama2, absen2, ipk2);
                    sllPs.addFirst(nb2);

                        //sll.Enqueue(nim, nama, absen, ipk);
                    System.out.println("");
                
                    break;
                case 10:
                    System.out.println("Masukkan ABSEN : ");
                    int absenIn = sc.nextInt();
                    System.out.print("NIM: ");
                    String nim21 = sc.next();
                    System.out.print("Nama: ");
                    String nama21 = sc.next();
                    sc.nextLine();
                    System.out.print("Absen: ");
                    int absen21 = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk21 = sc.nextDouble();

                    Mahasiswa nb21 = new Mahasiswa(nim21, nama21, absen21, ipk21);
                    sllPs.insertBefore(absenIn, nb21);

                        //sll.Enqueue(nim, nama, absen, ipk);
                    System.out.println("");
                
                    break;
                case 11:
                    System.out.println("Masukkan NIM : ");
                    String nimKey = sc.next();
                    System.out.print("NIM: ");
                    String nim110 = sc.next();
                    System.out.print("Nama: ");
                    String nama110 = sc.next();
                    sc.nextLine();
                    System.out.print("Absen: ");
                    int absen110 = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk110 = sc.nextDouble();

                    Mahasiswa nb110 = new Mahasiswa(nim110, nama110, absen110, ipk110);
                    sllPs.insertAfterUseString(nimKey, nb110);
                    System.out.println("");
                    break;

                case 12:
                    System.out.println("Masukkan NAMA : ");
                    String namaKey = sc.next();
                    System.out.print("NIM: ");
                    String nim120 = sc.next();
                    System.out.print("Nama: ");
                    String nama120 = sc.next();
                    sc.nextLine();
                    System.out.print("Absen: ");
                    int absen120 = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk120 = sc.nextDouble();

                Mahasiswa nb120 = new Mahasiswa(nim120, nama120, absen120, ipk120);
                sllPs.insertBeforeUseString(namaKey, nb120);
                System.out.println("");

            }
        } while (menu > 0 && menu < 13);
    }
    // rev peek 3. 4. peek rear

    //8. aman 
}