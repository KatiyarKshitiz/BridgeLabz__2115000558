public class PenDivision{
public static void main(String[]args){
int pens=14;
int students=3;
int remaining_pens=pens%students;
int pen_perstudent=(pens-remaining_pens)/3;
System.out.println("The Pen Per Student is "+pen_perstudent+" and the remaining pen not distributed is "+remaining_pens);
}
}
