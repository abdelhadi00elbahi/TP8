import model.Facture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import presentation.FactureControlle;

public class applicationRunner {
    public static void main(String[] args) {

       ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        FactureControlle Fct =( FactureControlle) ctx.getBean("Fuct1");

        Fct.save(new Facture("11"));

    }
}
