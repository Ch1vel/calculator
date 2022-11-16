import java.io.IOException;

class CalcInt {
    String subVyr[];
    int result;
    int a1;
    int a2;
    String znak;

    public CalcInt(){}
    public CalcInt(String subVyr[]){
        this.subVyr = subVyr;
    }
    public void perevod() {
        this.a1 = Integer.parseInt(subVyr[0]);
        this.a2 = Integer.parseInt(subVyr[2]);
        this.znak = subVyr[1];
    }




    public String calculate(){
        switch(znak){
            case "+":
                result = a1 + a2;
                break;
            case "-":
                result = a1 - a2;
                break;
            case "*":
                result = a1 * a2;
                break;
            case "/":
                result = a1 / a2;
                break;
            default:
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Ошибка : Можно использовать только умножение, сложение, вычитание и деление без остатка");
                    System.exit(0);
                }
                break;
        }
        String resultS = Integer.toString(result);
        return resultS;
    }
}
