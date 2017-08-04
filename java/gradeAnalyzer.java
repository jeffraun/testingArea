import java.util.ArrayList;

public class GradeAnalyzer{

  public GradeAnalyzer(){
  }

  public int getAverage(ArrayList<Integer> grades){

    if (grades.size() < 1){
      System.out.println("Empty arraylist!");
      return 0;
    }else{
      int sum = 0;
      for (int counter = 0; counter < grades.size() ; counter ++){
        sum = sum + grades.get(counter);
      }
      int average  = sum / grades.size();
      System.out.println("average = " + average);
       return average;
    }
  }

  public void getHighLow(ArrayList<Integer> grades){
    int lowGrade = 100;
    int highGrade = 0;

    for (int counter = 0; counter < grades.size(); counter ++){
      int currentGrade = grades.get(counter);
      if ( currentGrade < lowGrade){
        lowGrade = currentGrade;
      }
      if ( currentGrade > highGrade){
        highGrade = currentGrade;
      }
    }
    System.out.println("low grade =" + lowGrade);
    System.out.println("high grade =" + highGrade);

  }

//==================
  public static void main(String[] args){

    ArrayList<Integer> myClassroom = new ArrayList<>();

    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);

    GradeAnalyzer myAnalyzer = new GradeAnalyzer();

    myAnalyzer.getAverage(myClassroom);
    myAnalyzer.getHighLow(myClassroom);
  }
}