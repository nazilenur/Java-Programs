public class EMail extends Document{
    private String subject;
    private String[] to;

    EMail(){
        super();
        this.subject=subject;
        this.to=new String[0];
    }

    public String getSubject() {
        return subject;
    }

    public String[] getTo() {
        return to;
    }

    public void setTo(String[] to) {
        this.to = to;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void showInfos() {
        super.showInfos();
        System.out.println("Subject is : " + getSubject());
        System.out.println("contacts : ");
        for(String whos: to){
            System.out.println(" - " + whos);
        }
    }
}
