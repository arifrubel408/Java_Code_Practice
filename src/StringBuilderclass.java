
public class StringBuilderclass {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Bangla");

        System.out.println(sb);

        sb.append("desh");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(2, 6);
        System.out.println(sb);

    }

}
