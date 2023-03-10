public class TestCompte {
    public static void main(String[] args) {
        Compte c1=new Compte(5201,"张三丰",9999.99);
        Compte c2=new Compte(5201, "张无忌",8888.88);
        Compte c3=new Compte(5203,"张翠山",1111.11);
        c1.Debiter(1000);
        c2.Crediter(1000);
        c3.Debiter(2000);
        c1.afficher();
        c2.afficher();
        c3.afficher();
    }
}