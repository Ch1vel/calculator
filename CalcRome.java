import java.io.IOException;

class CalcRome extends CalcInt {
    String[] subVyr;
    int result;
    String resultS;
    int a1;
    int a2;
    String znak;

    public CalcRome(String[] subVyr) {
        this.subVyr = subVyr;
    }


    public void perevod() {
        this.a1 = Rome.valueOf(subVyr[0]).getA();
        this.a2 = Rome.valueOf(subVyr[2]).getA();
        this.znak = subVyr[1];
    }


    public String calculate() {
        switch (znak) {
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
        int b1 = (result / 10) - 1;
        int b2 = (result % 10) - 1;
        Rome[] rome = Rome.values();
        RomeResult[] romeResults = RomeResult.values();
        if(result>9) {
            if (b2 > 0) {
                resultS =romeResults[b1] + "" + rome[b2];
                return resultS;
            } else {
                resultS = romeResults[b1] + "";
                return resultS;
            }
        }else if(result>0 & result<10){
                resultS = rome[b2] + "";
                return resultS;
            }
            else{
            try {
                throw new RomeZeroOrMinusException();
            } catch (RomeZeroOrMinusException e) {
                System.out.println("Ошибка : В римских цифрах нет нуля, дробей или отрицательных значений");
                System.exit(0);
            }
            return resultS;
            }
        }
    }



