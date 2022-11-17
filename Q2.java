public class Q2 {
    public static void main(String[] args) {
        String p="Mississippi";
        String d=p.replace("i","ii");
        System.out.println("length after replacing all \"i\" with \"ii\" : "+d.length());
        String l= d.replace("ss","s");
        System.out.println("length after replacing all \"ss\" with \"s\" : "+l.length());
    }
}
