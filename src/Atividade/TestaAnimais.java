
package Atividade;


public class TestaAnimais {
public static void main(String[] args) {
Papagaio p = new Papagaio("Loro", true, "Dá o pé, loro");
p.talk();
p.imprime();
Arara a = new Arara("Arara", true);
a.talk();
a.imprime();
Cachorro c = new Cachorro("Rex", 4, true);
c.talk();
c.imprime();
Vaca v = new Vaca("Mimosa", 4, true);
v.talk();
v.imprime();
}
}    

