
package Atividade;


public class TestaPessoa {
public static void main(String[] args) {
System.out.println("--Fornecedor--");
Fornecedor f = new Fornecedor("João", "Rua G",
"111-1111", 2500, 2200);
System.out.println(f.obterSaldo());
System.out.println("--Empregado--");
Empregado e = new Empregado("Daniel", "Rua E",
"222-2222", 10, 2000, 8.5);
System.out.println(e.calcularSalario());
System.out.println("--Administrador--");
Administrador a = new Administrador("Lucas", "Rua C",
"333-3333", 10, 3500, 11, 600);
System.out.println(a.calcularSalario());
System.out.println("--Operario--");
Operario o = new Operario("Ana Paula", "Rua D",
"444-4444", 10, 1800, 8.5, 25000, 0.5);
System.out.println(o.calcularSalario());
}
}    

