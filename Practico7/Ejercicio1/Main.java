package Practico7.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        
        // 🔹 Crear enfermedades
        Enfermedad cochinilla = new Enfermedad("Cochinilla");
        cochinilla.addEstados_patologicos("deshidratacion");
        cochinilla.addEstados_patologicos("hojas amarillas");
        
        Enfermedad mildiu = new Enfermedad("Mildiu");
        mildiu.addEstados_patologicos("hojas mordidas");
        mildiu.addEstados_patologicos("caida de frutos");
        
        Enfermedad roya = new Enfermedad("Roya");
        roya.addEstados_patologicos("hojas amarillas");
        roya.addEstados_patologicos("manchas naranjas");

        // 🔹 Crear cultivos
        Cultivo soja = new Cultivo("Soja");
        soja.addEnfermedadFrecuente(cochinilla);
        soja.addEnfermedadFrecuente(mildiu);

        Cultivo maiz = new Cultivo("Maiz");
        maiz.addEnfermedadFrecuente(roya);

        // 🔹 Crear productos
        Producto agroA = new Producto("AgroPlus");
        agroA.addPatologia(roya);
        agroA.addPatologia(mildiu);
        agroA.addPatologia(cochinilla);
        agroA.addCuidado(maiz); // se desaconseja usar en maíz

        Producto agroB = new Producto("FertiGreen");
        agroB.addPatologia(roya);
        agroB.addPatologia(cochinilla);

        Producto agroC = new Producto("CultiMax");
        agroC.addPatologia(cochinilla);
        
        // 🔹 Crear empresa y registrar productos y cultivos
        EmpresaAgricola empresa = new EmpresaAgricola("Campo Limpio");
        empresa.addProducto(agroA);
        empresa.addProducto(agroB);
        empresa.addProducto(agroC);
        empresa.addCultivos(soja);
        empresa.addCultivos(maiz);

        // 🔹 Buscar agroquímicos que tratan una enfermedad específica
        System.out.println("Agroquímicos que tratan Cochinilla:");
        Condicion condCochinilla = new CondicionEnfermedad(cochinilla);
        for (Producto p : empresa.getProductosQueTratan(condCochinilla)) {
            System.out.println(" - " + p.getNombre());
        }

        // 🔹 Buscar agroquímicos que pueden usarse en un cultivo y tratar una enfermedad
        System.out.println("\nAgroquímicos que pueden tratar Roya en Maíz:");
        Condicion condCultivoMaiz = new CondicionCultivo(maiz);
        Condicion condEnfermedadRoya = new CondicionEnfermedad(roya);
        Condicion condCombinada = new CondicionAnd(condCultivoMaiz, condEnfermedadRoya);

        for (Producto p : empresa.getProductosQueTratan(condCombinada)) {
            System.out.println(" - " + p.getNombre());
        }

        // 🔹 Comprobar si un cultivo puede usar un producto
        System.out.println("\n¿La Soja puede usar AgroPlus?: " + soja.puedeUtilizar(agroA));
        System.out.println("¿El Maíz puede usar AgroPlus?: " + maiz.puedeUtilizar(agroA));
    }
}
