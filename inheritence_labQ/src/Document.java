import java.util.Date;

public class Document {
    private  String[] authors;
    private Date date;

    Document() {
        this.authors = new String[0];
        this.date =new Date();
    }
    Document(String[] authors,Date date){
        this.authors=authors;
        this.date=date;
    }

    public String[] getAuthors(){
       return authors;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void showInfos(){
        System.out.println("Details:");
        System.out.println("Date : " + getDate());
        System.out.println("Authors : " );
        for (String author : authors){
            System.out.println(" - " + author);
        }

    }

}
