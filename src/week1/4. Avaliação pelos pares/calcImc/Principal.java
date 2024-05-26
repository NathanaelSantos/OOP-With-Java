public class Principal {

    public static void main(String[] args) {
    
        Paciente paciente1 = new Paciente(70.5, 1.75);
        Paciente paciente2 = new Paciente(55.0, 1.65);
        Paciente paciente3 = new Paciente(90.0, 1.80);

        System.out.println("Paciente 1:");
        System.out.println("IMC: " + paciente1.calcularIMC());
        System.out.println("Diagnóstico: " + paciente1.diagnostico());
        System.out.println();

        System.out.println("Paciente 2:");
        System.out.println("IMC: " + paciente2.calcularIMC());
        System.out.println("Diagnóstico: " + paciente2.diagnostico());
        System.out.println();

        System.out.println("Paciente 3:");
        System.out.println("IMC: " + paciente3.calcularIMC());
        System.out.println("Diagnóstico: " + paciente3.diagnostico());
    }
}
