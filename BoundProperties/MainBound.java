package BoundProperties;

import java.util.Scanner;

public class MainBound {
    public static void main(String[] args) {
        // สร้าง Bean
        LiveScoreBean bean = new LiveScoreBean();

        // สร้าง Subscriber 2 ตัว
        BeanSubscriber subscriber1 = new BeanSubscriber();
        BeanSubscriber subscriber2 = new BeanSubscriber();

        // ลงทะเบียน Subscriber กับ Bean
        bean.addPropertyChangeListener(subscriber1);
        bean.addPropertyChangeListener(subscriber2);

        // เริ่มลูปรับข้อมูลจากผู้ใช้
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Score ");
            String score = scanner.nextLine();

            if (score.isEmpty()) {
                System.out.println("Program ended.");
                break;
            }

            bean.setScoreLine(score);
        }
        scanner.close();
    }
}
