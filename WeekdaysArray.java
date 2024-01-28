package task4c;

import java.util.Scanner;

public class WeekdaysArray {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the day position (0-6): ");
            int dayIndex = scanner.nextInt();

            if (dayIndex < 0 || dayIndex > 6) {
                throw new ArrayIndexOutOfBoundsException("Day index should be in the range 0-6");
            }

            String dayName = weekdays[dayIndex];
            System.out.println("Day name: " + dayName);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
