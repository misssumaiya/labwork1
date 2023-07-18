package problem_E1_5;

public class BoxName {
    public static void main(String[]args)
    {
        String name="sumaiya";
        int l=name.length()+4;
        String horizontalLine="+"+"_".repeat((l))+ "+";
        String emptyLine="|"+"".repeat(l)+"|";
        System.out.println(horizontalLine);
        System.out.println(emptyLine);
        System.out.println("|" + name +"|");
        System.out.println(emptyLine);
        System.out.println(horizontalLine);

    }
}
