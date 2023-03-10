public class Compte {
    private int numero;
    private String nom;
    private double solde;
    public Compte(int numero, String nom, double solde){
        this.numero=numero;
        this.nom=nom;
        this.solde=solde;
    }
    public void Crediter(double credi){
        solde+=credi;
    }
    public void Debiter(double debit){
        if (solde>=debit)
            solde-=debit;
        else System.out.println("Solde insuffisant.");
    }
    public void afficher(){
        System.out.println("Numéro: "+numero+", nom: "+nom+"solde: "+solde);
    }
}
