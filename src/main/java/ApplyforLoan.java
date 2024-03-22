import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class ApplyforLoan {

    private BankLoan request;
    AccountGenerator generator = new AccountGenerator();
    Date fechaActual = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    LocalDate fechaActual2 = LocalDate.now();
    LocalDate fechaEn5Meses = fechaActual2.plusMonths(5);

    public ApplyforLoan(BankLoan request) {
          this.request = request;
    }




    public Object registerLoad(double amount){
       String moneda = "Dolar US ($) ";
        String number = generator.numAccount();
        String start = sdf.format(fechaActual)+"";
        String end = fechaEn5Meses+"";

        System.out.println("\nMonto "+ amount);
        System.out.println("mondeda: " + moneda);
        System.out.println("numero de solicitud de prestamo: "+ number);
        System.out.println(" Fecha de inicio de Prestamo: "+ start);
        System.out.println("Fecha de Finalizacion de Prestamo: "+ end);


        Loan newLoan = new Loan(
                moneda,
                amount,
                number,
                start,
                end
        );

        //request.addLoan(newLoan);
        request.addLoan(newLoan);


        System.out.println("\n\nrequest registered successfully.");
        return 1 ;
    }
}
