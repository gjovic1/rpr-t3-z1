package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;

    public enum Grad {
        TRAVNIK, ORASJE, ZENICA, SARAJEVO, LIVNO, TUZLA,
        MOSTAR, BIHAC, GORAZDE, SIROKIBRIJEG, BRCKO, MRKONJICGRAD,
        BANJALUKA, PRIJEDOR, DOBOJ, SAMAC, BIJELJINA, ZVORNIK, PALE,
        FOCA, TREBINJE
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public FiksniBroj(Grad grad, String broj){
        this.grad=grad;
        this.broj=broj;
    }

    @Override
    public String ispisi() {
        String is = "";
        switch (grad)
        {
            case TRAVNIK:
                is+="030/";
                break;
            case ORASJE:
                is+="031/";
                break;
            case ZENICA:
                is+="032/";
                break;
            case SARAJEVO:
                is+="033/";
                break;
            case LIVNO:
                is+="034/";
                break;
            case TUZLA:
                is+="035/";
                break;
            case MOSTAR:
                is+="036/";
                break;
            case BIHAC:
                is+="037/";
                break;
            case GORAZDE:
                is+="038/";
                break;
            case SIROKIBRIJEG:
                is+="039/";
                break;
            case BRCKO:
                is+="049/";
                break;
            case MRKONJICGRAD:
                is+="050/";
                break;
            case BANJALUKA:
                is+="051/";
                break;
            case PRIJEDOR:
                is+="052/";
                break;
            case DOBOJ:
                is+="053/";
                break;
            case SAMAC:
                is+="054/";
                break;
            case BIJELJINA:
                is+="055/";
                break;
            case ZVORNIK:
                is+="056/";
                break;
            case PALE:
                is+="057/";
                break;
            case FOCA:
                is+="058/";
                break;
            case TREBINJE:
                is+="059/";
                break;
        }
        is+=broj;
        return is;
    }

    @Override
    public int hashCode(){
        return 0;
    }

}
