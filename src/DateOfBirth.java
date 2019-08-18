
import java.util.Calendar;
import java.util.Scanner;


public class DateOfBirth {
    Scanner scanner = new Scanner(System.in);

    public void logic() {
        // Используем сканнер для ввода значений пользователя
        System.out.println("Enter your years");
        int dateYears = scanner.nextInt();
        System.out.println("Enter your month");
        int dateMonth = scanner.nextInt();
        System.out.println("Enter your day");
        int dateDay = scanner.nextInt();
          // Инициализируем календарь

        Calendar now = Calendar.getInstance();

        // Добавляем переменные для вычисления сегодняшней даты
        // Где reallyYear - сегодняшний год, reallyDay - день, reallyMonth - месяц

        int reallyYear = now.get(Calendar.YEAR);
        int reallyDay = now.get(Calendar.DAY_OF_MONTH);
        int month = now.get(Calendar.MONTH);

        // тут мы использовали month + 1 т.к. у джавы свои заморочки, и она выдает реальный месяц - 1,
        // тоесть если не использовать month + 1 джава выдает что сейчас 07 месяц, а это не так

        int reallyMonth = month + 1;

        // дальше идет перебор, если месяц который сейчас больше месяца когда у пользователя день рождения,
        // мы берем год который сейчас и отнимаем год в который родился пользователь, и у нас получается количество лет

        if (reallyMonth > dateMonth) {
            int getAge = reallyYear - dateYears;
            System.out.println("Your age: " + getAge);
        }

        // если же настоящий месяц меньше месяца когда родился пользователь, то тогда день рождение у него еще не наступило
        // и мы берем все тоже самое т.е. (берем год который сейчас и отнимаем год в который родился пользователь)
        // и после этого делаем - 1
        // тоесть у меня день рождение в декабре, и по этому если мы не сделаем - 1, прога выдаст что мне 23, а это не так
            if (reallyMonth < dateMonth){
                int getAge = reallyYear - dateYears;
                int getAge1 = getAge - 1;
                System.out.println("Your age: " + getAge1);
            }
            // Все тоже самое, но сравнение идет по дням, если месяц дня рождения совпадает с реальным месяцем, тогда сравниваем по датам

            if (reallyMonth == dateMonth && reallyDay < dateDay) {
                int getAge = reallyYear - dateYears;
                int getAge1 = getAge - 1;
                System.out.println("Your age: " + getAge1);
            }
            if ((reallyMonth == dateMonth && reallyDay > dateDay)) {
                int getAge = reallyYear - dateYears;
                System.out.println("Your age: " + getAge);
        }




        }



    }
