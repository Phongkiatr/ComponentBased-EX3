package Event;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // สร้าง Source
        ScoreSource source = new ScoreSource();

        // สร้าง Subscriber 2 ตัว
        LiveResultReporter reporter1 = new LiveResultReporter();
        LiveResultReporter reporter2 = new LiveResultReporter();

        // ลงทะเบียน Subscriber กับ Source
        source.addScoreListener(reporter1);
        source.addScoreListener(reporter2);

        // เริ่มลูปรับข้อมูลจากผู้ใช้
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Score ");
            String score = scanner.nextLine();

            if (score.isEmpty()) {
                System.out.println("Program ended.");
                break;
            }

            source.setScoreLine(score);
        }
        scanner.close();
    }
}