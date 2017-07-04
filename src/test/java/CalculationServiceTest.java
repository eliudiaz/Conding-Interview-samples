import com.osigu.calculation.CalculationService;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by eliud on 6/9/2017.
 */
public class CalculationServiceTest {

    public static final String ADD = "ADD";
    public static final String SUBSTRACT = "SUBSTRACT";

    @Test
    public void calculate_when_happy_path() {
        CalculationService sc = new CalculationService();
        BigDecimal result = sc.calculate(BigDecimal.ONE, BigDecimal.ONE, SUBSTRACT);
        Assert.assertThat(result, CoreMatchers.is(BigDecimal.ZERO));
    }

//    public void calculate_add_when_shittl....

}
