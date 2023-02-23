public class ArticleEnSolde extends Article{
    public ArticleEnSolde(int code, double prixOrigine) {
        super(code, prixOrigine);
    }
    public double remise;

    public double setRemise(double remise) {
        if(remise==prixOrigine){
            return +prixOrigine *0.90 ;
        }
        this.remise = remise;
        return remise;
    }

    public double getRemise() {
        return remise;
    }
    public ArticleEnSolde(int code,double prixOrigine,double remise){
        super(code, prixOrigine);
        this.remise=remise;
    }

    @Override
    public double prixArtivcle() {
        return super.prixArtivcle() +remise;
    }

    @Override
    public String toString() {
        return "ArticleEnSolde{" +
                "remise=" + remise +
                '}';
    }
}

 