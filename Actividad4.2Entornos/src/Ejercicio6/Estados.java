package Ejercicio6;

public class Estados {
    public static int calc(){
        return 2 * basis(amt) + extra(amt) * 1.05;
    }
    public static void estado() {



    String state = null;
        if (state == "TEXAS") {
            datos();
        } else if ((state == "OHIO") || (state == "MAINE")) {
            datos2(state);
            int points;
            if (state == "OHIO")
               points = 2;
        } else {
            datos3(state);
        }
    }

    private static void datos() {
      int TX_RATE =0;
      int  rate = TX_RATE;
      int base = 0;
      int  amt = base * TX_RATE;
      calc();
    }

    private static void datos2(String state) {

        int  rate = (state == "OHIO") ? OH_RATE : MN_RATE;
        int  amt = base * rate;
        calc();

    }

    private static void datos3(String state) {
        //rate = 1;
        //amt = base;
        calc();
    }

}



