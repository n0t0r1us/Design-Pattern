package Cau2;
public class Main {
    public static void main(String[] args) {
        MailClient mailClient = new QuanLyEmail();
        Profile profile = new Profile("Dũ, ", 0353574257, "Trưởng phòng, ",
                "du69@gmail.com, ",
                "Trưởng, ", "Sếp, ");
        Profile profile1 = new Profile("Phương, ", 0742675256, "Phó phòng, ",
                "aphuong96@gmail.com, ",
                "Phó, ", "Phụ ");
        Profile profile2 = new Profile("Ni", 85232455, "Nhân viên",
                "Nicute69@gmail.com",
                "NV, ", "Lính ");
        mailClient.add(profile);
        mailClient.add(profile1);
        mailClient.add(profile2);
        System.out.printf("");
        System.out.printf(mailClient.toString());
    }
}
