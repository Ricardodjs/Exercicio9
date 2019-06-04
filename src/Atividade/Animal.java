
package Atividade;



public class Animal {
private String nome;
public Animal(String n) {
setNome(n);
}
public void imprime() {
System.out.println("Nome do animal: " + getNome());
}
public void talk() {
}
public void setNome(String nome) {
this.nome = nome;
}
public String getNome() {
return this.nome;
}
}    

