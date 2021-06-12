package app;

import java.time.LocalDate;

public abstract class EpassJovem extends PasseStandard{
    public EpassJovem(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida, DocumentoID docID, LocalDate ddn, String nome, String email) {
        super(saldo, precoViagem, dataCarrega, dataValida, docID, ddn, nome, email);
    }
}

