package AdicionalFarmacia;

public class Main {
    public static void main(String[] args) {
        Farmacia f = new Farmacia("Farmacia Central");

        Medicamento m1 = new Medicamento("Aspirina", "Bayer", 1200);
        m1.addSintoma("Dolor de cabeza");
        m1.addSintoma("Dolor de cabeza");
        m1.addSintoma("Congestión Nasal");
        m1.addSintoma("Fiebre");

        Medicamento m2 = new Medicamento("Ibuprofeno", "Raffo", 800);
        m2.addSintoma("Dolor muscular");

        Medicamento m3 = new Medicamento("Descongelina", "Bayer", 1800);
        m3.addSintoma("Congestión Nasal");

        f.addMedicamento(m1);
        f.addMedicamento(m2);
        f.addMedicamento(m3);

        System.out.println("Medicamentos Bayer y que contengan 'ina':");
        Condicion cond1 = new CondicionLaboratorio("Bayer");
        Condicion cond2 = new CondicionPalabra("ina");
        Condicion condAnd = new CondicionAnd(cond1, cond2);

        for (Medicamento med : f.buscarMedicamentoCondicion(condAnd)) {
            System.out.println(" - " + med.getNombre());
        }

        System.out.println("\nMedicamentos que traten 'Congestión Nasal' y cuesten menos de 1500:");
        Condicion cond3 = new CondicionSintoma("Congestión Nasal");
        Condicion cond4 = new CondicionPrecio(1500);
        Condicion condAnd2 = new CondicionAnd(cond3, cond4);

        for (Medicamento med : f.buscarMedicamentoCondicion(condAnd2)) {
            System.out.println(" - " + med.getNombre());
        }
    }
}
