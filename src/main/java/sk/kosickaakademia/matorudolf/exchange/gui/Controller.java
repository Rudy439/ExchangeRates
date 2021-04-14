package sk.kosickaakademia.matorudolf.exchange.gui;

import sk.kosickaakademia.matorudolf.exchange.calc.CalcExchangeRates;

import javax.swing.text.html.ListView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {

        private static final String[] currency= new String[]{"USD","CHF","GBP","PLN"};
        private Button btn_exchange;
        private TextField txt_eur;
        private ListView classic;
        public TextField txt_usd;
        public TextField txt_chf;
        public TextField txt_gbp;
        public TextField txt_pln;


        public void exchange(ActionEvent actionEvent) {
            CalcExchangeRates calc=new CalcExchangeRates();
            String base_currency=txt_eur.getText();
            if (base_currency.isEmpty()){
                return;
            }
            double base_currency_eur=Double.parseDouble(base_currency);
            calc.calculate(base_currency_eur,currency);
        }
    }
    }
}
