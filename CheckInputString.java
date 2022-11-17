import java.util.Arrays;

class CheckInputString {
    int result;
    int a1;
    int a2;
    String vyr;
    String[] subVyr;
    String[] massiveInt = new String[]{"1","2","3","4","5","6","7","8","9","10"};
    String[] massiveRome = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X"};
    String[] massiveMath = new String[]{"+","-","*","/"};
    String arifZnak;
    String resultS;


    public CheckInputString(String vyr) {
        this.vyr = vyr;
    }

    public void toSubStrings()  {
        subVyr = vyr.split("\\s");
        if (subVyr.length == 3) {
            for (int i = 0; i < subVyr.length; i++) {
                this.subVyr[i] = subVyr[i].replace(" ", "");
            }
            } else {
            throw new CalculatorException("Ошибка : Недопустимые длина выражения");
            }
        }
        public void checkMath(){
        if(Arrays.asList(massiveMath).contains(subVyr[1])){
            this.arifZnak = subVyr[1];
        } else{
            throw new CalculatorException("Ошибка : Недопустимый арифметический знак");
        }
        }



    public void toInt(){
        if(Arrays.asList(massiveRome).contains(subVyr[0]) & Arrays.asList(massiveRome).contains(subVyr[2])){
            this.a1 = Rome.valueOf(subVyr[0]).getA();
            this.a2 = Rome.valueOf(subVyr[2]).getA();
        } else if(Arrays.asList(massiveInt).contains(subVyr[0]) & Arrays.asList(massiveInt).contains(subVyr[2])){
            this.a1 = Integer.parseInt(subVyr[0]);
            this.a2 = Integer.parseInt(subVyr[2]);
        } else {
            throw new CalculatorException("Ошибка : Недопустимые вводные данные");
            }
        }
        public String resultToString(){
            Calculator calc = new Calculator(a1,a2, arifZnak);
            result = calc.calculate();
        if(Arrays.asList(massiveRome).contains(subVyr[0])){
            int b1 = (result / 10) + 9;
            int b2 = (result % 10) - 1;
            Rome[] rome = Rome.values();
            if(result>9) {
                if (b2 > 0) {
                    resultS =rome[b1] + "" + rome[b2];
                } else {
                    resultS = rome[b1] + "";
                }
            }else if(result>0 & result<10){
                resultS = rome[b2] + "";
            }
            else{
                throw new CalculatorException("Ошибка : В римских цифрах нет нуля, дробей или отрицательных значений");
            }
        } else{
            resultS = Integer.toString(result);
        }
        return resultS;
        }
        }



