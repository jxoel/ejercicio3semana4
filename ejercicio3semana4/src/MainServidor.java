public class MainServidor {
    public static void main(String[] args) {
        Servidor servidor = new Servidor("ServidorWeb", "192.168.1.20");

        System.out.println("Servidor creado: " + servidor.getNombre() + " (ID: " + servidor.getId() + ")");
        System.out.println("¿Está activo?: " + servidor.isActivo());
        System.out.println("Total servidores: " + Servidor.getTotalServidores());
        System.out.println("Servidores activos: " + Servidor.getServidoresActivos());

        servidor.activar();
        System.out.println("Después de activar, ¿está activo?: " + servidor.isActivo());
        System.out.println("Servidores activos: " + Servidor.getServidoresActivos());

        servidor.desactivar();
        System.out.println("Después de desactivar, ¿está activo?: " + servidor.isActivo());
        System.out.println("Servidores activos: " + Servidor.getServidoresActivos());
    }
}