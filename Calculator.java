class Calculator {
    int result;
    int a1;
    int a2;
    String znak;

    public Calculator(int a1, int a2, String znak) {
        this.a1 = a1;
        this.a2 = a2;
        this.znak = znak;
    }

    public int calculate() {
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
        }
        return result;
            }
        }




