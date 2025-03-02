package OOP_Lab_01.Ex6_4;

public class CalculateForDis {
    private int month ;
    private int year;

    public CalculateForDis(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public boolean checkLeapYear(int year){
        return (this.year %4 ==0 && this.year %100 != 0)|| (this.year %400 == 0);
    }
    public int dayOfMonth(){
        switch(month){
            case 2 : return checkLeapYear(year) ? 29 :28;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                return 30;
            default:
                return 31;
        }
    }
}
