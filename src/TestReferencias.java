
public class TestReferencias {
	
	   public static void main(String[] args) {

	        Gerente g1 = new Gerente();
	        g1.setNombre("Marcos");
	        g1.setSalario(5000.0);

	        EditorVideo ev = new EditorVideo();
	        ev.setSalario(2500.0);

	        Designer d = new Designer();
	        d.setSalario(2000.0);

	        ControleBonificacion controle = new ControleBonificacion();
	        controle.registrar(g1);
	        controle.registrar(ev);
	        controle.registrar(d);

	        System.out.println(controle.getSuma());

	    }

}
