import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<DisplayData> obj = new ArrayList<>();
        obj.add(new DisplayData("Hashir",0));
        obj.add(new DisplayData("Hashi",3));
        obj.add(new DisplayData("Hash",2));
        obj.add(new DisplayData("Has",5));
        obj.add(new DisplayData("Ha",0));

        DisplayView displayView = new DisplayView();
        displayView.setAdapter(obj);
        displayView.displayWithoutPriority();
        displayView.displayEntireList();
    }
}
