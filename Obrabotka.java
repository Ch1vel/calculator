import java.io.IOException;
import java.util.Arrays;

class Obrabotka {
    String vyr;
    String subVyr[];
    String result;
    int proverkaInt[] = new int[]{1,2,3,4,5,6,7,8,9,10};

    public Obrabotka(String vyr) {
        this.vyr = vyr;
    }

    public String[] formatir1()  {
        subVyr = vyr.split("\\s");
        if (subVyr.length == 3) {
            for (int i = 0; i < subVyr.length; i++) {
                this.subVyr[i] = subVyr[i].replace(" ", "");

            }
            }
            else {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Ошибка : Недопустимые вводные данные");
                System.exit(0);
            }

        }
            return subVyr;
        }


        public String formatir2(){
        if(Arrays.toString(Rome.values()).contains(subVyr[0]) & Arrays.toString(Rome.values()).contains(subVyr[2])){
            CalcRome calcRome = new CalcRome(subVyr);
            calcRome.perevod();
            result = calcRome.calculate();
            return result;
        } else if(Arrays.toString(proverkaInt).contains(subVyr[0]) & Arrays.toString(proverkaInt).contains(subVyr[2])){
            CalcInt calcInt = new CalcInt(subVyr);
            calcInt.perevod();
            result=calcInt.calculate();
            return result;
        } else {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Ошибка : Разные системы счисления");
                System.exit(0);
            }
        return result;
        }
        }

}

