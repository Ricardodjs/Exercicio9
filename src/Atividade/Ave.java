
package Atividade;


public class Ave extends Animal {
private boolean voa;
public Ave(String n, boolean v) {
super(n);
setVoa(v);
}
public boolean isVoa() {
return voa;
}
public void setVoa(boolean v) {
this.voa = v;
}
public void talk() {
System.out.println("piu-piu");
}
}    

