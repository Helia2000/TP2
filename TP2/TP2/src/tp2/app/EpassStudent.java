package app;

import ui.TituloTrasnporte;

import java.time.LocalDate;

public class EpassStudent extends Epass implements TituloTrasnporte {
    private int ano;
    private String escola;
    private Zona[] zonas;

    /*implementação de classes Titulo trasporte*/

    @Override
    public void carregar(double saldo) {
        System.out.println("Saldo  "+getSaldo());
        if (saldo < 0) {
            System.out.println("O valor introduzido não é válido");
        }else{
                this.setSaldo(getSaldo()+saldo);
                this.setDataCarrega(LocalDate.now());
                this.setDataValida(getDataCarrega().plusDays(30));
            System.out.println(getSaldo());
            };
        }


    @Override
    public void pagarViagem() {
        int precoFixo= 20;
        System.out.println(getSaldo());
        if(getSaldo() < 20){
            System.out.println("O saldo não permite pagar a viagem ");
        }
        else{
            setSaldo(getSaldo()-20);
            System.out.println(getSaldo());
        }

    }

    @Override
    public boolean checkValidade() {

        if(LocalDate.now().isAfter(getDataValida())){
            System.out.println("O saldo expirou");
            return false;
        }
        return true;

    }

    @Override
    public boolean passarSaldo() {

        return false;
    }

    //getter

    public int getAno() {

        return ano;
    }

    public String getEscola() {

        return escola;
    }

    public Zona[] getZonas() {

        return zonas;
    }

    //getter

    public void setAno(int ano) {

        this.ano = ano;
    }

    public void setEscola(String escola) {

        this.escola = escola;
    }

    public void addZona(String nome){

    }
    public void addZ(Zona zonaViagem){

    }


        //métodos construtor


    public EpassStudent(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida, int ano, String escola) {
        super(saldo, precoViagem, dataCarrega, dataValida);
        this.ano = ano;
        this.escola = escola;
    }

    public EpassStudent(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida,EpassStudent outro) {
        super(saldo, precoViagem, dataCarrega, dataValida);

    }
}
