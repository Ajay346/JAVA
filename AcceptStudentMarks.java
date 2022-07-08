import java.util.*;


public class AcceptStudentMarks {
    public static void main(String args[]) {

        sp s = new sp();
        s.getdata();
        s.cal();
    }
    }
class sp {
    int rno, m1, m2, m3, totmarks, avg;
    String name;
    Scanner sc = new Scanner(System.in);

    void getdata() {
        System.out.println("Enter name of the student :");
        name = sc.next();
        System.out.println("Enter three subject marks :");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        System.out.println("Name of the student is :"+name);
        System.out.println("Marks of the student is :"+m1+" "+m2+" "+m3);


    }

    void cal() {
        totmarks = m1 + m2 + m3;
        avg = totmarks / 3;
        System.out.println("Total marks of the student is :"+totmarks);
        System.out.println("Total average of the student is :"+avg);

    }

}



