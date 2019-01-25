package learn;

public class TestPolyMyServlet {
    public void service() {
        System.out.println("HttpServlet service");
        doGet();
    }
    public void doGet() {
        System.out.println("HttpServlet doGet");
    }
}
