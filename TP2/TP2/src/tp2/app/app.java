package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class app {
    public static void main(String[] args){
        //criando tester
        TipoDocumento helia = TipoDocumento.CUC;
        LocalDate dataValidade = null;


        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-uuu");
        dataValidade=LocalDate.parse("19-07-2021", formatoData);
        LocalDate dataCarregamento= LocalDate.of(2021,07,3);
        DocumentoID documento1= new DocumentoID("1903", helia);

        EpassStudent passe1= new EpassStudent(30.3, 40.0, dataCarregamento, dataValidade,
                12,"escola Técnica" );
        EpassStudent passe2= new EpassStudent(200.0, 40.0, dataCarregamento, dataValidade, passe1);

        passe2.carregar(40);
        passe1.carregar(100);
        passe1.pagarViagem();
        passe2.pagarViagem();
        passe1.checkValidade();
        passe2.checkValidade();

    }
}
