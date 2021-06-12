package app;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Epass {
    private long codigo ;
    private double saldo;
    private double precoViagem;
    private LocalDate dataCarrega;
    private LocalDate dataValida;


    public Epass(double saldo, double precoViagem) {
        this.saldo = saldo;
        this.precoViagem = precoViagem;
    }

    public Epass(double precoViagem) {
        this.precoViagem = precoViagem;
    }

    public Epass(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida) {
        this.saldo = saldo;
        this.precoViagem = precoViagem;
        this.dataCarrega = dataCarrega;
        this.dataValida = dataValida;
    }

    public Epass(double saldo, LocalDate dataCarrega) {
        this.saldo = saldo;
        this.dataCarrega = dataCarrega;
    }

    public long getCodigo() {
        return codigo;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getPrecoViagem() {
        return precoViagem;
    }

    public void setPrecoViagem(double precoViagem) {
        this.precoViagem = precoViagem;
    }

    public LocalDate getDataCarrega() {
        return dataCarrega;
    }

    public void setDataCarrega(LocalDate dataCarrega) {
        this.dataCarrega = dataCarrega;
    }

    public LocalDate getDataValida() {
        return dataValida;
    }

    public void setDataValida(LocalDate dataValida) {
        this.dataValida = dataValida;
    }

    @Override
    public String toString() {
        return "Epass{" +
                "codigo=" + codigo +
                ", saldo=" + saldo +
                ", precoViagem=" + precoViagem +
                ", dataCarrega=" + dataCarrega +
                ", dataValida=" + dataValida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Epass epass = (Epass) o;
        return codigo == epass.codigo && Double.compare(epass.saldo, saldo) == 0 && Double.compare(epass.precoViagem, precoViagem) == 0 && dataCarrega.equals(epass.dataCarrega) && dataValida.equals(epass.dataValida);
    }




}

