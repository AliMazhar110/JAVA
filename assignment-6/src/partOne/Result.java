package partOne;

public class Result extends Student implements Exam{
    private float sum,percent;
    Result(){
        sum = 0;
    }
    @Override
    public void percentCalculator(){
        getData();
        for(int i=0;i<5;i++){
            sum += marks[i];
        }
        percent = sum / 5.0f;
    }
    void display(){
        System.out.format("| %20.20s | %15.15s | %10.2f |",getName(),getPrn(),percent);
    }
}
