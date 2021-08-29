public class Main {
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        System.out.println("The sum of the digits of the number 12345 = " + sumDigits(12345));
        System.out.println("The sum of the digits of the number 10 = " + sumDigits(10));
        System.out.println("The sum of the digits of the number 5059191 = " + sumDigits(5059191));
    }

    public static int sumDigits(int number)
    {
        int sum = 0;
        int numb = Math.abs(number);
        while(numb > 0){
            sum += numb % 10;
            numb = numb / 10;
        }
        return sum;
    }
}
