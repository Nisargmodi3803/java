import java.util.Scanner;
class string_method
{
    public static void main(String args[])
    {
        
        String n = "NISARG";
        n = n.toLowerCase();
        System.out.println(n);

        String s = "Nisarg Modi";
        s = s.replace(" ","_");
        System.out.println(s);

        String m = "Dear <|Name|>, Thanks a lot";
        m = m.replace("<|Name|>","Nisarg");
        System.out.println(m);

        String space = "This is double space  and this is triple space   ";
        System.out.println(space);
        System.out.println("Double space is at index : "+space.indexOf("  "));
        System.out.println("Triple space is at index : "+space.indexOf("   "));


        Scanner sc = new Scanner(System.in);
        String website = sc.next();

        if(website.endsWith(".com"))
        {
            System.out.println("This is Commerical website");
        }
        else if(website.endsWith(".org"))
            System.out.println("This is organization website");

        else if(website.endsWith(".in"))
            System.out.println("This is Indian webiste");
    }
}