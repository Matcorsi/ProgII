package Object;
public class classObject {
    public static void main(String[] args) {

        Objeto pelota = new Pelota("Tango",200,14.0);
        Objeto camiseta = new Camiseta("Estudiantes", 500, 11);

        Camiseta camiseta1 = new Camiseta("Estudiantes", 500, 11);
        Objeto pelota1 = new Pelota("Tango",200,15.0);

        System.out.println(pelota.equals(pelota1));
        System.out.println(camiseta1.equals(camiseta));


        pelota1 = pelota;

        camiseta1.setDorsal(10);

        System.out.println(pelota.equals(pelota1));
        System.out.println(camiseta1.equals(camiseta));


        String string1 = new String("Hello");
        String string2 = new String("Hello");
        System.out.println(string1.equals(string2));


        String palabra1 = "Nylon";
        String palabra2 = "Confort";
        String palabra3 = "Nylon";
        String palabra4 = "Ventilacion";

        System.out.println("La palabra 1 es la misma que la 4: " +  palabra1.equals(palabra4));
        System.out.println("La palabra 1 es la misma que la 3: " +  palabra1.equals(palabra3));
        System.out.println("La palabra 1 es la misma que la 2: " +  palabra1.equals(palabra2));
        System.out.println("La palabra 1 es la misma que la 3: " +  (palabra1 == palabra3));
        

        camiseta.addCaracteristica(palabra4);
        camiseta.addCaracteristica(palabra4);

    }
}
