package SuperClass;

import java.util.Scanner;

public class inputan {
    public static void main(String[] args) {
        Scanner inputt = new Scanner(System.in);  

        System.out.println("Pilih salah satu:");  
        System.out.println("1. Siswa\n2. Guru");   
        int choice = inputt.nextInt();  
    
        if (choice == 1) {  
            System.out.println("Informasi Siswa"); 
            System.out.print("Masukkan nama: ");  
            String name = inputt.next();  
            System.out.print("Masukkan umur: ");  
            int age = inputt.nextInt();  
            System.out.print("Masukkan jurusan: ");  
            String major = inputt.next();  
            System.out.print("Masukkan nomor siswa: ");  
            int studentNumber = inputt.nextInt();  
            System.out.print("Masukkan nilai: ");  
            int score = inputt.nextInt();  
    
            System.out.println("\nInformasi siswa:");
            System.out.println("Nama: " + name);  
            System.out.println("Umur: " + age);  
            System.out.println("Jurusan: " + major);  
            System.out.println("Nomor siswa: " + studentNumber);  
            System.out.println("Nilai: " + score);  

        } else if (choice == 2) {  
            System.out.println("Pilih salah satu:");  
            System.out.println("1. Full Time\n2. Part Time");   
            int teacherType = inputt.nextInt();  
    
            System.out.print("Masukkan nama guru: ");  
            String name = inputt.next();  
            System.out.print("Masukkan umur guru: ");  
            int age = inputt.nextInt();  
            System.out.print("Masukkan mapel guru: ");  
            String subject = inputt.next();  
    
            if (teacherType == 1) {  
                System.out.print("Unit: ");  
                String unit = inputt.next();  
                System.out.print("Masukkan gaji guru: ");  
                int salary = inputt.nextInt();  
    
                System.out.println("\nInformasi Guru Full-Time:");
                System.out.println("Nama: " + name);  
                System.out.println("Umur: " + age);  
                System.out.println("Mata pelajaran: " + subject);  
                System.out.println("Unit: " + unit);  
                System.out.println("Gaji: Rp" + salary);  
    
            } else if (teacherType == 2) {  
                System.out.print("Masukkan jam guru: ");  
                int hoursWorked = inputt.nextInt();  
                int salary = hoursWorked * 50000;
    
                System.out.println("\nInformasi Guru Part-Time:");
                System.out.println("Nama: " + name);  
                System.out.println("Umur: " + age);  
                System.out.println("Mata Pelajaran: " + subject);  
                System.out.println("Jam: " + hoursWorked + " jam");  
                System.out.println("Gaji: Rp" + salary);  
            }
        }
        inputt.close();
    }
}