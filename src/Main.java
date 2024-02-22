import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
            System.out.println("\n//input\n");

            System.out.print("Nama: ");
                String Datanama = inputan.nextLine();
            System.out.print("Jenis kelamin (P/L): ");
                String Datagender = inputan.nextLine();
            String gender = (Datagender.equalsIgnoreCase("P")) ? "Perempuan" : "Laki-laki";
                System.out.print("Tanggal lahir (YYYY-MM-DD): ");
            String Databirthday = inputan.nextLine();
                LocalDate birthday = LocalDate.parse(Databirthday);

            LocalDate day = LocalDate.now();
            Period agePeriod = Period.between(birthday, day);
                int DataTahun = agePeriod.getYears();
                int DataBulan = agePeriod.getMonths();

            System.out.println("\n//output");
            System.out.println("\nData Diri:");
            System.out.println("Nama: " + Datanama);
            System.out.println("Jenis Kelamin: " + gender);
            System.out.println("Umur: " + DataTahun + " tahun " + DataBulan + " bulan");

        inputan.close();
    }
}
