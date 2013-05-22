/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelView;

import Model.Expense;
import Model.ExpenseRecord;
import Model.ExpenseType;
import Model.PaymentMean;
import Persistance.IExpenseTypeRepository;
import Persistance.IM.ExpenseTypeRepository;
import Persistance.IM.PaymentMeansRepository;
import Persistance.IPaymentMeansRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mcatia
 */
public class ExpensesperMonthDTOTest {

    public ExpensesperMonthDTOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getExpenseType method, of class ExpensesperMonthDTO.
     */
    @Test
    public void testGetExpenseType() {
        System.out.println("getExpenseType");
        ExpensesperMonthDTO instance = new ExpensesperMonthDTO("Vestuario", null, null);
        String expResult = "Vestuario";
        String result = instance.getExpenseType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getExpenseTotal method, of class ExpensesperMonthDTO.
     */
    @Test
    public void testGetExpenseTotal() {
        System.out.println("getExpenseTotal");
        ExpensesperMonthDTO instance = new ExpensesperMonthDTO("", (new BigDecimal(30)), null);
        BigDecimal expResult = new BigDecimal(30);
        BigDecimal result = instance.getExpenseTotal();
        assertEquals(expResult, result);
    }

    /**
     * Test of getExpenses method, of class ExpensesperMonthDTO.
     */
    @Test
    public void testGetExpenses() {
        System.out.println("getExpenses");
//        IExpenseTypeRepository repoType = new ExpenseTypeRepository();
//        IPaymentMeansRepository repoPay = new PaymentMeansRepository();
        Expense e = new Expense("Calcas", new Date(), new BigDecimal(30),
                new ExpenseType("Vestuario"), new PaymentMean(1) {});
        
        List<Expense> list = new ArrayList<>();
        list.add(e);

        ExpensesperMonthDTO instance =
                new ExpensesperMonthDTO("", null, new ExpenseRecord(list));
        ExpenseRecord expResult = new ExpenseRecord(list);
        ExpenseRecord result = instance.getExpenses();
        assertEquals(expResult, result);
    }
}