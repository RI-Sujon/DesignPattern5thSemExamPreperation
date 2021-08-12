package Proxy;

public class MainClass {
    public static void main (String[] args)
    {
        Internet internet = new Proxy_Internet();
        try
        {
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
