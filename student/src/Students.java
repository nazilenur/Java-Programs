public class Students {

     int finalExam;
     int midterm;
     String name;

    Students(String name,int midterm,int finalExam){
        this.name=name;
        this.midterm=midterm;
        this.finalExam=finalExam;

    }

    Students(){
        this.name=name;
        this.midterm=midterm;
        this.finalExam=finalExam;

    }

    public double average(){
        return (double)midterm*0.4+finalExam*0.6;
    }

  public void toString(Students st){
      System.out.println("Name : "+ st.name+" Midterm : "+ st.midterm+" Final exam : "+
              st.finalExam+ "Average : "+st.average());
  }


}