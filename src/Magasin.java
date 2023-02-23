import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Magasin {
    private ArrayList<Article> articles;

    public Magasin() {
        this.articles = new ArrayList<Article>();
    }

    public int indiceDe(int code) {
        for (int i = 0; i < articles.size(); i++) {
            if (articles.get(i).getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public void ajouter(Article a) throws Exception {
        if (articles.contains(a)) {
            throw new Exception("This articl is already exist in the store.");
        }
        articles.add(a);
    }

    public boolean supprimer(int code) {
        int index = indiceDe(code);
        if (index != -1) {
            articles.remove(index);
            return true;
        }
        return false;
    }

    public boolean supprimer(Article a) {
        return articles.remove(a);
    }

    public int nombreArticlesEnSolde() {
        int count = 0;
        for (Article a : articles) {
            if (a instanceof ArticleEnSolde) {
                count++;
            }
        }
        return count;
    }

    public void enregistrer(String chemin) throws IOException {
        FileWriter writer = new FileWriter(chemin);
        for (Article a : articles) {
            writer.write(a.toString() + "\n");
        }
        writer.close();
    }
}