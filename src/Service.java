import java.util.*;

public class Service extends Data {
    private final Scanner scanner = new Scanner(System.in);
    private int count = 0;

    public void base() {
        for (int i = 0; i < codes.length; i++) {
            System.out.println(codes[i] + " - " + messages[i]);
        }
    }

    public void service() {
        List<Map.Entry<Integer, String>> statusList = new ArrayList<>();
        int h = 1;

        Map<Integer, String> unn = new TreeMap<>();
        for (int i = 0; i < codes.length; i++) {
            statusList.add(new AbstractMap.SimpleEntry<>(codes[i], messages[i]));
        }

        Collections.shuffle(statusList, new Random());

        for (Map.Entry<Integer, String> entry : statusList) {
            int code = entry.getKey();
            String correctMessage = entry.getValue();

            System.out.print("Что означает код " + code + "? ");
            System.out.println(h++ + "/" + statusList.size());
            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equalsIgnoreCase(correctMessage)) {
                System.out.println("Верно!\n");
                count++;
            } else {
                System.out.println("Неверно. Правильный ответ: " + correctMessage + "\n");
                unn.put(code, correctMessage);
            }
        }

        System.out.println("Тест завершён!");
        System.out.println("Оценка: " + count + "/" + statusList.size());
        System.out.println("\nнеправильно\n");
        for (Map.Entry<Integer, String> u : unn.entrySet()) {
            System.out.println(u.getKey() + " - " + u.getValue());
        }

        scanner.close();
    }
}
