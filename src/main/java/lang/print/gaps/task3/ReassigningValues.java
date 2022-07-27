package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1, second = 10, third = 100;
        System.out.println(String.format("%d\n%d\n%d", first, second, third));
        int linkToFirst = first, linkToSecond = second, linkToThird = third;
        first = 15;
        second = 6;
        third = 4;
        System.out.println(String.format("%d\n%d\n%d\n%d\n%d\n%d", first, second, third, linkToFirst, linkToSecond, linkToThird));
    }
}
