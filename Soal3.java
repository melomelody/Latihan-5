import java.util.List;
import java.util.ArrayList;

public class Soal3{
    public static void main(String[] args){
        List values = new ArrayList();
        values.add(1);
        values.add(3);
        values.add(5);
        values.add(10);
        values.add(1);
        values.add(20);
        values.add(10);
        values.add(1);
        values.add(20);
        values.add(9);
        values.add(1);

        System.out.print("Index ke 0 adalah " + values.get(0));
        System.out.print(", Index ke 1 adalah " + values.get(1));
        System.out.print(", Index ke 3 adalah " + values.get(3));

        System.out.println();
        System.out.println("===============");

        int [] value = {1, 3, 5, 10, 1, 20, 10, 1, 20, 9, 1};
        for(int i=0; i < value.length; i++)
        {
            if (value[i] %2==1){
            System.out.print(value[i]+" ");
            }
        }

    }
}
