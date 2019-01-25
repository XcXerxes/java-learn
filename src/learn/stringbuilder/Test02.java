package learn.stringbuilder;

public class Test02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdefg");
        sb.delete(0, 1);
        sb.reverse();
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer();

    }
}
