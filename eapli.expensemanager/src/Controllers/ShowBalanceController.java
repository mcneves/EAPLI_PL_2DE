package Controllers;

import Model.AccountServices;
import Model.Expense;
import Persistance.IM.ExpenseRepository;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @Luis
 */
public class ShowBalanceController {

    public ShowBalanceController() {
    }

    public BigDecimal ShowBalance() {
        AccountServices ac = new AccountServices();
        return ac.getBalance();
    }
}
