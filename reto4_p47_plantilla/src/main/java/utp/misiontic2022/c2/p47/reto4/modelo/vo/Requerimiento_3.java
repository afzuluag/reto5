package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Requerimiento_3 {
    private Integer idCompra;
    private String anoCompra;

    public Requerimiento_3(){
        
    }

    public Requerimiento_3(int pIdCompra){
        this.idCompra=pIdCompra;
    }
  
    public Requerimiento_3(int pIdCompra, String pAnoCompra){
        this.idCompra=pIdCompra;
        this.anoCompra = pAnoCompra;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getAnoCompra() {
        return anoCompra;
    }

    public void setAnoCompra(String anoCompra) {
        this.anoCompra = anoCompra;
    }
    // Su código
}