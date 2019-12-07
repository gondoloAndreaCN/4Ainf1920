package it.itis.cuneo;

/**
 * Created by inf.gondoloa1112 on 30/10/2019.
 */
public class Libreria {
    public static final int MAX_LIBRI = 10;
    private Libro[] vlibri;
    private int cntLibro;

    public Libreria(){
        vlibri = new Libro[MAX_LIBRI];
        cntLibro = 0;
    }

    public void addLibro(Libro libro)throws LibreriaPienaEception{
        if(cntLibro>MAX_LIBRI) {
            throw new LibreriaPienaEception(1, "troppi libri!!");
        }
        vlibri[cntLibro] = libro;
        cntLibro++;
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Alice", "Lewis Carrol", "1234564879", InputOutputUtility.convertiDataOraToCalendar("12/10/2019", InputOutputUtility.dfDay));
        Libro libro2 = new Libro("Pinochio", "NON LO SO", "1234564879", InputOutputUtility.convertiDataOraToCalendar("12/10/2019", InputOutputUtility.dfDay));

        Libreria libreria = new Libreria();
        try {
            libreria.addLibro(libro1);
        }catch (LibreriaPienaEception e){
            e.printStackTrace();
        }
        System.out.println(libreria.toString());
    }
}
