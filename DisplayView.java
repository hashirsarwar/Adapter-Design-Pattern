import java.util.ArrayList;
/*
Adapter
 */
public class DisplayView implements DisplayInterface {
    private ArrayList<DisplayData> list;

    void setAdapter(ArrayList<DisplayData> l)
    {
        list = l;
    }

    @Override
    public void displayEntireList() {
        for (DisplayData dd : list)
        {
            System.out.println(dd.getTitle());
            for (int i = 0; i < dd.getSpaces(); i++)
            {
                System.out.println("");
            }
        }
    }

    @Override
    public void displayWithoutPriority() {
        for (DisplayData dd : list)
        {
            System.out.println(dd.getTitle());
        }
    }
}
