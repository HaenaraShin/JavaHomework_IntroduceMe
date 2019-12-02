package kr.ac.icsu.seonggyu;

public class JavaReport {
    private PSK student = new PSK("박성규", "빅데이터", "12345", "psk@isic.ackr", "1989년 3월 1일");

    public static void main(String[] args) {
        new JavaReport().launchMain(args);
    }

    private void launchMain(String[] args) {
        if (args.length == 1) {
            switch (args[0]) {
                case "1":
                    System.out.println(student.introduceNameMajor());
                    break;
                case "2":
                    System.out.println(student.introduceEmail());
                    break;
                case "3":
                    System.out.println(student.introduceAge());
                default:
                    break;
            }
        }
        return;
    }
}