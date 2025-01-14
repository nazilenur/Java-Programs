public class Book extends Document{
    private String title;

    Book(){
        super();
        this.title=title;
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void showInfos() {
        super.showInfos();
        System.out.println("Title : " + getTitle());
    }
}
