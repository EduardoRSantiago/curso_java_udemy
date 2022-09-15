package Introducao_programacao_orientada_objetos.ex03.entities;

public class Student {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double finalGrade() {
        return nota1 + nota2 + nota3;
    }

    public void yearPass() {
        System.out.printf("FINAL GRADE = %.2f%n", finalGrade());
        if (finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", 60.0 - finalGrade());
        } else {
            System.out.println("PASS");
        }
    }
}
