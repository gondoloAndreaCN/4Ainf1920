package it.itis.cuneo;


public class Prenotazione {
    private String cognome;
    private String nome;
    private String telefono;
    private String cittaPartenza;
    private String cittaArrivo;
    private String data;

    public Prenotazione(String cognome, String nome, String telefono, String cittaPartenza, String cittaArrivo, String data) {
        this.cognome = cognome;
        this.nome = nome;
        this.telefono = telefono;
        this.cittaPartenza = cittaPartenza;
        this.cittaArrivo = cittaArrivo;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Prenotaione{" +
                "cognome='" + cognome + '\'' +
                ", nome='" + nome + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cittaPartenza='" + cittaPartenza + '\'' +
                ", cittaArrivo='" + cittaArrivo + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCittaPartenza() {
        return cittaPartenza;
    }

    public void setCittaPartenza(String cittaPartenza) {
        this.cittaPartenza = cittaPartenza;
    }

    public String getCittaArrivo() {
        return cittaArrivo;
    }

    public void setCittaArrivo(String cittaArrivo) {
        this.cittaArrivo = cittaArrivo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String toCSVString() {
        return cognome + ';' + nome + ';' +
                telefono + ';' + cittaPartenza + ';' +
                cittaArrivo + ';' + data + ';';
    }
}
