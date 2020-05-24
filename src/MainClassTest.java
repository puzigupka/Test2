public class MainClassTest
{
    @Test
    public void myFirstTest()
    {
        int a = this.testGetLocalNumber();

        if (a < 10) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    public int testGetLocalNumber()
    {
        return 14;
    }
}