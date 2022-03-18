public class S_01 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("teest");
            throw e;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
