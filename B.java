import java.util.ArrayList;

        import java.util.List;

public class B{
    public static void main(String[] args) {
        List<String> allList = null;

        allList = new ArrayList<String>();

        allList.add("Jarry.Du");
        allList.add("Druid.C");
        allList.add("Cloud.Y");
        allList.add("Kiven.D");
        allList.add("Xiaoguang");
        System.out.print("output from front to end\n");
        for (int i =0; i<allList.size();i++){
            System.out.print(allList.get(i)+".");

        }



        System.out.print("\noutput from end to front");
        for (int i=allList.size()-1;i>=0;i--)
        {
            System.out.print(allList.get(i) + ".");

        }
    }


}
