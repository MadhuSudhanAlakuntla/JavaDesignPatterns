package CreationalDesignPattren.PrototypePattern.Example2;

//Next, we'll create concrete classes that implement the Document interface:
public class Report implements Document {
    private String content;

    public Report(String content) {
        this.content = content;
    }

    @Override
    public Document clone() {
        return new Report(this.content);
    }

    @Override
    public void display() {
        System.out.println("Report: " + content);
    }
}