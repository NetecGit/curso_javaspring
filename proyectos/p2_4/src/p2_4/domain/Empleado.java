package p2_4.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Empleado {
	private String nombre;
	private String apellido;
	private int edad;
	private Genero genero;
	private Puesto puesto;
	private LocalDate fechaContratacion;
	private double salario;
	private String correo;
	private String direccion;
	private String ciudad;
	private String entidadFederativa;
	private String codigoPostal;

	public static class Builder {

		private String nombre = "";
		private String apellido = "";
		private int edad = 0;
		private Genero genero = Genero.FEMENINO;
		private Puesto puesto = Puesto.PROGRAMADOR;
		private LocalDate fechaContratacion = LocalDate.of(1, 1, 1);
		private double salario = 0;
		private String correo = "";
		private String direccion = "";
		private String ciudad = "";
		private String entidadFederativa = "";
		private String codigoPostal = "";

		public Empleado.Builder nombre(String nombre) {
			this.nombre = nombre;
			return this;
		}

		public Empleado.Builder apellido(String apellido) {
			this.apellido = apellido;
			return this;
		}

		public Empleado.Builder edad(int val) {
			edad = val;
			return this;
		}

		public Empleado.Builder Genero(Genero val) {
			genero = val;
			return this;
		}

		public Empleado.Builder puesto(Puesto val) {
			puesto = val;
			return this;
		}

		public Empleado.Builder fechaContratacion(LocalDate val) {
			fechaContratacion = val;
			return this;
		}

		public Empleado.Builder salario(double val) {
			salario = val;
			return this;
		}

		public Empleado.Builder correo(String val) {
			correo = val;
			return this;
		}

		public Empleado.Builder direccion(String val) {
			direccion = val;
			return this;
		}

		public Empleado.Builder ciudad(String val) {
			ciudad = val;
			return this;
		}

		public Empleado.Builder entidadFederativa(String val) {
			entidadFederativa = val;
			return this;
		}

		public Empleado.Builder codigoPostal(String val) {
			codigoPostal = val;
			return this;
		}

		public Empleado build() {
			return new Empleado(this);
		}
	}

	private Empleado() {
		super();
	}

	private Empleado(Empleado.Builder builder) {
		nombre = builder.nombre;
		apellido = builder.apellido;
		edad = builder.edad;
		genero = builder.genero;
		puesto = builder.puesto;
		fechaContratacion = builder.fechaContratacion;
		salario = builder.salario;
		correo = builder.correo;
		direccion = builder.direccion;
		ciudad = builder.ciudad;
		entidadFederativa = builder.entidadFederativa;
		codigoPostal = builder.codigoPostal;
	}

	public String getnombre() {
		return nombre;
	}

	public String getapellido() {
		return apellido;
	}

	public void setapellido(String name) {
		this.apellido = name;
	}

	public int getedad() {
		return edad;
	}

	public Genero getGenero() {
		return genero;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public LocalDate getfechaContratacion() {
		return fechaContratacion;
	}

	public double getsalario() {
		return salario;
	}

	public String getcorreo() {
		return correo;
	}

	public String getdireccion() {
		return direccion;
	}

	public String getciudad() {
		return ciudad;
	}

	public String getentidadFederativa() {
		return entidadFederativa;
	}

	public String getcodigoPostal() {
		return codigoPostal;
	}

	public String getSummary() {
		return "Nombre: " + nombre + " " + apellido + " " + "Puesto: " + puesto + " " + "salario: " + salario;
	}

	public void print() {
		System.out.println("\nNombre: " + nombre + " " + apellido + "\n" + "edad: " + edad + "\n" + "Genero: " + genero
				+ "\n" + "Puesto: " + puesto + "\n" + "Fecha: " + fechaContratacion + "\n" + "Salario: " + salario
				+ "\n" + "Correo: " + correo + "\n" + "Direccion: " + direccion + "\n" + "Ciudad: " + ciudad + "\n"
				+ "Estado: " + entidadFederativa + "\n" + "CP: " + codigoPostal + "\n");
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " " + apellido + " edad: " + edad + " genero: " + genero + " puesto: " + puesto
				+ " salario: " + salario + " correo: " + correo + "\n";
	}

	public static List<Empleado> creaLista() {
		List<Empleado> personal = new ArrayList<>();

		personal.add(new Empleado.Builder().nombre("Jesús").apellido("Díaz").edad(30).Genero(Genero.MASCULINO)
				.puesto(Puesto.PROGRAMADOR).fechaContratacion(LocalDate.of(2021, 10, 1)).salario(40_000)
				.correo("jesus.diaz@netec.com.mx").build());

		personal.add(new Empleado.Builder().nombre("Mónica").apellido("Maldonado").edad(35).Genero(Genero.FEMENINO)
				.puesto(Puesto.RECEPCIONISTA).fechaContratacion(LocalDate.of(2018, 1, 1)).salario(20_000)
				.correo("monica.maldonado@netec.com.mx").build());

		personal.add(new Empleado.Builder().nombre("Roberto").apellido("Muñiz").edad(38).Genero(Genero.MASCULINO)
				.puesto(Puesto.PROGRAMADOR).fechaContratacion(LocalDate.of(2011, 10, 1)).salario(40_000)
				.correo("roberto.muniz@netec.com.mx").build());

		personal.add(new Empleado.Builder().nombre("Verónica").apellido("Medellín").edad(50).Genero(Genero.FEMENINO)
				.puesto(Puesto.PROGRAMADOR).fechaContratacion(LocalDate.of(2010, 1, 10)).salario(60_000)
				.correo("veronica.medellin@netec.com.mx").build());
		
		personal.add(new Empleado.Builder().nombre("Francisco").apellido("Medellín").edad(63).Genero(Genero.MASCULINO)
				.puesto(Puesto.PROGRAMADOR).fechaContratacion(LocalDate.of(2001, 10, 1)).salario(80_000)
				.correo("francisco.medellin@netec.com.mx").build());

		personal.add(new Empleado.Builder().nombre("Miriam").apellido("Maldonado").edad(23).Genero(Genero.FEMENINO)
				.puesto(Puesto.PROGRAMADOR).fechaContratacion(LocalDate.of(2021, 1, 1)).salario(20_000)
				.correo("miriam.maldonado@netec.com.mx").build());

		personal.add(new Empleado.Builder().nombre("Gabriel").apellido("Guerrero").edad(58).Genero(Genero.MASCULINO)
				.puesto(Puesto.GENERENTE).fechaContratacion(LocalDate.of(2021, 10, 1)).salario(140_000)
				.correo("gg@netec.com.mx").build());

		personal.add(new Empleado.Builder().nombre("Fernando").apellido("Jaimes").edad(50).Genero(Genero.MASCULINO)
				.puesto(Puesto.PROGRAMADOR).fechaContratacion(LocalDate.of(2010, 1, 1)).salario(60_000)
				.correo("fernando.jaimes@netec.com.mx").build());

		personal.add(new Empleado.Builder().nombre("Miguel").apellido("Díaz").edad(36).Genero(Genero.MASCULINO)
				.puesto(Puesto.PROGRAMADOR).fechaContratacion(LocalDate.of(2017, 10, 1)).salario(45_000)
				.correo("miguel.diaz@netec.com.mx").build());

		personal.add(new Empleado.Builder().nombre("Lourdes").apellido("Rubalcaba").edad(20).Genero(Genero.FEMENINO)
				.puesto(Puesto.RECEPCIONISTA).fechaContratacion(LocalDate.of(2008, 1, 1)).salario(60_000)
				.correo("lourdes.rubalcaba@netec.com.mx").build());
		
		return personal;
	}

}