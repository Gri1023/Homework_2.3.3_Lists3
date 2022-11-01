import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        while (scanner.hasNextInt())
        {
            int number = scanner.nextInt();

            if (list.contains(number))
            {
                list.remove(list.indexOf(number));
                list.addFirst(number);
            }

            else
                list.addFirst(number);
        }

        System.out.println(list);
    }
}