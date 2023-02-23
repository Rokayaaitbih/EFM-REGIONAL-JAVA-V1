public class Main {
    public static void main(String[] args) throws Exception {
        Magasin magasin1 = new Magasin();
        magasin1.ajouter(new Article(456, 12999.2));
        magasin1.ajouter(new Article(44154, 999.0));
        magasin1.ajouter(new Article(54178, 149.0));
        magasin1.ajouter(new Article(8874847, 349.99));
        magasin1.ajouter(new ArticleEnSolde(245565, 200.0, 10.0));
        magasin1.ajouter(new ArticleEnSolde(345555, 300.0, 65.0));
        magasin1.ajouter(new ArticleEnSolde(65454, 589.99, 50.0));
        magasin1.ajouter(new ArticleEnSolde(777777, 99.99, 9.99));
        magasin1.ajouter(new ArticleEnSolde(9545346, 100.0, 95.0));
        System.out.println(magasin1.nombreArticlesEnSolde());
        System.out.println(magasin1.supprimer(777777));
        System.out.println(magasin1.indiceDe(2));
        magasin1.enregistrer("src\\data.txt");
    }
}