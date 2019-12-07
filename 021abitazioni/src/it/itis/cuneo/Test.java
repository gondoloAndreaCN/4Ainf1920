package it.itis.cuneo;

public class Test {



    public static void main(String[] args) {
        Abitazione abitazione = new Abitazione();
        abitazione.setnStanze(InputOutputUtility.leggiNumero());
        abitazione.setSuperficie(InputOutputUtility.leggiNumeroDouble());
        abitazione.setIndirizzo(InputOutputUtility.leggiNome());
        abitazione.setCitta(InputOutputUtility.leggiNome());


    }
}
