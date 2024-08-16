package model;

public class Empleado {
	private final int id;
	private String nombre;
	private int edad;
	
	//Contador
	static int cont=1000;

	//Constructors
	public Empleado() {
        this.id = cont++;
        this.nombre = "sin nombre";
        this.edad = 99;
    }
    
    public Empleado(String name, int age) {
        this.id = cont++;
        this.nombre = name;
        this.edad = age;
    }
	
	// Getters
	int getId() {
		return this.id;
	}
	
	String nombre() {
		return this.nombre;
	}
	
	int edad() {
		return this.edad;
	}


	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
}
