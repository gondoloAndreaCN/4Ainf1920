package it.itis.cuneo;

public class Rettangolo {

        //attributi


        private Segmento segmentoAlto;
        private Segmento segmentoBasso;
        private Segmento segmentoDestra;
        private Segmento segmentoSinistra;

        //metodi
        public Rettangolo(int segmentoAlto, int segmentoBasso, int segmentoDestra, int segmentoSinistra){
            this.segmentoAlto = new Segmento(segmentoAlto);
            this.segmentoBasso = new Segmento(segmentoBasso);
            this.segmentoDestra = new Segmento(segmentoDestra);
            this.segmentoSinistra = new Segmento(segmentoSinistra);

        }

    public Rettangolo (Rettangolo rettangolo){
        this.segmentoAlto = new Segmento( rettangolo.getSegmentoAlto());
        this.segmentoBasso =  new Segmento( rettangolo.getSegmentoBasso());
        this.segmentoDestra =  new Segmento( rettangolo.getSegmentoDestra());
        this.segmentoSinistra = new Segmento(rettangolo.getSegmentoSinistra());
    }

    public void setSegmentoAlto(Segmento segmentoAlto){
        this.segmentoAlto = segmentoAlto;
    }

    public Segmento getSegmentoAlto(){
        return segmentoAlto;
    }

    public void setSegmentoBasso(Segmento segmentoBasso){
        this.segmentoBasso = segmentoBasso;
    }

    public Segmento getSegmentoBasso(){
        return segmentoBasso;
    }

    public void setSegmentoDestra(Segmento segmentoDestra){
        this.segmentoDestra = segmentoDestra;
    }

    public Segmento getSegmentoDestra(){
        return segmentoDestra;
    }

    public  void setSegmentoSinistra(Segmento segmentoSinistra){
        this.segmentoSinistra = segmentoSinistra;
    }

    public Segmento getSegmentoSinistra(){
        return segmentoSinistra;
    }

    public boolean equals(Rettangolo rettangolo){
        if(this.segmentoAlto.equals(rettangolo.segmentoBasso())
            && this.getSegmentoBasso().equals(rettangolo.segmentoBasso)
            &&
    }

}
