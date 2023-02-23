public class Article {
    public int code;
    public double prixOrigine;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setPrixOrigine(double prixOrigine) {
        this.prixOrigine = prixOrigine;
    }

    public double getPrixOrigine() {
        return prixOrigine;
    }
    public Article(int code,double prixOrigine){
        this.code=code;
        this.prixOrigine=prixOrigine;
    }

    @Override
    public String toString() {
        return "Article{" + "code=" + code + ", prixOrigine=" + prixOrigine + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return code == article.code && Double.compare(article.prixOrigine, prixOrigine) == 0;
    }
    public double prixArtivcle(){
        return +prixOrigine;
    }
}
