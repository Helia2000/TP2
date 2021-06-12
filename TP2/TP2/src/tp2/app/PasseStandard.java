package app;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;


public abstract class  PasseStandard extends Epass {
    private Titular titular;
    private int pontos;
    private int numeroViagens;
    private String chavesValida;




    public PasseStandard(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValidade) {
        super(saldo, precoViagem,dataCarrega,dataValidade);
                        this.chavesValida = getTitular().getNome().substring(0,5);
        this.pontos=0;
        this.numeroViagens=0;
        //this.chavesValida=;
    }

    public PasseStandard(double saldo, double precoViagem, LocalDate
            dataCarrega,LocalDate dataValida ,DocumentoID docID, LocalDate ddn , String
            nome ,String email) { super(saldo, precoViagem, dataCarrega,dataValida);
            this.pontos=0;
            this.numeroViagens=0;

    }

    public PasseStandard(double saldo, double precoViagem, LocalDate
            dataCarrega,LocalDate dataValida , DocumentoID docID, LocalDate ddn , String
            nome ,String email, String CodigoDoc, TipoDocumento tipoDoc, String Morada, int Telefone) {

        super(saldo, precoViagem, dataCarrega,dataValida);
        this.pontos=0;
        this.numeroViagens = 0;
        this.titular = new Titular(docID, nome, ddn,Morada, email,Telefone);
    }


    public Titular getTitular() {

        return titular;
    }

    public int getPontos() {

        return pontos;
    }

    public String getChavesValida() {

        return chavesValida;
    }

    public void setChavesValida(String chavesValida) {

        this.chavesValida = chavesValida;
    }

    protected abstract String gerarchave(String nome);

    public void gerarchave(String nome,LocalDate data, int codigo){

        String invert;
        String chave;
        String inverter = new StringBuffer(nome).reverse().toString();
        String palavra1= inverter.substring(2,5);
        String palavra2= nome.substring(0,5);
        String palavra3= new StringBuilder(palavra2).reverse().toString();

        chave= palavra1+palavra2+data+codigo;

        //return chave;

    }
    public void pagarViagem(double valor) {
    }



    public void carregar(double valor) {

    }
    
}


