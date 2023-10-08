
public class Main {
    public static void main(String[] args) {

            ///Задача - Напишите код, с помощью которого можно разделить строку на части.

            String str = "123-456789";
            String[] parts = str.split("-");
            String part1 = parts[0]; // "123"
            String part2 = parts[1]; // "456789"
            System.out.printf(part1);
            System.out.println();
            System.out.printf(part2);
            System.out.println();
            System.out.printf(str);
            
            ///В этом примере строка «123-456789» разделяется на две подстроки:
            // «123» и «456789». Они сохраняются в массиве parts, откуда затем извлекаются
            // и сохраняются в отдельные переменные part1 и part2.
        }
    }