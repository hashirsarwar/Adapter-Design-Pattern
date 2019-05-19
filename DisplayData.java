/*
Adaptee
 */
class DisplayData {
    private String title;
    private int spaces;

    DisplayData(String title, int spaces) {
        this.title = title;
        this.spaces = spaces;
    }

    String getTitle() {
        return title;
    }

    int getSpaces() {
        return spaces;
    }
}
