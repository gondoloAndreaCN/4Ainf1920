package it.itis.cuneo;

public class Contenitore {
    public static final int MAX_BOTTIGLIE = 5;
    private Bottiglia[] vbottiglie;
    private int contaBottiglia;

    public Contenitore(){
        vbottiglie = new Bottiglia[MAX_BOTTIGLIE];
        contaBottiglia = 0;
    }

    public void addBottiglia(Bottiglia bottiglia) throws ContenitorePienoException {
        if(contaBottiglia>MAX_BOTTIGLIE){
            throw new ContenitorePienoException(1,"Numero massimo bottiglie");
        }
        vbottiglie[contaBottiglia] = bottiglia;
        contaBottiglia++;
    }

    public static void main(String[] args) {
        Bottiglia bottiglia1 = new Bottiglia("coca-cola",1.5d);
        Bottiglia bottiglia2 = new Bottiglia("sprite",2);

        Contenitore contenitore = new Contenitore();
        try{
            contenitore.addBottiglia(bottiglia1);
        }catch (ContenitorePienoException ex){
            ex.printStackTrace();
        }
        System.out.println(contenitore.toString());
    }
}
