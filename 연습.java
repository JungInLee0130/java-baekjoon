package 연습용;

public class 연습 {
    public static void main(String[] args) {
        String first = "First String";
        System.out.println("First initially = " + first);
        String second = first;
        System.out.println("String copy in second = " + second);
        first = "Updated string";
        System.out.println("First after update = " + first);

        String newCopy = String.copyValueOf(first.toCharArray());
        System.out.println("Copy using copyValueOf() = " + newCopy);

        String copyString = new String(first);
        System.out.println("Copy using new = " + copyString);
    }
}

