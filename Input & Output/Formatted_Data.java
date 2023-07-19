public class Formatted_Data 
{
    public static void main(String[] args) 
    {
        int a = 9;
        float b = 9999.999f;

        System.out.printf("%d\n",a);
        System.out.printf("%+d\n",a);
        System.out.printf("%(d\n",a);
        System.out.printf("% d\n",a);

        System.out.printf("%f\n",b);
        System.out.printf("%.2f\n",b);
        System.out.printf("%5.2f\n",b);
        System.out.printf("% f\n",b);
        System.out.printf("%,.f\n",b);
    }    
}
